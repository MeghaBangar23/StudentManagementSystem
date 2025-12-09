package com.studentmanage.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentmanage.model.Admin;
import com.studentmanage.reppository.AdminRepository;
@Service
public class AdminService 
{
	@Autowired
	private AdminRepository adminRepository;
	public List<Admin> getAllAdmin()
	{
		return adminRepository.findAll();	
	}
	
	public Admin getAdminById(Integer id) 
	{
		return adminRepository.findById(id).orElseThrow();		
	}
	
	public void deleteAdminById(Integer id) 
	{
		adminRepository.deleteById(id);	
	}
}
