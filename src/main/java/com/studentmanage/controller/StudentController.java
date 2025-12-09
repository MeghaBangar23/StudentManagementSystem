package com.studentmanage.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.studentmanage.model.Student;
import com.studentmanage.service.StudentService;
import com.studentmanage.service.TrainerService;
@Controller
public class StudentController
{	

@Autowired
private StudentService studentService;

@Autowired
private  TrainerService trainerSer;


@GetMapping("/getAllstudent")
public String getAllStudnet(Model model)
{
	model.addAttribute("listStudent",studentService.viewAllStudent());
	return "view_all_student";
}



@GetMapping("/addStudent")
public String addStudent(Model model)
{
	Student stu=new Student();
	model.addAttribute("student", stu);
	model.addAttribute("allTrainer",trainerSer.getAllTraner());
	return "addnew_student";
	
}



@PostMapping("/savestd")
public String saveNewStundent(@ModelAttribute("student") Student stu )
{
	studentService.saveStudnet(stu);
	return "redirect:/getAllstudent";
}




@GetMapping("/updateStudent/{id}")
public String updateStudentById(@PathVariable Integer id,Model model)
{
	Student std=studentService.getStudentById(id);
	model.addAttribute("stu", std);
	model.addAttribute("AllTrainer",trainerSer.getAllTraner());
	return "update_student_page";	
}



@PostMapping("/stud/{id}")
public String updatedStudent(@PathVariable Integer id, @ModelAttribute("Traner 2") Student student )
{
	student.setId(id);
	studentService.saveStudnet(student);
	return  "redirect:/getAllstudent";
}




@GetMapping("/deletestudent/{id}")
public String removeStudnetById(@PathVariable Integer id)
{
	studentService.deleteStudentById(id);
	return "redirect:/getAllstudent";
}








}
