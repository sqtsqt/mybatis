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

//        Student student = dao.selectStudentById(1002);
//        System.out.println("student=" + student);

        List<Student> students = dao.selectMultiParam("刘备",19);
        for(Student stu: students){
            System.out.println("学生="+stu);
        }
        sqlSession.close();
    }


}
