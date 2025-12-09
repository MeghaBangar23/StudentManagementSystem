package com.studentmanage.model;
import java.util.List;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Entity
@Table(name="Trainer_Table")
public class Trainer
{
@Id
@GeneratedValue(strategy =GenerationType.IDENTITY)
private long id;

@Column(name="name")
private String name;

@Column(name="Profile")
private String profile;

@Column(name="Exprience")
private double exprience;


@OneToMany(mappedBy = "trainer")
private List<Student> students;


public Trainer(){}

public Trainer(long id, String name, String profile, double exprience, List<Student> students) {
	super();
	this.id = id;
	this.name = name;
	this.profile = profile;
	this.exprience = exprience;
	this.students = students;
}

public long getId() 
{
	return id;
}

public void setId(long id) {
	this.id = id;
}



public String getName() {
	return name;
}



public void setName(String name) {
	this.name = name;
}



public String getProfile() {
	return profile;
}

public void setProfile(String profile) {
	this.profile = profile;
}

public double getExprience() {
	return exprience;
}

public void setExprience(double exprience) {
	this.exprience = exprience;
}

public List<Student> getStudents() {
	return students;
}

public void setStudents(List<Student> students) {
	this.students = students;
}

public String toString() 
{
	return String.valueOf(id);	
}



}
