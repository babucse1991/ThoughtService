package com.thought.service.model;

import java.util.List;

import com.thought.service.bean.LoginUser;

public class HomeModel extends ModelTemplate {

	private String nameOfHome;
	private List<LoginUser> useList;
	
	public String getNameOfHome() {
		return nameOfHome;
	}

	public void setNameOfHome(String nameOfHome) {
		this.nameOfHome = nameOfHome;
	}

	public List<LoginUser> getUseList() {
		return useList;
	}

	public void setUseList(List<LoginUser> useList) {
		this.useList = useList;
	}
	
	
}
