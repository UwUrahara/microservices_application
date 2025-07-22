package mentorship.roadmap.microservices.service_c.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import mentorship.roadmap.microservices.service_c.enumeration.MessageType;

@Getter
@Setter
@AllArgsConstructor
public class KafkaMessageDto {
    Long id;
    String data;
    MessageType type;
}
