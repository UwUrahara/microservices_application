package mentorship.roadmap.microservices.service_c.service;

import mentorship.roadmap.microservices.service_c.dto.MessageRequestDto;
import mentorship.roadmap.microservices.service_c.dto.MessageResponseDto;

import java.util.List;

public interface MessageService {
    List<MessageResponseDto> save(List<MessageRequestDto> messageRequestDtoList);
}
