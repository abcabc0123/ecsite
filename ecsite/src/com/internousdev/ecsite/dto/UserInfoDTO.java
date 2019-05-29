package com.internousdev.ecsite.dto;

public class UserInfoDTO {

	private String userId;
	private String userPass;
	private String userName;
	private String insertDate;

	public String getUserId(){
		return userId;
	}

	public void setUserId(String userId){
		this.userId = userId;
	}

	public String getUserPass(){
		return userPass;
	}

	public void setUserPass(String userPass){
		this.userPass = userPass;
	}

	public String getUserName(){
		return userName;
	}

	public void setUserName(String userName){
		this.userName = userName;
	}

	public String getInsertDate(){
		return insertDate;
	}

	public void setInsertDate(String insertDate){
		this.insertDate = insertDate;
	}
}
