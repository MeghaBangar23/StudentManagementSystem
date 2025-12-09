package com.studentmanage.reppository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studentmanage.model.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer> 
{

}
