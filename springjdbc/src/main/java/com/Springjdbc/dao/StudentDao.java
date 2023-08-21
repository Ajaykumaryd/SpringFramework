package com.Springjdbc.dao;

import java.util.List;

import com.Springjdbc.entities.student;

public interface StudentDao {
    public int insert(student student);
    public int change(student student);
    public int delete(int studentId);
    public student getStudent(int studentId);
    
    public List<student>getList();
    
}
