package com.mfu.entity;

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
@Table(name = "Trip")
public class Trip implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "tripId")
	private long tripId;
	@Column(name = "tripName")
	private String tripName;
	@Column(name = "tripDetail")
	private String tripDetail;
	@Column(name = "tripPic")
	private String tripPic;
	@Column(name = "tripPrice")
	private double tripPrice;

}
