package mentorship.roadmap.microservices.service_b.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import mentorship.roadmap.microservices.service_b.enumeration.MessageType;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@AllArgsConstructor
@Getter
@Setter
@RedisHash(value = "message", timeToLive = 300L)
public class Message implements Serializable {
    @Id
    Long id;
    String data;
    MessageType type;
}
