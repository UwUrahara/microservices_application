package mentorship.roadmap.microservices.service_c.controller;

import lombok.RequiredArgsConstructor;
import mentorship.roadmap.microservices.service_c.dto.MessageRequestDto;
import mentorship.roadmap.microservices.service_c.service.MessageService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class MessageController {
    private final MessageService messageService;

    @PostMapping("/save")
    void saveMessage(@RequestBody List<MessageRequestDto> messageRequestDtoList) {
        messageService.save(messageRequestDtoList);
    }
}
