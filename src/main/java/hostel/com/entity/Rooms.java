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
public class Rooms implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long roomId;
	private String roomType;
	private String roomDetail;
	private String roomPic;
	private String roomStatus;
	private String roomPrice;
	public String getRoomStatus() {
		return roomStatus;
	}

	public void setRoomStatus(String roomStatus) {
		this.roomStatus = roomStatus;
	}

	public long getRoomId() {
		return roomId;
	}

	public void setRoomId(long roomId) {
		this.roomId = roomId;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public String getRoomDetail() {
		return roomDetail;
	}

	public void setRoomDetail(String roomDetail) {
		this.roomDetail = roomDetail;
	}

	public String getRoomPic() {
		return roomPic;
	}

	public void setRoomPic(String roomPic) {
		this.roomPic = roomPic;
	}
	
	@OneToMany(mappedBy="rooms", cascade= {CascadeType.ALL})
	private List<BookRoom> bookRooms;

	public List<BookRoom> getBookRooms() {
		return bookRooms;
	}

	public void setBookRooms(List<BookRoom> bookRooms) {
		this.bookRooms = bookRooms;
	}

	public String getRoomPrice() {
		return roomPrice;
	}

	public void setRoomPrice(String roomPrice) {
		this.roomPrice = roomPrice;
	}

	

}
