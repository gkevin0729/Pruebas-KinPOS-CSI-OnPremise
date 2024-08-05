package prueba.banistmo.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import prueba.banistmo.tasks.IngresarPagina;
import prueba.banistmo.tasks.Login;


import static net.serenitybdd.screenplay.actors.OnStage.*;
import static prueba.banistmo.userinterface.PaginaCSIObje.BTN_ENTRAR;

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
    @Entonces("deberia ver la pantalla principal del CSI")
    public void deberiaVerLaPantallaPrincipalDelCSI() {

    }


}








