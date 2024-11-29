package prueba.banistmo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import javax.swing.*;

import static prueba.banistmo.userinterface.PaginaCSIObje.*;

public class Login implements Task {
        private final String usuario;
        private final String contrasena;


        public Login(String usuario, String contrasena) {
            this.usuario = usuario;
            this.contrasena = contrasena;
        }


        public static Login conDatos() {
            String usuario = JOptionPane.showInputDialog("Ingrese su nombre de usuario:");
            //String contrasena = JOptionPane.showInputDialog("Ingrese su contraseña:");


            JPasswordField passwordField = new JPasswordField(20);
            JOptionPane.showMessageDialog(
                    null, passwordField, "Ingrese su contraseña:", JOptionPane.PLAIN_MESSAGE);

            String contrasena = new String(passwordField.getPassword());

            return new Login(usuario, contrasena);
        }


        @Override
        public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    Enter.theValue(usuario).into(USUARIO));
            actor.attemptsTo(
                    Enter.theValue(contrasena).into(CONTRASENA));


        }
}





/*public class Login implements Task {
    private int usuario;


    public Login(int usuario) {
        this.usuario = usuario;
    }
    public static Login csi(int usuario){
        return new Login(usuario);
    }
    private String contrasena;


    public Login(String contrasena) {
        this.contrasena = contrasena;
    }
    public static Login csi(String contrasena){
        return new Login(contrasena);
    }


    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Enter.theValue(String.valueOf(usuario)).into(USUARIO));
        actor.attemptsTo(Enter.theValue(String.valueOf(contrasena)).into(CONTRASENA));
        actor.attemptsTo(Click.on(BTN_ENTRAR));

    }*/