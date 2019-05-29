package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.ecsite.dto.ItemListDTO;
import com.internousdev.ecsite.util.DBConnector;

public class ItemListDAO {

	private DBConnector db = new DBConnector();
	private Connection con = db.getConnection();



	public ArrayList<ItemListDTO> getItemList(){
		String sql = "select item_name,item_price,item_stock,insert_date from item_info_transaction";
		ArrayList<ItemListDTO>itemListDTO = new ArrayList<ItemListDTO>();

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while(rs.next()){
			    ItemListDTO dto = new ItemListDTO();
				dto.setItemName(rs.getString("item_name"));
				dto.setItemPrice(rs.getString("item_price"));
				dto.setItemStock(rs.getString("item_stock"));
				dto.setInsertDate(rs.getString("insert_date"));
				itemListDTO.add(dto);
			}
		} catch(SQLException e){
			e.printStackTrace();
		}
		return itemListDTO;
	}
}
