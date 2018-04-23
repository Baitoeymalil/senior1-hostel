package hostel.com.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Member implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long memberId;
	private String memberIdNumber;
	private String memberFirstname;
	private String memberLastname;
	private String memberNationality;
	private String memberRace;
	private String memberEmail;
	private String memberAddress;
	private String memberPhone;
	private String memberPassword;
	private String memberProfilePic;
	private String memberGender;
	private String memberAge;

	public long getMemberId() {
		return memberId;
	}

	public void setMemberId(long memberId) {
		this.memberId = memberId;
	}

	public String getMemberIdNumber() {
		return memberIdNumber;
	}

	public void setMemberIdNumber(String memberIdNumber) {
		this.memberIdNumber = memberIdNumber;
	}

	public String getMemberFirstname() {
		return memberFirstname;
	}

	public void setMemberFirstname(String memberFirstname) {
		this.memberFirstname = memberFirstname;
	}

	public String getMemberLastname() {
		return memberLastname;
	}

	public void setMemberLastname(String memberLastname) {
		this.memberLastname = memberLastname;
	}

	public String getMemberNationality() {
		return memberNationality;
	}

	public void setMemberNationality(String memberNationality) {
		this.memberNationality = memberNationality;
	}

	public String getMemberRace() {
		return memberRace;
	}

	public void setMemberRace(String memberRace) {
		this.memberRace = memberRace;
	}

	public String getMemberEmail() {
		return memberEmail;
	}

	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}

	public String getMemberAddress() {
		return memberAddress;
	}

	public void setMemberAddress(String memberAddress) {
		this.memberAddress = memberAddress;
	}

	public String getMemberPhone() {
		return memberPhone;
	}

	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}

	public String getMemberPassword() {
		return memberPassword;
	}

	public void setMemberPassword(String memberPassword) {
		this.memberPassword = memberPassword;
	}

	public String getMemberProfilePic() {
		return memberProfilePic;
	}

	public void setMemberProfilePic(String memberProfilePic) {
		this.memberProfilePic = memberProfilePic;
	}

	public String getMemberGender() {
		return memberGender;
	}

	public void setMemberGender(String memberGender) {
		this.memberGender = memberGender;
	}

	public String getMemberAge() {
		return memberAge;
	}

	public void setMemberAge(String memberAge) {
		this.memberAge = memberAge;
	}
	
	@OneToMany(mappedBy = "member", cascade = { CascadeType.ALL })
	private List<Reservation> resevation;

	private List<Reservation> getReservation() {
		return resevation;
	}

	private List<Reservation> setReservation() {
		return resevation;
	}
	

}

