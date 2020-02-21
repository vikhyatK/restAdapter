package com.adapter.restadapter.model;

public class Payload {
	private Header header;
	private BvcSymboInfo bvcSymboInfo;
	private EquitiesInfo equitiesInfo;
	private SecurityList securityList;
	private MecSymbolInfo mecSymbolInfo;
	private ExecReport execReport;
	public void setHeader(Header header) {
		this.header = header;
	}
	public void setBvcSymboInfo(BvcSymboInfo bvcSymboInfo) {
		this.bvcSymboInfo = bvcSymboInfo;
	}
	public void setEquitiesInfo(EquitiesInfo equitiesInfo) {
		this.equitiesInfo = equitiesInfo;
	}
	public void setSecurityList(SecurityList securityList) {
		this.securityList = securityList;
	}
	public void setMecSymbolInfo(MecSymbolInfo mecSymbolInfo) {
		this.mecSymbolInfo = mecSymbolInfo;
	}
	public void setExecReport(ExecReport execReport) {
		this.execReport = execReport;
	}
	public Header getHeader() {
		return header;
	}
	public BvcSymboInfo getBvcSymboInfo() {
		return bvcSymboInfo;
	}
	public EquitiesInfo getEquitiesInfo() {
		return equitiesInfo;
	}
	public SecurityList getSecurityList() {
		return securityList;
	}
	public MecSymbolInfo getMecSymbolInfo() {
		return mecSymbolInfo;
	}
	public ExecReport getExecReport() {
		return execReport;
	}
	
}
