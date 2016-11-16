package com.thought.service.model;


public class ModelTemplate {
	
	private String userId;
	
	private boolean readOnly;
	
	private String userNm;
	
	private String actionCd;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public boolean isReadOnly() {
		return readOnly;
	}
	
	public void setReadOnly(boolean readOnly) {
		this.readOnly = readOnly;
	}
	
	public String getActionCd() {
		return actionCd;
	}
	public void setActionCd(String actionCd) {
		this.actionCd = actionCd;
	}
	public String getUserNm() {
		return userNm;
	}
	public void setUserNm(String userNm) {
		this.userNm = userNm;
	}
	
}
