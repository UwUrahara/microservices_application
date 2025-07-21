package mentorship.roadmap.microservices.service_a.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@RequiredArgsConstructor
@Getter
@Setter
public class KafkaMessageDto implements Serializable {
    private Long id;
    private String data;
}
