package exercise;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class ApplicationTest {

    @Test
    void appHasAGreeting() {
        Application app = new Application();
        assertThat(app.home().trim()).isEqualTo("Welcome to Hexlet!");
    }
}
