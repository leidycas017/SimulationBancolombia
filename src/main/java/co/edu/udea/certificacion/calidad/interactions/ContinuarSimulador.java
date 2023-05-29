package co.edu.udea.certificacion.calidad.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.edu.udea.certificacion.calidad.userinterfaces.UsuarioPage.CONTINUAR;

public class ContinuarSimulador implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CONTINUAR));
    }

    public static ContinuarSimulador findItAndGo(){
        return Tasks.instrumented(ContinuarSimulador.class);
    }
}
