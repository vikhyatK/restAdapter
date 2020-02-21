package com.adapter.restadapter.model;

public class BvcSymboInfo {
	private String ISIN;
	private String reinv;
	private String transaction;
	private String liqTerm;
	private String trdSimType;
	private double captureValue;
	private String mktType;
	private String allowed;
	private String PTI;
	private String PET;
	private int seqType;
	private int seqNumber;
	private String horaOpe;
	public void setISIN(String iSIN) {
		ISIN = iSIN;
	}
	public void setReinv(String reinv) {
		this.reinv = reinv;
	}
	public void setTransaction(String transaction) {
		this.transaction = transaction;
	}
	public void setLiqTerm(String liqTerm) {
		this.liqTerm = liqTerm;
	}
	public void setTrdSimType(String trdSimType) {
		this.trdSimType = trdSimType;
	}
	public void setCaptureValue(double captureValue) {
		this.captureValue = captureValue;
	}
	public void setMktType(String mktType) {
		this.mktType = mktType;
	}
	public void setAllowed(String allowed) {
		this.allowed = allowed;
	}
	public void setPTI(String pTI) {
		PTI = pTI;
	}
	public void setPET(String pET) {
		PET = pET;
	}
	public void setSeqType(int seqType) {
		this.seqType = seqType;
	}
	public void setSeqNumber(int seqNumber) {
		this.seqNumber = seqNumber;
	}
	public void setHoraOpe(String horaOpe) {
		this.horaOpe = horaOpe;
	}
	public String getISIN() {
		return ISIN;
	}
	public String getReinv() {
		return reinv;
	}
	public String getTransaction() {
		return transaction;
	}
	public String getLiqTerm() {
		return liqTerm;
	}
	public String getTrdSimType() {
		return trdSimType;
	}
	public double getCaptureValue() {
		return captureValue;
	}
	public String getMktType() {
		return mktType;
	}
	public String getAllowed() {
		return allowed;
	}
	public String getPTI() {
		return PTI;
	}
	public String getPET() {
		return PET;
	}
	public int getSeqType() {
		return seqType;
	}
	public int getSeqNumber() {
		return seqNumber;
	}
	public String getHoraOpe() {
		return horaOpe;
	}
	
}
