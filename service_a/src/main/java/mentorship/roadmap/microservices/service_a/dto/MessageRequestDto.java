package mentorship.roadmap.microservices.service_a.dto;

import lombok.*;
import mentorship.roadmap.microservices.service_a.enumeration.MessageType;

@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
public class MessageRequestDto {
    private String data;
    private MessageType type;
}
