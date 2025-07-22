package mentorship.roadmap.microservices.service_b.service;


import mentorship.roadmap.microservices.service_b.dto.MessageRequestDto;

import java.util.List;

public interface ServiceCClient {
    void send(List<MessageRequestDto> data);
}
