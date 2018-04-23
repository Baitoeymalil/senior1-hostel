package hostel.com.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Information implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long informationId;
	private String hostelAddress;
	private String hostelPhone;
	private String hostelPic;
	private String hostelEmail;
	private String hostelWebside;

	public long getInformationId() {
		return informationId;
	}

	public void setInformationId(long informationId) {
		this.informationId = informationId;
	}

	public String getHostelAddress() {
		return hostelAddress;
	}

	public void setHostelAddress(String hostelAddress) {
		this.hostelAddress = hostelAddress;
	}

	public String getHostelPhone() {
		return hostelPhone;
	}

	public void setHostelPhone(String hostelPhone) {
		this.hostelPhone = hostelPhone;
	}

	public String getHostelPic() {
		return hostelPic;
	}

	public void setHostelPic(String hostelPic) {
		this.hostelPic = hostelPic;
	}

	public String getHostelEmail() {
		return hostelEmail;
	}

	public void setHostelEmail(String hostelEmail) {
		this.hostelEmail = hostelEmail;
	}

	public String getHostelWebside() {
		return hostelWebside;
	}

	public void setHostelWebside(String hostelWebside) {
		this.hostelWebside = hostelWebside;
	}

}
