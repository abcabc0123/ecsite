package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;

public class UserDeleteCompleteDAO {

	private DBConnector db = new DBConnector();
	private Connection con = db.getConnection();

	public void userListDelete(){
		String sql = "delete from login_user_transaction";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.execute();

		}catch(SQLException e){
			e.printStackTrace();
		}
	}
}
