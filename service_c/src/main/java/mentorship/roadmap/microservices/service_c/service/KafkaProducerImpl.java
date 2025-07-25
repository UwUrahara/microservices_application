package mentorship.roadmap.microservices.service_c.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class KafkaProducerImpl implements KafkaProducer {

    private static final String TOPIC = "out";

    private final KafkaTemplate<String, String> kafkaTemplate;

    @Override
    public void sendMessage(Object message) {
        try {
            Message<String> message1 = MessageBuilder
                    .withPayload(new ObjectMapper().writeValueAsString(message))
                    .setHeader(KafkaHeaders.TOPIC, TOPIC)
                    .build();
            kafkaTemplate.send(message1);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
