package starter.login;

import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SerenityJUnit5Extension.class)
class WhenLoggingIn {

    NavigateActions navigate;
    LoginActions login;
    LoginVerification loginVerification;

    @Test
    void shouldBeAbleToLogIn() {
        String username = "AMBONILLAL";
        String password = "1007580033";

        navigate.moodleLoginPage();
        login.withCredentials(username, password);

        assertThat(loginVerification.isLoginSuccessful()).isTrue();
    }
}
