package com.gobeyond.custome.validator.service;

import java.util.List;

import com.gobeyond.custome.validator.model.Student;

public interface StudentService {

	public boolean saveStudent(Student student);

	public List<Student> getStudents();

	public boolean deleteStudent(long l);

	public List<Student> getStudentByID(Student student);

	public boolean updateStudent(Student student);

	public List<Student> findAll();

	public Student findByStudentNumber(Long studentNumber);

	public Student findByEmail(String email);

	public List<Student> findAllByOrderByGpaDesc();

}
