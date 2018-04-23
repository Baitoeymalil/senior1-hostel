package com.mfu.entity;

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
@Table(name="Reservation")
public class Reservation implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="reservationId")
	private long reservationId;
	@DateTimeFormat (pattern = "yyyy-MM-dd")
	@Column(name="reservationDate")
	private Date reservationDate;

	
}
