package mentorship.roadmap.microservices.service_c.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import mentorship.roadmap.microservices.service_c.enumeration.MessageType;

@AllArgsConstructor
@Getter
public class MessageResponseDto {
    Long id;
    String data;
    MessageType type;
}
