package com.mfu.entity;

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
@Table(name="Bill")
public class Bill implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="billId")
	private long billId;
	@Column(name="totalPrice")
	private double totalPrice;
	@Column(name="billPic")
	private String billPic;
	@Column(name="bookingStatus")
	private String bookingStatus;

}
