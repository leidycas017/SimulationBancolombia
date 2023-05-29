package co.edu.udea.certificacion.calidad.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.edu.udea.certificacion.calidad.userinterfaces.UsuarioPage.MONTO;

public class EnterThe implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(RandomValues.getAmountMoney()).into(MONTO).thenHit(Keys.RETURN));
    }

    public static EnterThe SimulacionPage(){
        return Tasks.instrumented(EnterThe.class);
    }
}
