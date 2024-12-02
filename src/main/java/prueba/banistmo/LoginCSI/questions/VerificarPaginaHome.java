package prueba.banistmo.LoginCSI.questions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class VerificarPaginaHome implements Question<Boolean> {

    // Método estático para crear una instancia de la clase
    public static VerificarPaginaHome verifica() {
        return new VerificarPaginaHome();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean resultado = false;
        String textURL = "Home";  // La palabra que buscamos en la URL
        String urlText = null;

        try {
            // Obtener y decodificar la URL de la página actual
            urlText = Serenity.getWebdriverManager().getWebdriver().getCurrentUrl();

            // Imprimir la URL para depurar
            System.out.println("URL obtenida: " + urlText);

            // Si la URL contiene un fragmento (#/Home/Home), tomamos la parte después del '#'
            if (urlText.contains("#")) {
                urlText = urlText.substring(urlText.indexOf("#") + 1);
            }

            // Normalizar los espacios en blanco si es necesario
            urlText = urlText.replaceAll(" +", " ");  // Esto puede ser útil si la URL contiene múltiples espacios

        } catch (Exception e) {
            e.printStackTrace();
            return false;  // Si ocurre un error, devolvemos 'false'
        }

        // Verificar si la URL contiene la palabra "Home"
        if (urlText != null && urlText.contains(textURL)) {
            resultado = true;  // Si contiene "Home", devolvemos 'true'
        }

        return resultado;  // Retorna el resultado de la verificación
    }
}
