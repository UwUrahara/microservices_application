package mentorship.roadmap.microservices.service_c.mapper;

import mentorship.roadmap.microservices.service_c.dto.KafkaMessageDto;
import mentorship.roadmap.microservices.service_c.dto.MessageRequestDto;
import mentorship.roadmap.microservices.service_c.dto.MessageResponseDto;
import mentorship.roadmap.microservices.service_c.model.Message;
import org.springframework.stereotype.Component;

@Component
public class MessageMapperImpl implements MessageMapper {
    @Override
    public Message fromDtoToEntity(MessageRequestDto dto) {
        return new Message(
               dto.getData(),
               dto.getType()
        );
    }

    @Override
    public MessageResponseDto fromEntityToResponseDto(Message message) {
        return new MessageResponseDto(
                message.getId(),
                message.getData(),
                message.getType()
        );
    }

    @Override
    public KafkaMessageDto fromResponseToKafkaMessage(MessageResponseDto message) {
        return new KafkaMessageDto(
                message.getId(),
                message.getData(),
                message.getType()
        );
    }
}
