package mentorship.roadmap.microservices.service_a.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Getter
@Setter
@Configuration
@ConfigurationProperties(prefix = "service-b")
public class ServiceBConfigurationProperties {
    private String uri;
}
