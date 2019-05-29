package com.internousdev.ecsite.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.ItemListDAO;
import com.internousdev.ecsite.dto.ItemListDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemListAction extends ActionSupport implements SessionAware {

	private Map<String,Object>session;
	private ItemListDAO itemListdao = new ItemListDAO();
	private ArrayList<ItemListDTO>itemListDTO = new ArrayList<ItemListDTO>();

	public String execute(){

		itemListDTO = itemListdao.getItemList();
		return SUCCESS;
	}

	public Map<String,Object> getSession(){
		return session;
	}

	@Override
	public void setSession(Map<String,Object> session){
		this.session = session;
	}

	public ArrayList<ItemListDTO> getItemListDTO(){
		return this.itemListDTO;
	}

	public void setItemListDTO(ArrayList<ItemListDTO> itemListDTO){
		this.itemListDTO = itemListDTO;
	}
}
