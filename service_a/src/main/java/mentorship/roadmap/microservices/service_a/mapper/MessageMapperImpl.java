package mentorship.roadmap.microservices.service_a.mapper;

import mentorship.roadmap.microservices.service_a.dto.KafkaMessageDto;
import mentorship.roadmap.microservices.service_a.dto.MessageRequestDto;
import mentorship.roadmap.microservices.service_a.model.Message;
import org.springframework.stereotype.Component;

@Component
public class MessageMapperImpl implements MessageMapper {
    @Override
    public Message fromKafkaToEntity(KafkaMessageDto messageDto) {
        return new Message(messageDto.getId(), messageDto.getData());
    }

    @Override
    public MessageRequestDto fromEntityToOutputDto(Message message) {
        return new MessageRequestDto(message.getData());
    }
}
