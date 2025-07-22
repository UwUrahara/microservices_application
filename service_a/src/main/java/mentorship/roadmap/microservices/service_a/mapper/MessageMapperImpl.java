package mentorship.roadmap.microservices.service_a.mapper;

import mentorship.roadmap.microservices.service_a.dto.KafkaMessageDto;
import mentorship.roadmap.microservices.service_a.dto.MessageRequestDto;
import mentorship.roadmap.microservices.service_a.model.Message;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class MessageMapperImpl implements MessageMapper {
    @Override
    public Message fromKafkaToEntity(KafkaMessageDto messageDto) {
        return new Message(UUID.randomUUID().toString(), messageDto.getData(), messageDto.getType());
    }

    @Override
    public MessageRequestDto fromEntityToOutputDto(Message message) {
        return new MessageRequestDto(message.getData(), message.getType());
    }
}
