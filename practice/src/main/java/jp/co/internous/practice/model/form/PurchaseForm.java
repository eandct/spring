package jp.co.internous.practice.model.form;

public class PurchaseForm {
	
	private long userId;
	private long goodsId;
	private long itemCount;
	private long price;
	
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
	public long getItemCount() {
		return itemCount;
	}
	public void setItemCount(long itemCount) {
		this.itemCount = itemCount;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	
	
}
