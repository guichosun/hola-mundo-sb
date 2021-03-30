package mx.ine.holamundo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author guichosun
 *
 */
@Entity
public class Message {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="msg_id")
    private Integer id;

    @Column(name = "msg_name", nullable = false)
    private String messsage;

    public Message(Integer id, String messsage) {
    	super();
    	this.id = id;
    	this.messsage = messsage;
    }
    
    public Message() {
    	super();
    }
    
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMesssage() {
		return messsage;
	}

	public void setMesssage(String messsage) {
		this.messsage = messsage;
	}


	@Override
	public String toString() {
		return "Message [id=" + id + ", messsage=" + messsage + "]";
	}

}
