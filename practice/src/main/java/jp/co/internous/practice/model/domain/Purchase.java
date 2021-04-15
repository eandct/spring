package jp.co.internous.practice.model.domain;

import java.sql.Timestamp;
import java.util.List;

public class Purchase {
	
	private long id;
	private long userId;
	private long goodsId;
	private long itemcount;
	private long price;
	private Timestamp createdAt;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public long getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(long goodsId) {
		this.goodsId = goodsId;
	}
	public long getItemcount() {
		return itemcount;
	}
	public void setItemcount(long itemcount) {
		this.itemcount = itemcount;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public Timestamp getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
	
}
