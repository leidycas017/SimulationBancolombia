package co.edu.udea.certificacion.calidad.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.edu.udea.certificacion.calidad.userinterfaces.UsuarioPage.*;
import static co.edu.udea.certificacion.calidad.userinterfaces.UsuarioPage.DIA;

public class ElegirFecha implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(FECHA));
        actor.attemptsTo(Click.on(ANIO));
        actor.attemptsTo(Click.on(MES));
        actor.attemptsTo(Click.on(DIA));
    }

    public static ElegirFecha findItAndGo(){
        return Tasks.instrumented(ElegirFecha.class);
    }
}
