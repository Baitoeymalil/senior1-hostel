package hostel.com.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Reservation implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long reservationId;
	// @DateTimeFormat (pattern = "yyyy-MM-dd")
	private String reservationDate;

	public long getReservationId() {
		return reservationId;
	}

	public void setReservationId(long reservationId) {
		this.reservationId = reservationId;
	}

	public String getReservationDate() {
		return reservationDate;
	}

	public void setReservationDate(String reservationDate) {
		this.reservationDate = reservationDate;
	}

	@OneToOne(mappedBy = "reservation", cascade = { CascadeType.ALL })
	private Bill bill;

	public Bill getBill() {
		return bill;
	}

	public void setBill(Bill bill) {
		this.bill = bill;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	private Promotion promotion;

	public Promotion getPromotion() {
		return promotion;
	}

	public void setPromotion(Promotion promotion) {
		this.promotion = promotion;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	private Member member;

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	private Guest guest;

	public Guest getGuest() {
		return guest;
	}

	public void setGuest(Guest guest) {
		this.guest = guest;
	}

	@OneToOne(mappedBy = "reservation", cascade = { CascadeType.ALL })
	private BookRoom bookRooms;

	public BookRoom getBookRooms() {
		return bookRooms;
	}

	public void setBookRooms (BookRoom bookRooms) {
		this.bookRooms = bookRooms;
	}

	@OneToOne(mappedBy = "reservation", cascade = { CascadeType.ALL })
	private BookSpa bookSpa;
	
	public BookSpa getBookSpa() {
		return bookSpa;
	}

	public void setBookSpa(BookSpa bookSpa) {
		this.bookSpa = bookSpa;
	}

	@OneToOne(mappedBy = "reservation", cascade = { CascadeType.ALL })
	private BookTrip bookTrips;

	public BookTrip getBookTrips() {
		return bookTrips;
	}

	public void setBookTrips(BookTrip bookTrips) {
		this.bookTrips = bookTrips;
	}

	@OneToOne(mappedBy = "reservation", cascade = { CascadeType.ALL })
	private OrderProduct orderProduct;

	public OrderProduct getOrderProduct() {
		return orderProduct;
	}

	public void setOrderProduct(OrderProduct orderProduct) {
		this.orderProduct = orderProduct;
	}
}
