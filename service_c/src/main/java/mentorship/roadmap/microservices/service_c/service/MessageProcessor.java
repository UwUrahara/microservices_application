package mentorship.roadmap.microservices.service_c.service;

import mentorship.roadmap.microservices.service_c.dto.MessageRequestDto;

import java.util.List;

public interface MessageProcessor {
    void process(List<MessageRequestDto> messageRequestDtoList);
}
