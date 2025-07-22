package mentorship.roadmap.microservices.service_a.service;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaConsumerService {

    private final MessageProcessor messageProcessor;

    @KafkaListener(
            topics = "in", groupId = "service-a"
    )
    public void consume(String message) {
        System.out.println(message);
        messageProcessor.process(message);
    }
}
