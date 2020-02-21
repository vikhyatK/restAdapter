package com.adapter.restadapter.model;

public class Party {
	private String partyId;
	private int partyRole;
	
	public Party(String id, int role) {
		this.partyId = id;
		this.partyRole = role;
	}
	
	public void setPartyId(String partyId) {
		this.partyId = partyId;
	}

	public void setPartyRole(int partyRole) {
		this.partyRole = partyRole;
	}

	public String getPartyId() {
		return partyId;
	}

	public int getPartyRole() {
		return partyRole;
	}

}
