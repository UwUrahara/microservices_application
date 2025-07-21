package mentorship.roadmap.microservices.service_a.service;

import mentorship.roadmap.microservices.service_a.dto.KafkaMessageDto;
import mentorship.roadmap.microservices.service_a.dto.MessageRequestDto;

import java.util.List;

public interface MessageService {
    List<MessageRequestDto> saveAll(List<KafkaMessageDto> kafkaMessages);
}
