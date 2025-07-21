package mentorship.roadmap.microservices.service_a.mapper;

import mentorship.roadmap.microservices.service_a.dto.KafkaMessageDto;
import mentorship.roadmap.microservices.service_a.dto.MessageRequestDto;
import mentorship.roadmap.microservices.service_a.model.Message;

public interface MessageMapper {
    Message fromKafkaToEntity(KafkaMessageDto messageDto);
    MessageRequestDto fromEntityToOutputDto(Message message);
}