package mentorship.roadmap.microservices.service_a.service;

import lombok.RequiredArgsConstructor;
import mentorship.roadmap.microservices.service_a.dto.KafkaMessageDto;
import mentorship.roadmap.microservices.service_a.dto.MessageRequestDto;
import mentorship.roadmap.microservices.service_a.mapper.MessageMapper;
import mentorship.roadmap.microservices.service_a.model.Message;
import mentorship.roadmap.microservices.service_a.repository.MessageRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MessageServiceImpl implements MessageService {
    private final MessageRepository messageRepository;
    private final MessageMapper mapper;

    @Transactional
    @Override
    public List<MessageRequestDto> saveAll(List<KafkaMessageDto> kafkaMessages) {
        List<Message> messages = kafkaMessages.stream().map(mapper::fromKafkaToEntity).toList();
        List<Message> savedMessages = messageRepository.saveAll(messages);
        return savedMessages.stream().map(mapper::fromEntityToOutputDto).toList();
    }
}
