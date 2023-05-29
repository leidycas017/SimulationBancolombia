package co.edu.udea.certificacion.calidad.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.edu.udea.certificacion.calidad.userinterfaces.UsuarioPage.MONTO;
import static co.edu.udea.certificacion.calidad.userinterfaces.UsuarioPage.PLAZO;

public class IngresarPlazo implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(RandomValues.getMonths()).into(PLAZO));
    }

    public static IngresarPlazo SimulacionPage(){
        return Tasks.instrumented(IngresarPlazo.class);
    }
}
