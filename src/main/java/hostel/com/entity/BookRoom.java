package hostel.com.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
@Entity
@Table(name = "BookRoom")
public class BookRoom implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long bookRoomId;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "checkInDate")
	private Date checkInDate;
	@Column(name = "checkOutDate")
	private Date checkOutDate;
	@Column(name = "numberOfPerson")
	private String numberOfPerson;

}
