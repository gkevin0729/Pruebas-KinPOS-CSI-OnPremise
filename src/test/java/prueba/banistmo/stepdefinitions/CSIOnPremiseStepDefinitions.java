package prueba.banistmo.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.waits.WaitUntil;
import prueba.banistmo.LoginCSI.questions.VerificarPaginaHome;
import prueba.banistmo.LoginCSI.tasks.IngresarPagina;
import prueba.banistmo.LoginCSI.tasks.Login.Login;
import prueba.banistmo.LoginCSI.userinterface.LinkCsiOnPremise;


import static net.bytebuddy.matcher.ElementMatchers.is;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static prueba.banistmo.LoginCSI.userinterface.PaginaCSIObje.BTN_ENTRAR;
import static prueba.banistmo.LoginCSI.userinterface.PaginaCSIObje.TEXTO_PAGINA_INICIO;

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
                WaitUntil.the(TEXTO_PAGINA_INICIO, isVisible()).forNoMoreThan(10).seconds()  // Aquí puedes usar cualquier elemento o dejarlo vacío
        );

        // Ahora se realiza la validación de la URL
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(
                        "La URL contiene la palabra 'Home'",
                        VerificarPaginaHome.verifica(),
                        equalTo(true)
                )
        );

    }


}








