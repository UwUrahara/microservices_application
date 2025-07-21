package mentorship.roadmap.microservices.service_b.controller;

import mentorship.roadmap.microservices.service_b.dto.MessageRequestDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MessageController {

    @PostMapping("/process")
    void process(@RequestBody List<MessageRequestDto> messageRequestDtoList) {
        System.out.println(messageRequestDtoList.toString());
    }
}
