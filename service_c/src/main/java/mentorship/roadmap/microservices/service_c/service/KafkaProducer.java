package mentorship.roadmap.microservices.service_c.service;

public interface KafkaProducer {
    void sendMessage(Object message);
}
