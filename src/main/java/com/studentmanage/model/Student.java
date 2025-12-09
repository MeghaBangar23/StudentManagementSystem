package com.studentmanage.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table(name="student_info")
public class Student
{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int  id;
@Column(name="Name")
private String name;
@Column(name="Email")
private String email;
@Column(name="Course")
private String course;

@ManyToOne
@JoinColumn(name="Trainer_id")
private Trainer trainer;


public Student(){}
public Student(int id, String name, String email, String course, Trainer trainer) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.course = course;
	this.trainer = trainer;
}
public int getId() 
{
	return id;
}
public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getCourse() {
	return course;
}

public void setCourse(String course) {
	this.course = course;
}

public Trainer getTrainer() {
	return trainer;
}

public void setTrainer(Trainer trainer) {
	this.trainer = trainer;
}














}
