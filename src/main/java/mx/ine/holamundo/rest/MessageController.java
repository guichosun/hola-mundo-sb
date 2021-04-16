package mx.ine.holamundo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author guichosun
 *
 */
@RestController
@RequestMapping("/api")
public class MessageController {


	@GetMapping("/mensaje")
	@CrossOrigin
    public ResponseEntity<String> getMessage() {
            return new ResponseEntity<String>("Este es un mensaje predefinido", HttpStatus.OK);
    }
	
	@GetMapping("/mensaje/{id}")
	@CrossOrigin
	public ResponseEntity<String> getMessage(@PathVariable("id") int id) {
		return new ResponseEntity<String>("Este es un mensaje predefinido", HttpStatus.OK);
	}
}
