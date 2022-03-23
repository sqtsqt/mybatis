package org.example.dao;

import org.apache.ibatis.annotations.Param;
import org.example.domain.Student;

import java.util.List;

public interface StudentDao {
    //public Student selectStudentById(Integer id);

    List<Student> selectMultiParam(@Param("myname") String name,
                                   @Param("myage") Integer age);

    int insertStudent(Student student);
}
