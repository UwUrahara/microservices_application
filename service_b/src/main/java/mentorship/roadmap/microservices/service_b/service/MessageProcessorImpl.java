package mentorship.roadmap.microservices.service_b.service;

import lombok.RequiredArgsConstructor;
import mentorship.roadmap.microservices.service_b.dto.MessageRequestDto;
import mentorship.roadmap.microservices.service_b.enumeration.MessageType;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MessageProcessorImpl implements MessageProcessor {
    private final MessageService messageService;
    private final ServiceCClient client;
    @Override
    public void process(List<MessageRequestDto> messageRequestDtoList) {
        List<MessageRequestDto> messageToSave = messageRequestDtoList.stream()
                .filter(dto -> MessageType.IMPORTANT == dto.getType()).toList();
        messageService.save(messageToSave);
        client.send(messageRequestDtoList);
    }
}
