package mentorship.roadmap.microservices.service_a.service;

import mentorship.roadmap.microservices.service_a.dto.MessageRequestDto;

import java.util.List;

public interface ServiceBClient {
    void send(List<MessageRequestDto> data);
}
