package prueba.banistmo.LoginCSI.tasks.Login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import javax.swing.*;

import static prueba.banistmo.LoginCSI.userinterface.PaginaCSIObje.*;

public class PaginaOlvidoCredenciales implements Task {
    private final String usuario;
    private final String email;


    public PaginaOlvidoCredenciales(String usuario, String email) {
        this.usuario = usuario;
        this.email = email;
    }


    public static PaginaOlvidoCredenciales conDatos() {
        String usuario = JOptionPane.showInputDialog("Ingrese su credencial de usuario:");
        String email = JOptionPane.showInputDialog("Ingrese su contraseña:");


        return new PaginaOlvidoCredenciales(usuario, email);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(usuario).into(USUARIO_RECUPERACION));
        actor.attemptsTo(
                Enter.theValue(email).into(EMAIL_RECUPERACION));
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



    }
}
