package com.internousdev.ecsite.action;

import java.util.ArrayList;

import com.internousdev.ecsite.dao.UserListDAO;
import com.internousdev.ecsite.dto.UserInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class UserListAction extends ActionSupport {

	private ArrayList<UserInfoDTO> userInfoDTO = new ArrayList<UserInfoDTO>();
	private UserListDAO ulDAO = new UserListDAO();

	public String execute(){
		userInfoDTO = ulDAO.getUserList();
		return SUCCESS;
	}

	public ArrayList<UserInfoDTO> getUserInfoDTO(){
		return this.userInfoDTO;
	}


}
