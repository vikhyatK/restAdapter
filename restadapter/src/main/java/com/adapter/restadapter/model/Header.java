package com.adapter.restadapter.model;

public class Header {
	private int sourceId;
	private String sourceTime;
	private String market;

	public void setSourceId(int sourceId) {
		this.sourceId = sourceId;
	}

	public void setSourceTime(String sourceTime) {
		this.sourceTime = sourceTime;
	}

	public void setMarket(String market) {
		this.market = market;
	}

	public int getSourceId() {
		return sourceId;
	}

	public String getSourceTime() {
		return sourceTime;
	}

	public String getMarket() {
		return market;
	}
	

}
