package co.edu.udea.certificacion.calidad.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.edu.udea.certificacion.calidad.userinterfaces.UsuarioPage.TEXT_UDEA_PAGE;
import static co.edu.udea.certificacion.calidad.userinterfaces.UsuarioPage.VALIDACION;
import static co.edu.udea.certificacion.calidad.utils.Constantes.TEXT_TO_VALIDATE;

public class Validation implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        String titulo = Text.of(VALIDACION).viewedBy(actor).asString();
        if(titulo.equalsIgnoreCase(TEXT_TO_VALIDATE)){
            return true;
        }else{
            return false;
        }
    }

    public static Validation simulation(){
        return new Validation();
    }

}
