package mentorship.roadmap.microservices.service_b.service;

import mentorship.roadmap.microservices.service_b.dto.MessageRequestDto;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class ServiceCClientImpl implements ServiceCClient {
    private final RestTemplate restTemplate;
    private static final String PROCESS_PATH = "/api/save";

    public ServiceCClientImpl(
            @Qualifier("serviceCClient")
            RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public void send(List<MessageRequestDto> data) {
        restTemplate.exchange(PROCESS_PATH, HttpMethod.POST, new HttpEntity<>(data), new ParameterizedTypeReference<MessageRequestDto>() {});
    }
}
