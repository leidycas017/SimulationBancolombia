package co.edu.udea.certificacion.calidad.tasks;

import co.edu.udea.certificacion.calidad.interactions.SimulacionPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class FindThe implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(SimulacionPage.findItAndGo());
    }

    public static FindThe SimulacionPage(){
        return Tasks.instrumented(FindThe.class);
    }
}
