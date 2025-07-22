package mentorship.roadmap.microservices.service_c.mapper;

import mentorship.roadmap.microservices.service_c.dto.KafkaMessageDto;
import mentorship.roadmap.microservices.service_c.dto.MessageRequestDto;
import mentorship.roadmap.microservices.service_c.dto.MessageResponseDto;
import mentorship.roadmap.microservices.service_c.model.Message;

public interface MessageMapper {
    Message fromDtoToEntity(MessageRequestDto dto);
    MessageResponseDto fromEntityToResponseDto(Message message);
    KafkaMessageDto fromResponseToKafkaMessage(MessageResponseDto message);
}
