package com.adapter.restadapter.model;

import java.util.List;

public class ExecReport {
	private int sourceId;
	private String execType;
	private List<Party> party;
	private String transactTime;
	private int rdMatchID;
	private String side;
	private String symbol;
	private int settlDate;
	private int settlType;
	private long lastQty;
	private double lastPx;
	private double grossTradeAmt;
	private String yield;
	private String isPreArrenged;
	private double stipulationValue;
	private String securitySubType;
	private String getSide;
	public void setSourceId(int sourceId) {
		this.sourceId = sourceId;
	}
	public void setExecType(String execType) {
		this.execType = execType;
	}
	public void setParty(List<Party> party) {
		this.party = party;
	}
	public void setTransactTime(String transactTime) {
		this.transactTime = transactTime;
	}
	public void setRdMatchID(int rdMatchID) {
		this.rdMatchID = rdMatchID;
	}
	public void setSide(String side) {
		this.side = side;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public void setSettlDate(int settlDate) {
		this.settlDate = settlDate;
	}
	public void setSettlType(int settlType) {
		this.settlType = settlType;
	}
	public void setLastQty(long lastQty) {
		this.lastQty = lastQty;
	}
	public void setLastPx(double lastPx) {
		this.lastPx = lastPx;
	}
	public void setGrossTradeAmt(double grossTradeAmt) {
		this.grossTradeAmt = grossTradeAmt;
	}
	public void setYield(String yield) {
		this.yield = yield;
	}
	public void setIsPreArrenged(String isPreArrenged) {
		this.isPreArrenged = isPreArrenged;
	}
	public void setStipulationValue(double stipulationValue) {
		this.stipulationValue = stipulationValue;
	}
	public void setSecuritySubType(String securitySubType) {
		this.securitySubType = securitySubType;
	}
	public void setGetSide(String getSide) {
		this.getSide = getSide;
	}
	public int getSourceId() {
		return sourceId;
	}
	public String getExecType() {
		return execType;
	}
	public List<Party> getParty() {
		return party;
	}
	public String getTransactTime() {
		return transactTime;
	}
	public int getRdMatchID() {
		return rdMatchID;
	}
	public String getSide() {
		return side;
	}
	public String getSymbol() {
		return symbol;
	}
	public int getSettlDate() {
		return settlDate;
	}
	public int getSettlType() {
		return settlType;
	}
	public long getLastQty() {
		return lastQty;
	}
	public double getLastPx() {
		return lastPx;
	}
	public double getGrossTradeAmt() {
		return grossTradeAmt;
	}
	public String getYield() {
		return yield;
	}
	public String getIsPreArrenged() {
		return isPreArrenged;
	}
	public double getStipulationValue() {
		return stipulationValue;
	}
	public String getSecuritySubType() {
		return securitySubType;
	}
	public String getGetSide() {
		return getSide;
	}
	
		
}
