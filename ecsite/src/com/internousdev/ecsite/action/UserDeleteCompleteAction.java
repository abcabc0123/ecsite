package com.internousdev.ecsite.action;

import com.internousdev.ecsite.dao.UserDeleteCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UserDeleteCompleteAction extends ActionSupport{

	public String execute(){
		UserDeleteCompleteDAO dao = new UserDeleteCompleteDAO();
		dao.userListDelete();
		return SUCCESS;
	}
}
