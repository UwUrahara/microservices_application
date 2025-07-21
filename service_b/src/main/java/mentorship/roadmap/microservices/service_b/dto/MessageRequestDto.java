package mentorship.roadmap.microservices.service_b.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import mentorship.roadmap.microservices.service_b.enumeration.MessageType;

@NoArgsConstructor
@AllArgsConstructor
public class MessageRequestDto {
    @JsonProperty(value = "id")
    Long id;
    @JsonProperty(value = "type")
    MessageType type;
    @JsonProperty(value = "data")
    String data;
}
