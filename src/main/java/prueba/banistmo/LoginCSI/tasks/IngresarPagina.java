package prueba.banistmo.LoginCSI.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.waits.WaitUntil;
import prueba.banistmo.LoginCSI.userinterface.LinkCsiOnPremise;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class IngresarPagina implements Task {
    private LinkCsiOnPremise paginaMaxTime;

    public static Performable paginaMaxTime() {
        return Tasks.instrumented(IngresarPagina.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Open.browserOn(paginaMaxTime));
        actor.attemptsTo(Click.on(LinkCsiOnPremise.BTN_AVANZAR));
        actor.attemptsTo(
                WaitUntil.the(LinkCsiOnPremise.BTN_AVANZAR, isVisible()).forNoMoreThan(2000).seconds());
        actor.attemptsTo(Click.on(LinkCsiOnPremise.LINK_CSI));

    }
}
