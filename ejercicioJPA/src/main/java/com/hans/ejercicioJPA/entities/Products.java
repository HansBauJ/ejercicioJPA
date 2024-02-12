package com.hans.ejercicioJPA.entities;

import java.sql.Blob;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Products {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long product_id;
	private String name;
	private long price;
	private Blob image;
	private String desc;
	private long t_p_i;
	private boolean status;
	@JoinComumn(name = "") //I´m to late for evething i need to get at the same pint that my equals at eht java trainee curse, i need to be at the same at the QA sessions
	private OrderHistory OderHist;

	public long getProduct_id() {
		return product_id;
	}

	public void setProduct_id(long product_id) {
		this.product_id = product_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public Blob getImage() {
		return image;
	}

	public void setImage(Blob image) {
		this.image = image;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public long getT_p_i() {
		return t_p_i;
	}

	public void setT_p_i(long t_p_i) {
		this.t_p_i = t_p_i;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
