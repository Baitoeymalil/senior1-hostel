package hostel.com.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Information")
public class Information implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "informationId")
	private long informationId;
	@Column(name = "hostelAddress")
	private String hostelAddress;
	@Column(name = "hostelPhone")
	private String hostelPhone;
	@Column(name = "hostelPic")
	private String hostelPic;
	@Column(name = "hostelEmail")
	private String hostelEmail;
	@Column(name = "hostelWebside")
	private String hostelWebside;

}
