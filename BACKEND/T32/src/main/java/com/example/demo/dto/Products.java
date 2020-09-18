package com.example.demo.dto;

import java.util.Date;
import javax.persistence.*; 

@Entity
@Table(name="products")
public class Products {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="detail")
	private String detail;
	
	@Column(name="created_at")
	private Date created_at;
	
	@Column(name="updated_at")
	private Date updated_at;
	
	public Products() {}

	/**
	 * @param id
	 * @param name
	 * @param detail
	 * @param created_at
	 * @param update_at
	 */
	public Products(int id, String name, String detail, Date created_at, Date update_at) {
		this.id = id;
		this.name = name;
		this.detail = detail;
		this.created_at = created_at;
		this.updated_at = update_at;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the detail
	 */
	public String getDetail() {
		return detail;
	}

	/**
	 * @param detail the detail to set
	 */
	public void setDetail(String detail) {
		this.detail = detail;
	}

	/**
	 * @return the created_at
	 */
	public Date getCreated_at() {
		return created_at;
	}

	/**
	 * @param created_at the created_at to set
	 */
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	/**
	 * @return the update_at
	 */
	public Date getUpdate_at() {
		return updated_at;
	}

	/**
	 * @param update_at the update_at to set
	 */
	public void setUpdate_at(Date update_at) {
		this.updated_at = update_at;
	}

	@Override
	public String toString() {
		return "Products [id=" + id + ", name=" + name + ", detail=" + detail + ", created_at=" + created_at
				+ ", update_at=" + updated_at + "]";
	}
	
}
