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
@Table(name = "OrderProduct")
@Entity
public class OrderProduct implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "orderProductId")
	private long orderProductId;
	@Column(name = "orderProductDate")
	private Date orderProductDate;
	@Column(name = "productUnit")
	private int productUnit;

}
