package org.example;

import org.apache.ibatis.session.SqlSession;
import org.example.dao.StudentDao;
import org.example.domain.Student;
import org.example.utils.MyBatisUtils;
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
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao  = sqlSession.getMapper(StudentDao.class);
        List<Student> studentList  = dao.selectStudents();
        for(Student stu:studentList){
            System.out.println(stu);
        }

        Student student = new Student();
        student.setId(1007);
        student.setName("卤蛋");
        student.setEmail("ludan@qq.com");
        student.setAge(20);
        int nums = dao.insertStudent(student);
        sqlSession.commit();
        System.out.println("添加对象的数量："+nums);
    }


}
