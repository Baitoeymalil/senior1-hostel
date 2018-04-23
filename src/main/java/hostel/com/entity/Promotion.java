package hostel.com.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
@Entity
@Table(name = "Promotion")
public class Promotion implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "promotionId")
	private long promotionId;
	@Column(name = "startDate")
	private Date startDate;
	@Column(name = "endDate")
	private Date endDate;
	@Column(name = "promotionCode")
	private String promotionCode;
	@Column(name = "discountRate")
	private String discountRate;
	@Column(name = "promotionPic")
	private String promotionPic;

}
