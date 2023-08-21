package com.Springjdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.Springjdbc.entities.student;

public class StudentDaoImpl implements StudentDao {

	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
		this.jdbcTemplate = jdbcTemplate;
	}

	private  JdbcTemplate jdbcTemplate;
	
	public int insert(student student){
	
        String query="insert into student(id,name,city) values(?,?,?)";
        int r=this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
        return r;
	}

	@Override
	public int change(student student){
		  String query="UPDATE student"
		  		+ "SET name = ?, city = ?"
		  		+ "WHERE id = ?;"
		  		+ "";
      int r=this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());       
	  return r;
	}

	@Override
	public int delete(int studentId){
	String query="delete from student where id=?";
	int result=this.jdbcTemplate.update(query,studentId);
	return result;
	}

	@Override
	public student getStudent(int studentId) {
		// TODO Auto-generated method stub
    String query="select * from student where id=?";		
	
   
	RowMapper<student>rowMapper=new rowMapperImpl();
    
    student student=this.jdbcTemplate.queryForObject(query,rowMapper,studentId);	
	return student;
	}

	@Override
	public List<student> getList() {
    String query="select * from students";
    List<student> s=this.jdbcTemplate.query(query,new rowMapperImpl());
	return s;
	}

	

}
