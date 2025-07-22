package mentorship.roadmap.microservices.service_c.service;

import lombok.RequiredArgsConstructor;
import mentorship.roadmap.microservices.service_c.dto.MessageRequestDto;
import mentorship.roadmap.microservices.service_c.dto.MessageResponseDto;
import mentorship.roadmap.microservices.service_c.mapper.MessageMapper;
import mentorship.roadmap.microservices.service_c.model.Message;
import mentorship.roadmap.microservices.service_c.repository.MessageRepository;
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
    public List<MessageResponseDto> save(List<MessageRequestDto> messageRequestDtoList) {
        List<Message> toSave = messageRequestDtoList.stream().map(mapper::fromDtoToEntity).toList();
        return messageRepository.saveAll(toSave)
                .stream().map(mapper::fromEntityToResponseDto)
                .toList();
    }
}
