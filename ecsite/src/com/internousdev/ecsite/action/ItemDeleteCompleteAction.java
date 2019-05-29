package com.internousdev.ecsite.action;

import com.internousdev.ecsite.dao.ItemDeleteCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemDeleteCompleteAction extends ActionSupport {

	public String execute(){
		ItemDeleteCompleteDAO idcDAO = new ItemDeleteCompleteDAO();
		idcDAO.deleteItem();
		return SUCCESS;
	}
}
