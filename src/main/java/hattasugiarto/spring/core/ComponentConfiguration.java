package hattasugiarto.spring.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "hattasugiarto.spring.core.service"
})
public class ComponentConfiguration {

}
