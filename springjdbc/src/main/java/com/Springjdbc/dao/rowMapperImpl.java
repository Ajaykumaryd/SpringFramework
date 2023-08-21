package com.Springjdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.Springjdbc.entities.student;

public class rowMapperImpl implements RowMapper<student>{

	@Override
	public student mapRow(ResultSet rs, int rowNum) throws SQLException {
	student student=new student();
	student.setId(rs.getInt(1));
	student.setName(rs.getString(2));
	student.setName(rs.getString(3));
	return student;
	}
	

}
