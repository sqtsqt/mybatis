package org.example;

import org.example.dao.StudentDao;
import org.example.dao.impl.StudentDaoImpl;
import org.example.domain.Student;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        StudentDao dao  = new StudentDaoImpl();
        List<Student> studentList  = dao.selectStudents();
        for(Student stu:studentList){
            System.out.println(stu);
        }

        Student student = new Student();
        student.setId(1005);
        student.setName("盾山");
        student.setEmail("dunshan@qq.com");
        student.setAge(19);
        int nums = dao.insertStudent(student);
        System.out.println("添加对象的数量："+nums);
    }


}
