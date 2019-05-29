package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;

public class ItemDeleteCompleteDAO {

	private DBConnector db = new DBConnector();
	private Connection con = db.getConnection();

	public void deleteItem(){
		String sql = "delete from item_info_transaction";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.execute();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
}
