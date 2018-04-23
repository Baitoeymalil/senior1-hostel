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

public class Trip implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long tripId;
	private String tripName;
	private String tripDetail;
	private String tripPic;
	private String tripPrice;



	public String getTripPrice() {
		return tripPrice;
	}

	public void setTripPrice(String tripPrice) {
		this.tripPrice = tripPrice;
	}

	public long getTripId() {
		return tripId;
	}

	public void setTripId(long tripId) {
		this.tripId = tripId;
	}

	public String getTripName() {
		return tripName;
	}

	public void setTripName(String tripName) {
		this.tripName = tripName;
	}

	public String getTripDetail() {
		return tripDetail;
	}

	public void setTripDetail(String tripDetail) {
		this.tripDetail = tripDetail;
	}

	public String getTripPic() {
		return tripPic;
	}

	public void setTripPic(String tripPic) {
		this.tripPic = tripPic;
	}

	@OneToMany(mappedBy = "trip", cascade = { CascadeType.ALL })
	private List<BookTrip> bookTrips;

	public List<BookTrip> getBookTrips() {
		return bookTrips;
	}

	public void setBookTrips(List<BookTrip> bookTrips) {
		this.bookTrips = bookTrips;
	}

}
