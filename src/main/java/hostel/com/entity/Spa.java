package hostel.com.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Spa")
public class Spa implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "spaId")
	private long spaId;
	@Column(name = "spaName")
	private String spaName;
	@Column(name = "spaDetail")
	private String spaDetail;
	@Column(name = "spaPic")
	private String spaPic;
	@Column(name = "spaPrice")
	private double spaPrice;

}
