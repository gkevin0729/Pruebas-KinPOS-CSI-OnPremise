package prueba.banistmo.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.waits.WaitUntil;
import prueba.banistmo.LoginCSI.questions.Login.VerificarPaginaHome;
import prueba.banistmo.LoginCSI.tasks.IngresarPagina;
import prueba.banistmo.LoginCSI.tasks.Login.Login;
import prueba.banistmo.LoginCSI.tasks.Login.PaginaOlvidoCredenciales;


import static net.bytebuddy.matcher.ElementMatchers.is;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static prueba.banistmo.LoginCSI.userinterface.PaginaCSIObje.*;
import static prueba.banistmo.LoginCSI.userinterface.PaginaCSIObje.LINK_PERFIL;

public class CSIOnPremiseStepDefinitions {

    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
        theActorCalled("Kevin");

    }

    @Dado("que me encuentro en la pagina de inicio de sesion del CSI")
    public void queMeEncuentroEnLaPaginaDeInicioDeSesionDelCSI() {
        theActorCalled("Kevin").wasAbleTo(IngresarPagina.paginaMaxTime());
    }
    @Cuando("ingrese mis credenciales")
    public void ingreseMisCredenciales() {
        OnStage.theActorInTheSpotlight().attemptsTo(Login.conDatos());
    }
    @Cuando("haga clic en el boton Entrar")
    public void hagaClicEnElBoton() {
        theActorCalled("Kevin").attemptsTo(Click.on(BTN_ENTRAR));


    }

    @Entonces("valido que aparezca la pantalla del home de CSI")
    public void ValidoQueAparezcaLaPantallaDelHomeDeCSI() {
        theActorCalled("Kevin").attemptsTo(
                WaitUntil.the(TEXTO_PAGINA_INICIO, isVisible()).forNoMoreThan(10).seconds());

        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(
                        "La URL contiene la palabra 'Home'",
                        VerificarPaginaHome.verifica(),
                        equalTo(true)
                )
        );
        theActorCalled("Kevin").attemptsTo(Click.on(LINK_PERFIL));
        theActorCalled("Kevin").attemptsTo(Click.on(BTN_SALIR));

    }


    @Dado("que este en la pagina de ayuda")
    public void queEsteEnLaPaginaDeAyuda() {
        theActorCalled("Kevin").wasAbleTo(IngresarPagina.paginaMaxTime());
        theActorCalled("Kevin").attemptsTo(Click.on(BTN_OLVIDO));
        theActorCalled("Kevin").attemptsTo(Click.on(BTN_OLVIDO2));
    }
    @Cuando("ingrese user y email")
    public void ingreseUserYEmail() {
        OnStage.theActorInTheSpotlight().attemptsTo(PaginaOlvidoCredenciales.conDatos());

    }
    @Cuando("haga click en el boton de enviar")
    public void hagaClickEnElBotonDeEnviar() {

    }
    @Entonces("se debe mostrar una alerta que se envio el correo de restablecimiento")
    public void seDebeMostrarUnaAlertaQueSeEnvioElCorreoDeRestablecimiento() {

    }
}








