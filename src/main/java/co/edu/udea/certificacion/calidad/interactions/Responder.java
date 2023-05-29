package co.edu.udea.certificacion.calidad.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.edu.udea.certificacion.calidad.userinterfaces.UsuarioPage.CONTINUAR;
import static co.edu.udea.certificacion.calidad.userinterfaces.UsuarioPage.RADIOBUTTON_SI;

public class Responder implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(RADIOBUTTON_SI));
    }

    public static Responder findItAndGo(){
        return Tasks.instrumented(Responder.class);
    }
}
