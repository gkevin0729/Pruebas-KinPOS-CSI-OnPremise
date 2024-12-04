package prueba.banistmo.LoginCSI.questions.Login;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static prueba.banistmo.LoginCSI.userinterface.PaginaCSIObje.LINK_PERFIL;


public class VerificarPaginaHome implements Question<Boolean> {

    public static VerificarPaginaHome verifica() {
        return new VerificarPaginaHome();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean resultado = false;
        String textURL = "Home";
        String urlText = null;

        try {

            urlText = Serenity.getWebdriverManager().getWebdriver().getCurrentUrl();


            System.out.println("URL obtenida: " + urlText);


            if (urlText.contains("#")) {
                urlText = urlText.substring(urlText.indexOf("#") + 1);
            }


            urlText = urlText.replaceAll(" +", " ");

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }


        if (urlText != null && urlText.contains(textURL)) {
            resultado = true;
        }

        return resultado;

    }
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LINK_PERFIL));
        actor.attemptsTo(WaitUntil.the(LINK_PERFIL, isVisible()).forNoMoreThan(10).seconds());
    }

}
