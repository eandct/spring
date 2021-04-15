package jp.co.internous.practice.model.domain;

import java.sql.Timestamp;
import java.util.List;

public class Goods {
	
	private long id;
	private String goodsName;
	private long price;
	private Timestamp updatedAt;
	private List<Purchase> purcahseList;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public Timestamp getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}
	public List<Purchase> getPurcahseList() {
		return purcahseList;
	}
	public void setPurcahseList(List<Purchase> purcahseList) {
		this.purcahseList = purcahseList;
	}
	
	
}
