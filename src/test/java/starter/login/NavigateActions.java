package starter.login;

import net.serenitybdd.core.steps.UIInteractions;

public class NavigateActions extends UIInteractions {

    public void moodleLoginPage() {
        openUrl("https://micampusvirtual.usbcali.edu.co/login/index.php");
    }
}
