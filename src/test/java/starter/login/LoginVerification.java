package starter.login;

import net.serenitybdd.core.pages.PageObject;

public class LoginVerification extends PageObject {

    private static final String URL_AFTER_LOGIN = "https://micampusvirtual.usbcali.edu.co/?redirect=0";

    public boolean isLoginSuccessful() {
        return getDriver().getCurrentUrl().equals(URL_AFTER_LOGIN);
    }
}
