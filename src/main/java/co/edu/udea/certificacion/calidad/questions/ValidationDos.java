package co.edu.udea.certificacion.calidad.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.edu.udea.certificacion.calidad.userinterfaces.UsuarioPage.VALIDACIONDOS;
import static co.edu.udea.certificacion.calidad.utils.Constantes.TEXT_TO_VALIDATEDOS;

public class ValidationDos implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        String titulo = Text.of(VALIDACIONDOS).viewedBy(actor).asString();
        if(titulo.contains(TEXT_TO_VALIDATEDOS)){
            return true;
        }else{
            return false;
        }
    }

    public static ValidationDos simulationDos(){
        return new ValidationDos();
    }
}
