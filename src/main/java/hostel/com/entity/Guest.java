package hostel.com.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="Guest")
public class Guest implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="guestId")
	private long guestId;
	@Column(name="guestIdNumber")
	private String guestIdNumber;
	@Column(name="guestFirstname")
	private String guestFirstname;
	@Column(name="guestLastname")
	private String guestLastname;
	@Column(name="guestNationality")
	private String guestNationality;
	@Column(name="guestEmail")
	private String guestEmail;
	@Column(name="guestAddress")
	private String guestAddress;
	@Column(name="guestPhone")
	private String guestPhone;
	@Column(name="guestGender")
	private String guestGender;
	@Column(name="guestAge")
	private String guestAge;

	
}
