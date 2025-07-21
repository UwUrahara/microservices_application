package mentorship.roadmap.microservices.service_a.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationConfig {
    @Bean
    @Qualifier("serviceBClient")
    public RestTemplate restTemplate(
            ServiceBConfigurationProperties configurationProperties
    ) {
       return new RestTemplateBuilder()
               .rootUri(configurationProperties.getUri())
               .build();
    }
}
