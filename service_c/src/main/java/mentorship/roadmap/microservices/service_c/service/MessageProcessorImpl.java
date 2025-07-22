package mentorship.roadmap.microservices.service_c.service;

import lombok.RequiredArgsConstructor;
import mentorship.roadmap.microservices.service_c.dto.KafkaMessageDto;
import mentorship.roadmap.microservices.service_c.dto.MessageRequestDto;
import mentorship.roadmap.microservices.service_c.mapper.MessageMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MessageProcessorImpl implements MessageProcessor {

    private final MessageService messageService;
    private final MessageMapper messageMapper;
    private final KafkaProducer kafkaProducer;
    @Override
    public void process(List<MessageRequestDto> messageRequestDtoList) {
        List<KafkaMessageDto> saved = messageService.save(messageRequestDtoList).stream()
                .map(messageMapper::fromResponseToKafkaMessage)
                .toList();
        kafkaProducer.sendMessage(saved);
    }
}
