package hostel.com.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Spa implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long spaId;
	private String spaName;
	private String spaDetail;
	private String spaPic;
	private String spaPrice;

	public String getSpaPrice() {
		return spaPrice;
	}

	public void setSpaPrice(String spaPrice) {
		this.spaPrice = spaPrice;
	}

	public long getSpaId() {
		return spaId;
	}

	public void setSpaId(long spaId) {
		this.spaId = spaId;
	}

	public String getSpaName() {
		return spaName;
	}

	public void setSpaName(String spaName) {
		this.spaName = spaName;
	}

	public String getSpaDetail() {
		return spaDetail;
	}

	public void setSpaDetail(String spaDetail) {
		this.spaDetail = spaDetail;
	}

	public String getSpaPic() {
		return spaPic;
	}

	public void setSpaPic(String spaPic) {
		this.spaPic = spaPic;
	}

	@OneToMany(mappedBy = "spa", cascade = { CascadeType.ALL })
	private List<BookSpa> bookSpa;

	public List<BookSpa> getBookSpa() {
		return bookSpa;
	}

	public void setBookSpa(List<BookSpa> bookSpa) {
		this.bookSpa = bookSpa;
	}

}
