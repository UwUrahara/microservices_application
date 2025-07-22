package mentorship.roadmap.microservices.service_b.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@EnableCaching
public class ApplicationConfig {
    @Bean
    @Qualifier("serviceCClient")
    public RestTemplate restTemplate(
            ServiceCConfigurationProperties configurationProperties
    ) {
        return new RestTemplateBuilder()
                .rootUri(configurationProperties.getUri())
                .build();
    }
}
