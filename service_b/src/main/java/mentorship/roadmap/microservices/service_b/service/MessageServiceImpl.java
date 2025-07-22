package mentorship.roadmap.microservices.service_b.service;

import lombok.RequiredArgsConstructor;
import mentorship.roadmap.microservices.service_b.dto.MessageRequestDto;
import mentorship.roadmap.microservices.service_b.enumeration.MessageType;
import mentorship.roadmap.microservices.service_b.mapper.MessageMapper;
import mentorship.roadmap.microservices.service_b.model.Message;
import mentorship.roadmap.microservices.service_b.repository.MessageRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MessageServiceImpl implements MessageService {

    private final MessageRepository messageRepository;
    private final MessageMapper mapper;

    @Override
    @Transactional
    public void save(List<MessageRequestDto> messageRequestDtos) {
        List<Message> messagesToInsert = messageRequestDtos.stream()
                .map(mapper::fromInputDtoToEntity).toList();
        messageRepository.saveAll(messagesToInsert);
    }
}
