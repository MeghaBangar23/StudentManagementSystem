package com.studentmanage.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.studentmanage.model.Trainer;
import com.studentmanage.service.TrainerService;
@Controller
public class TrainerController
{
	
@Autowired
private TrainerService trainerService;

@GetMapping("/alltrainer")
public String getAllTrainer(Model model)
{
	model.addAttribute("listrainer",trainerService.getAllTraner());
	return "view_trainer";
}
@GetMapping("/newTrainer")
public String addNewTrainer(Model model)
{
	Trainer trainer=new Trainer();
	model.addAttribute("trainer",trainer);
	return "New_trainer_Form";
}

@PostMapping("/saveTrainer")
public String saveTrainer(@ModelAttribute("trainer") Trainer trainer)
{
	trainerService.savaTrainer(trainer);
	return "redirect:/alltrainer";
}

@GetMapping("/updateTrainer/{id}")
public String updateTranerById(@PathVariable Long id,Model model)
{
Trainer trainer=trainerService.getTrainerById(id);
model.addAttribute("trainer2", trainer);
return  "Update_trainer_form";
}

@PostMapping("/{idd}")
public String updatedTraner(@PathVariable Long idd,@ModelAttribute("Traner2") Trainer tranier )
{
	tranier.setId(idd);
	trainerService.savaTrainer(tranier);
	return "redirect:/alltrainer";
}

@GetMapping("/deleteTrainer/{id}")
public String deleteTrainerById(@PathVariable Long id)
{
	trainerService.deleteTrainerById(id);
	return "redirect:/alltrainer";
}







}
