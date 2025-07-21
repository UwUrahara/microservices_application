package mentorship.roadmap.microservices.service_b.repository;

import mentorship.roadmap.microservices.service_b.model.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepository extends CrudRepository<Message, Long> {
}
