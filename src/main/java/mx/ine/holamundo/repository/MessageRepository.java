package mx.ine.holamundo.repository;

import org.springframework.data.repository.CrudRepository;

import mx.ine.holamundo.model.Message;

public interface MessageRepository extends CrudRepository<Message, Integer> {
	
}