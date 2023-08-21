package com.Springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.xml.Jdbc4SqlXmlHandler;

import com.Springjdbc.dao.StudentDao;
import com.Springjdbc.entities.student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context=new ClassPathXmlApplicationContext("com/Springjdbc/config.xml");
//        jdbcTemp template=context.getBean("jdbcTemp",jdbcTemp.class);
        
//        JdbcTemplate template= context.getBean("jdbcTemplate",JdbcTemplate.class);
//        
//        
//        //insert querry
//        String query="insert into student(id,name,city) values(?,?,?)";
//         
//        //fire querry
//        int result=template.update(query,12,"AjayKumar","Lucknow");
        
        StudentDao studentdao=context.getBean("studentDao",StudentDao.class);
        
//        student student =new student();
//        student.setId(123);
//        student.setName("Ajay");
//        student.setCity("Lucknow");
        
//        student student1 =new student();
//        student1.setId(1);
//        student1.setName("AjayYadav");
//        student1.setCity("LucknowCity");
//        
//        int result=studentdao.change(student1);
//        System.out.println("changed"+result);
        
        //DELETE
//        student student2 =new student();
//        int result=studentdao.delete(1);
//        System.out.println("deleted"+result);
        
        
        //
//        student student=studentdao.getStudent(12);
//        System.out.println(student);
        
    }
}
