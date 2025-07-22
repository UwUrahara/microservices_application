package mentorship.roadmap.microservices.service_b.mapper;


import mentorship.roadmap.microservices.service_b.dto.MessageRequestDto;
import mentorship.roadmap.microservices.service_b.model.Message;

public interface MessageMapper {
    MessageRequestDto fromEntityToOutputDto(Message message);
    Message fromInputDtoToEntity(MessageRequestDto messageRequestDto);
}