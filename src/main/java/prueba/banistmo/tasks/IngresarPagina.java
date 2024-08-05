package prueba.banistmo.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.waits.WaitUntil;
import prueba.banistmo.userinterface.PaginaCsiOnPremise;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static prueba.banistmo.userinterface.PaginaCsiOnPremise.BTN_AVANZAR;
import static prueba.banistmo.userinterface.PaginaCsiOnPremise.LINK_CSI;


public class IngresarPagina implements Task {
    private PaginaCsiOnPremise paginaMaxTime;

    public static Performable paginaMaxTime() {
        return Tasks.instrumented(IngresarPagina.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Open.browserOn(paginaMaxTime));
        actor.attemptsTo(Click.on(BTN_AVANZAR));
        actor.attemptsTo(
                WaitUntil.the(BTN_AVANZAR, isVisible()).forNoMoreThan(2000).seconds());
        actor.attemptsTo(Click.on(LINK_CSI));

    }
}
