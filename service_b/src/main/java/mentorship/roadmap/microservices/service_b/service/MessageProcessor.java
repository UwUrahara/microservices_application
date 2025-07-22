package mentorship.roadmap.microservices.service_b.service;

import mentorship.roadmap.microservices.service_b.dto.MessageRequestDto;

import java.util.List;

public interface MessageProcessor {
    void process(List<MessageRequestDto> messageRequestDtoList);
}
