package bdd;

import io.cucumber.spring.CucumberContextConfiguration;
import org.testcontainers.demo.Main;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;

@CucumberContextConfiguration
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ContextConfiguration(
        initializers = {SpringBootContextInitializer.class},
        classes = {Main.class, CucumberTestContextConfig.class}
)
@ActiveProfiles(profiles = {"bdd"})
class CucumberSpringBootContext {
}
