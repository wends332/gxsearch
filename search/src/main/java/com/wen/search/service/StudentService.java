package com.wen.search.service;

import com.wen.search.domain.Student;

/**
 * @author wendongsong
 */
public interface StudentService {

    void addStudent(Student student);

    Student selectByPrimaryKey(Integer id);

}
