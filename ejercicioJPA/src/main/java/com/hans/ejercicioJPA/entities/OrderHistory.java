package com.hans.ejercicioJPA.entities;

import java.sql.Date;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class OrderHistory {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long order_id;
	@Temporal(TemporalType.DATE)
	private Date order_date;
	@JoinColumn(name = "USER_ID")
	private Users user;
	@JoinColumn(name = "PRODUCT_ID")
	private Set<Products> products;

	public long getOrder_id() {
		return order_id;
	}

	public void setOrder_id(long order_id) {
		this.order_id = order_id;
	}

	public Date getOrder_date() {
		return order_date;
	}

	public void setOrder_date(Date order_date) {
		this.order_date = order_date;
	}
}
