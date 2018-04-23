package hostel.com.entity;

import java.io.Serializable;
import java.util.List;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="Member")
public class Member implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="memberId")
	private long memberId;
	@Column(name="memberIdNumber")
	private String memberIdNumber;
	@Column(name="memberFirstname")
	private String memberFirstname;
	@Column(name="memberLastname")
	private String memberLastname;
	@Column(name="memberNationality")
	private String memberNationality;
	@Column(name="memberRace")
	private String memberRace;
	@Column(name="memberEmail")
	private String memberEmail;
	@Column(name="memberAddress")
	private String memberAddress;
	@Column(name="memberPhone")
	private String memberPhone;
	@Column(name="memberPassword")
	private String memberPassword;
	@Column(name="memberProfilePic")
	private String memberProfilePic;
	@Column(name="memberGender")
	private String memberGender;
	@Column(name="memberAge")
	private String memberAge;

	
}

