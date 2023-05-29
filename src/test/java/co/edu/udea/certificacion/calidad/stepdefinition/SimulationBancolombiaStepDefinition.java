package co.edu.udea.certificacion.calidad.stepdefinition;

import co.edu.udea.certificacion.calidad.interactions.ContinuarSimulador;
import co.edu.udea.certificacion.calidad.interactions.ElegirFecha;
import co.edu.udea.certificacion.calidad.interactions.Responder;
import co.edu.udea.certificacion.calidad.interactions.Simular;
import co.edu.udea.certificacion.calidad.questions.Validation;
import co.edu.udea.certificacion.calidad.questions.ValidationDos;
import co.edu.udea.certificacion.calidad.tasks.EnterThe;
import co.edu.udea.certificacion.calidad.tasks.FindThe;
import co.edu.udea.certificacion.calidad.tasks.IngresarPlazo;
import co.edu.udea.certificacion.calidad.tasks.OpenThe;
import co.edu.udea.certificacion.calidad.userinterfaces.UsuarioPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static co.edu.udea.certificacion.calidad.userinterfaces.UsuarioPage.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.IsEqual.equalTo;


public class SimulationBancolombiaStepDefinition {

    @Managed(driver= "chrome")
    public WebDriver driver;

    private Actor usuario = Actor.named("Usuario");

    @Before
    public void preStage(){
        driver.manage().window().maximize();
        usuario.can(BrowseTheWeb.with(driver));
    }
    @Given("^que he presionado el boton simular en la pagina de creditos de consumo de bancolombia$")
    public void queHePresionadoElBotonSimularEnLaPaginaDeCreditosDeConsumoDeBancolombia() {

        usuario.attemptsTo(OpenThe.Browser(new UsuarioPage()),Click.on(SIMULAR));
    }


    @When("^presiono el boton continuar en la pagina del simulador$")
    public void presionoElBotonContinuarEnLaPaginaDelSimulador() {
        usuario.attemptsTo(ContinuarSimulador.findItAndGo());
    }

    @When("^puedo responder la pregunta,sabes cuanto dinero necesitas, seleccionando la opcion si$")
    public void puedoResponderLaPreguntaSabesCuantoDineroNecesitasSeleccionandoLaOpcionSi() {
        usuario.attemptsTo(Responder.findItAndGo());
    }

    @And("^puedo ingresar un monto entre 1.000.000 y 500.000.000")
    public void puedoIngresarUnMontoEntreY() {
        usuario.attemptsTo(EnterThe.SimulacionPage());
    }

    @And("^puedo ingresar un plazo entre 48 y 84 meses")
    public void puedoIngresarUnPlazoEntreYMeses() {
        usuario.attemptsTo(IngresarPlazo.SimulacionPage());
    }

    @And("^puedo seleccionar una fecha de nacimiento$")
    public void puedoSeleccionarUnaFechaDeNacimiento() {
        usuario.attemptsTo(ElegirFecha.findItAndGo());
    }

    @And("^puedo seleccionar el boton simular$")
    public void puedoSeleccionarElBotonSimular() {
        usuario.attemptsTo(Simular.findItAndGo());
    }

    @Then("^puedo ver las opciones para credito de libre inversion$")
    public void puedoVerLasOpcionesParaCreditoDeLibreInversion() {
        usuario.should(seeThat(Validation.simulation(), equalTo(true)));
    }

    @Given("^que he ingresado el usuario y contrasena$")
    public void queHeIngresadoElUsuarioYContrasena() {
        usuario.attemptsTo(OpenThe.Browser(new UsuarioPage()));
        usuario.attemptsTo(Enter.theValue("jonathan1@fakemail.com").into(USUARIO));
        usuario.attemptsTo(Enter.theValue("test123").into(CONTRASENA));
    }

    @When("^presiono el boton ingresar$")
    public void presionoElBotonIngresar() {
        usuario.attemptsTo(Click.on(INGRESAR));
    }


    @When("^presiono el boton pagar de uno de los creditos pendientes$")
    public void presionoElBotonPagarCreditoPendiente() {
        usuario.attemptsTo(Click.on(PAGAR));
    }

    @When("^puedo ingresar el valor a pagar$")
    public void puedoIngresarElValorAPagar() {
        usuario.attemptsTo(Enter.theValue("4000000").into(VALOR_CUOTA));

    }

    @When("^presiono el boton pagar$")
    public void presionoElBotonPagar() {
        usuario.attemptsTo(Click.on(PAGAR2));
    }

    @Then("^puedo ver la cantidad de cuotas pagas y restantes$")
    public void puedoVerLaCantidadDeCuotasPagasYRestantes() {
        //usuario.should(seeThat(ValidationDos.simulationDos(), equalTo(true)));
    }


}
