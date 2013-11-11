package persistance;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

import persistance.Employee;

/**
 * Entity implementation class for Entity: Message
 *
 */
@Entity
@XmlRootElement
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((from == null) ? 0 : from.hashCode());
		result = prime * result + id;
		result = prime * result + ((message == null) ? 0 : message.hashCode());
		result = prime * result + ((to == null) ? 0 : to.hashCode());
		result = prime * result + (unread ? 1231 : 1237);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Message other = (Message) obj;
		if (from == null) {
			if (other.from != null)
				return false;
		} else if (!from.equals(other.from))
			return false;
		if (id != other.id)
			return false;
		if (message == null) {
			if (other.message != null)
				return false;
		} else if (!message.equals(other.message))
			return false;
		if (to == null) {
			if (other.to != null)
				return false;
		} else if (!to.equals(other.to))
			return false;
		if (unread != other.unread)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Message [id=" + id + ", message=" + message + ", unread="
				+ unread + ", from=" + from + ", to=" + to + "]";
	}
   
}
