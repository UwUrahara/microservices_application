package mentorship.roadmap.microservices.service_a.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import mentorship.roadmap.microservices.service_a.enumeration.MessageType;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "message")
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
public class Message {
    @Id
    private Long id;
    private String data;
    private MessageType type;
}
