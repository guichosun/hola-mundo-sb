package mx.ine.holamundo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import mx.ine.holamundo.exception.MessageNotFoundException;
import mx.ine.holamundo.model.Message;

/**
 * @author guichosun
 *
 */
@RestController
@RequestMapping("/api")
public class MessageController {

	@GetMapping("/mensaje")
	@CrossOrigin
    public ResponseEntity<Message> getMessage() {
            return new ResponseEntity<Message>(new Message(0, "Este es un mensaje predefinido"), HttpStatus.OK);
    }
	
	@GetMapping("/mensaje/{id}")
	@CrossOrigin
	public ResponseEntity<Message> getMessage(@PathVariable("id") long id) {
		try {
			return new ResponseEntity<Message>(HttpStatus.OK);
//            return new ResponseEntity<Message>(applicationService.findApplication(id), HttpStatus.OK);
		} catch (MessageNotFoundException exception) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Mensaje no encontrado");
		}
	}
}
