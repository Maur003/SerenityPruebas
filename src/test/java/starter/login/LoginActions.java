package starter.login;

import net.serenitybdd.core.steps.UIInteractions;
import org.openqa.selenium.Keys;

public class LoginActions extends UIInteractions {

    public void withCredentials(String username, String password) {
        $("#userid").sendKeys(username);
        $("#pwd").sendKeys(password, Keys.ENTER);
    }
}
