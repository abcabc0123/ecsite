package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.ecsite.dto.UserInfoDTO;
import com.internousdev.ecsite.util.DBConnector;

public class UserListDAO {

	private DBConnector db = new DBConnector();
	private Connection con = db.getConnection();

	public ArrayList<UserInfoDTO> getUserList(){
		ArrayList<UserInfoDTO> userInfoDTO = new ArrayList<UserInfoDTO>();
		String sql = "select login_id,login_pass,user_name,insert_date from login_user_transaction";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				UserInfoDTO dto = new UserInfoDTO();
				dto.setUserId(rs.getString("login_id"));
				dto.setUserPass(rs.getString("login_pass"));
				dto.setUserName(rs.getString("user_name"));
				dto.setInsertDate(rs.getString("insert_date"));
				userInfoDTO.add(dto);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return userInfoDTO;
	}
}
