package hostel.com.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table
public class Guest implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long guestId;
	private String guestIdNumber;
	private String guestFirstname;
	private String guestLastname;
	private String guestNationality;
	private String guestEmail;
	private String guestAddress;
	private String guestPhone;
	private String guestGender;
	private String guestAge;

	
}
