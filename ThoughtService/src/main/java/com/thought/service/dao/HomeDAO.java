package com.thought.service.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.thought.service.bean.LoginUser;
import com.thought.service.model.HomeModel;

@Service("homeDAO")
public class HomeDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public HomeModel getHomeDetails() {

		String sql =" select FIRST_NAME, LAST_NAME, RCD_CRD_ID,RCD_CRD_DT, LST_UPDT_ID, LST_UPDT_DT, EMAIL  from LOGIN_USERS WHERE PHONE_NO = ? ";
		
		Object  args[] = {"9500478561"};
		int argTypes[] = {Types.NUMERIC};
		
		List<LoginUser> useList = jdbcTemplate.query(sql, args, argTypes, new RowMapper<LoginUser>() {

			@Override
			public LoginUser mapRow(ResultSet rs, int arg1)
					throws SQLException {
				LoginUser user = new LoginUser();
				user.setFirstName(rs.getString("FIRST_NAME"));
				user.setLastName(rs.getString("LAST_NAME"));
				user.setCreatedId(rs.getString("RCD_CRD_ID"));
				user.setCreatedTs(rs.getDate("RCD_CRD_DT"));
				user.setUpdatedId(rs.getString("LST_UPDT_ID"));
				user.setUpdatedTs(rs.getDate("LST_UPDT_DT"));
				user.setEmail(rs.getString("EMAIL"));
				return user;
			}
		});
		
		
		HomeModel model = new HomeModel();
		model.setUseList(useList);
		model.setNameOfHome("This is my first framwork!");
		return model;

	}
}
