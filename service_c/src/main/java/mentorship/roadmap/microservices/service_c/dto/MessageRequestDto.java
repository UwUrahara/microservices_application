package mentorship.roadmap.microservices.service_c.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import mentorship.roadmap.microservices.service_c.enumeration.MessageType;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MessageRequestDto {
    @JsonProperty(value = "type")
    MessageType type;
    @JsonProperty(value = "data")
    String data;
}
