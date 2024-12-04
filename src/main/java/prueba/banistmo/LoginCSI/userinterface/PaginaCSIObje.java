package prueba.banistmo.LoginCSI.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaCSIObje extends PageObject {
    public static final Target USUARIO = Target.the("Escribit usuario")
            .located(By.id("txtUsername"));
    public static final Target CONTRASENA = Target.the("Escribir contraseña")
            .located(By.id("LoginAcess"));
    public static final Target BTN_ENTRAR = Target.the("Click en Entrar")
            .located(By.id("btnLogin"));
    public static final Target TEXTO_PAGINA_INICIO = Target.the("Leer titulo del Home")
            .located(By.xpath("//li[contains(text(), 'Inicio')]"));
    public static final Target LINK_PERFIL = Target.the("Link de Perfil")
                .located(By.xpath("(//a[@href='#'])[1]"));
    public static final Target BTN_SALIR = Target.the("BOTON DE SALIR CSI")
            .located(By.xpath("//a[@href='javascript:LogOut();']"));
    public static final Target BTN_OLVIDO = Target.the("Ingresar a la pantalla de Olvido su contraseña")
            .located(By.xpath("//a[@href='/Login/NeedHelp']"));
    public static final Target BTN_OLVIDO2 = Target.the("Boton de ingresar nombre de usuario y EMAIL")
            .located(By.xpath("//a[@href='#collapseTwo']"));
    public static final Target USUARIO_RECUPERACION = Target.the("ingresar nombre de usuario")
            .located(By.xpath("//input[@id='User_Name']"));
    public static final Target EMAIL_RECUPERACION = Target.the("ingresar nombre de usuario EMAIL")
            .located(By.xpath("//input[@id='E_mail']"));








}
