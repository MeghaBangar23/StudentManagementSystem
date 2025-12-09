package com.studentmanage.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentmanage.model.Student;
import com.studentmanage.reppository.StudentRepository;
@Service
public class StudentService
{
@Autowired
private StudentRepository studentRepository;
public List<Student> viewAllStudent()
{
	return studentRepository.findAll();
}


public Student getStudentById(Integer id)
{
	return studentRepository.findById(id).orElseThrow();
}



public Student saveStudnet(Student student)
{
	return studentRepository.save(student);
}



public void deleteStudentById(Integer id)
{
	    studentRepository.deleteById(id);
}

}
