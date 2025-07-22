package mentorship.roadmap.microservices.service_b.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Getter
@Setter
@Configuration
@ConfigurationProperties(prefix = "service-c")
public class ServiceCConfigurationProperties {
    private String uri;
}
