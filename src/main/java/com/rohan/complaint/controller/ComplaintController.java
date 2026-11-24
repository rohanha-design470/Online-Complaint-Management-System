package com.rohan.complaint.controller;
import com.rohan.complaint.entity.Complaint;
import com.rohan.complaint.service.ComplaintService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
@Controller
public class ComplaintController {
 private final ComplaintService service;
 public ComplaintController(ComplaintService service){this.service=service;}
 @GetMapping("/") public String home(Model model){model.addAttribute("complaint",new Complaint());return "index";}
 @PostMapping("/submit") public String submit(@Valid @ModelAttribute Complaint complaint, BindingResult result, Model model){
  if(result.hasErrors()){model.addAttribute("complaint",complaint);return "index";}
  Complaint saved=service.save(complaint);return "redirect:/success/"+saved.getId();
 }
 @GetMapping("/success/{id}") public String success(@PathVariable Long id,Model model){model.addAttribute("complaint",service.find(id));return "success";}
 @GetMapping("/track") public String trackForm(){return "track";}
 @PostMapping("/track") public String track(@RequestParam String email,Model model){model.addAttribute("email",email);model.addAttribute("complaints",service.byEmail(email));return "track";}
 @GetMapping("/admin") public String admin(Model model){model.addAttribute("complaints",service.all());return "admin";}
 @PostMapping("/admin/{id}/status") public String update(@PathVariable Long id,@RequestParam String status){service.updateStatus(id,status);return "redirect:/admin";}
 @PostMapping("/admin/{id}/delete") public String delete(@PathVariable Long id){service.delete(id);return "redirect:/admin";}
}
