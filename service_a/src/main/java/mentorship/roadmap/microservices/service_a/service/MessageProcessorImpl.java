package mentorship.roadmap.microservices.service_a.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import mentorship.roadmap.microservices.service_a.dto.KafkaMessageDto;
import mentorship.roadmap.microservices.service_a.dto.MessageRequestDto;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MessageProcessorImpl implements MessageProcessor {
    private final MessageService messageService;
    private final ServiceBClient serviceBClient;
    @Override
    public void process(String message) {
        try {
            KafkaMessageDto kafkaMessageDto = new ObjectMapper().readValue(message, KafkaMessageDto.class);
            List<MessageRequestDto> savedMessages = messageService.saveAll(Collections.singletonList(kafkaMessageDto));
            serviceBClient.send(savedMessages);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
