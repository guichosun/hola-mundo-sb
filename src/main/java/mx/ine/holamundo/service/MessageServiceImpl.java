package mx.ine.holamundo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.ine.holamundo.model.Message;
import mx.ine.holamundo.repository.MessageRepository;

@Service
public class MessageServiceImpl implements MessageService {

	@Autowired
    private MessageRepository repository;
	
	@Override
	public Message findMessage(int id) {
		Message msg = null;
		
		if (id == 0) {
			msg = new Message(id, "Este es un mensaje predeterminado");
		} else {
			msg = new Message(id, "Se encontro el mensaje de bd");
			Optional<Message> op = repository.findById(id);
			if(op.isPresent()) {
				msg = op.get();
			}
		}
		return msg;
	}


}
