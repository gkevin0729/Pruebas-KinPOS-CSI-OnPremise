package prueba.banistmo.tasks;

import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;





public class NavegarPaginaCSI implements Task {



    public static Performable navegarPaginaMaxTime(){
        return Tasks.instrumented(NavegarPaginaCSI.class);

    }


    @Override
    public <T extends Actor> void performAs(T actor){



    }
}
