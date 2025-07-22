package mentorship.roadmap.microservices.service_a.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import mentorship.roadmap.microservices.service_a.enumeration.MessageType;

import java.io.Serializable;

@RequiredArgsConstructor
@Getter
@Setter
public class KafkaMessageDto implements Serializable {
    private String data;
    private MessageType type;
}
