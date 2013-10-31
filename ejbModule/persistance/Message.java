package persistance;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;
import persistance.Employee;

/**
 * Entity implementation class for Entity: Message
 *
 */
@Entity

public class Message implements Serializable {

	
	private int id;
	private String message;
	private boolean unread;
	private Employee from;
	private Employee to;
	private static final long serialVersionUID = 1L;

	public Message() {
		super();
	}   
	@Id    
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}   
	public boolean getUnread() {
		return this.unread;
	}

	public void setUnread(boolean unread) {
		this.unread = unread;
	}   
	@OneToOne
	public Employee getFrom() {
		return this.from;
	}

	public void setFrom(Employee from) {
		this.from = from;
	}   
	@OneToOne
	public Employee getTo() {
		return this.to;
	}

	public void setTo(Employee to) {
		this.to = to;
	}
   
}
