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
@Table(name = "Rooms")
public class Rooms implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "roomId")
	private long roomId;
	@Column(name = "roomType")
	private String roomType;
	@Column(name = "roomDetail")
	private String roomDetail;
	@Column(name = "roomPic")
	private String roomPic;
	@Column(name = "roomStatus")
	private String roomStatus;
	@Column(name = "roomPrice")
	private double roomPrice;

}
