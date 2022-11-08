package com.restuarant.model;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class menu {
	
	@Id
	private Long mId;
	private String dish;
	private String desc;
	private int price;
	public menu() {
		super();
		// TODO Auto-generated constructor stub
	}
	public menu(Long mId, String dish, String desc, int price) {
		super();
		this.mId = mId;
		this.dish = dish;
		this.desc = desc;
		this.price = price;
	}
	public Long getmId() {
		return mId;
	}
	public void setmId(Long mId) {
		this.mId = mId;
	}
	public String getDish() {
		return dish;
	}
	public void setDish(String dish) {
		this.dish = dish;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
