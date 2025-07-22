package mentorship.roadmap.microservices.service_b.mapper;


import mentorship.roadmap.microservices.service_b.dto.MessageRequestDto;
import mentorship.roadmap.microservices.service_b.model.Message;
import org.springframework.stereotype.Component;

@Component
public class MessageMapperImpl implements MessageMapper {
    @Override
    public MessageRequestDto fromEntityToOutputDto(Message message) {
        return new MessageRequestDto(message.getId(),message.getType(), message.getData());
    }

    @Override
    public Message fromInputDtoToEntity(MessageRequestDto messageRequestDto) {
        return new Message(messageRequestDto.getId(), messageRequestDto.getData(), messageRequestDto.getType());
    }
}
