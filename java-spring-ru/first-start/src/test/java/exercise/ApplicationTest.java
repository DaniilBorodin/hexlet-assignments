package exercise;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootApplication
@RestController
class ApplicationTest {

    @Test
    void appHasAGreeting() {
        Application app = new Application();
        assertThat(app.home().trim()).isEqualTo("Welcome to Hexlet!");
    }
}
