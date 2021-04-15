package jp.co.internous.practice.model.domain.dto;

import java.sql.Timestamp;

public class HistoryDto {
	
	private long id;
	private long userId;
	private long goodsId;
	private String goodsName;
	private long itemCount;
	private long total;
	private Timestamp createdAt;
	
	public HistoryDto() {}
	
	public HistoryDto(Goods goods) {
		Purchase p = goods.getPurchaseList().get(0);
		this.setId(p.getId())
	}

}
