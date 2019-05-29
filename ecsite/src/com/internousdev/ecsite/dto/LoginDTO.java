package com.internousdev.ecsite.dto;

public class LoginDTO {

	public String loginId;
	public String loginPassword;
	public String userName;
	public boolean loginFlg = false;
	public boolean adminFlg = false;


	public String getLoginId(){
		return loginId;
	}

	public void setLoginId(String loginId){
		this.loginId = loginId;
	}

	public String getLoginPasswrd(){
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword){
		this.loginPassword = loginPassword;
	}

	public String getUserName(){
		return userName;
	}

	public void setUserName(String userName){
		this.userName = userName;
	}

	public boolean getLoginFlg(){
		return loginFlg;
	}

	public void setLoginFlg(boolean loginFlg){
		this.loginFlg = loginFlg;
	}

	public boolean getAdminFlg(){
		return adminFlg;
	}

	public void setAdminFlg(boolean adminFlg){
		this.adminFlg = adminFlg;
	}

}
