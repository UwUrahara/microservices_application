package mentorship.roadmap.microservices.service_c.model;

import jakarta.persistence.*;
import lombok.*;
import mentorship.roadmap.microservices.service_c.enumeration.MessageType;

@Entity
@Table(name = "message")
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String data;
    @Enumerated(EnumType.STRING)
    MessageType type;

    public Message(String data, MessageType messageType) {
        this.data = data;
        this.type = messageType;
    }
}