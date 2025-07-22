package mentorship.roadmap.microservices.service_b.controller;

import lombok.RequiredArgsConstructor;
import mentorship.roadmap.microservices.service_b.dto.MessageRequestDto;
import mentorship.roadmap.microservices.service_b.service.MessageProcessor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class MessageController {

    private final MessageProcessor messageProcessor;

    @PostMapping("/process")
    void process(@RequestBody List<MessageRequestDto> messageRequestDtoList) {
        messageProcessor.process(messageRequestDtoList);
    }
}
