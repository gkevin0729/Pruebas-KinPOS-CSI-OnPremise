package prueba.banistmo.userinterface;

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
    public static final Target BTN_FLECHADERECHA = Target.the("Click en link en flecha derecha")
            .located(By.xpath("//*[@id='layoutContainers']/div/div[2]/div/div[6]/div/section/div[2]/div[1]/div/div/div/div/div[2]/button/i"));
    public static final Target BTN_GESTIONARFINANZAS = Target.the("Click en GESTIONAR FINANZAS")
            .located(By.xpath("*[@id='layoutContainers']/div/div[2]/div/div[6]/div/section/div[2]/div[1]/div/div/div/div/div[1]/div[7]/div[2]/a"));


    ////*[@id="layoutContainers"]/div/div[2]/div/div[6]/div/section/div[2]/div[1]/div/div/div/div/div[1]/div[7]/div[2]/a


}
