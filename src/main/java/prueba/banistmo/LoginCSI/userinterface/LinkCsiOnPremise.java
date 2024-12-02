package prueba.banistmo.LoginCSI.userinterface;


import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

@DefaultUrl("https://10.71.24.146/Login")
public class LinkCsiOnPremise extends PageObject {
    public static final Target BTN_AVANZAR = Target.the("Click en boton de avanzar")
            .located(By.id("details-button"));
    public static final Target LINK_CSI = Target.the("Click link Continue")
            .located(By.id("proceed-link"));


}
