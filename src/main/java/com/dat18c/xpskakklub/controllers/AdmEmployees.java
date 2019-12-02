package com.dat18c.xpskakklub.controllers;

import com.dat18c.xpskakklub.models.Employee;
import com.dat18c.xpskakklub.models.Member;
import com.dat18c.xpskakklub.repos.ReEmployee;
import com.dat18c.xpskakklub.services.SeEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("employee")
public class AdmEmployees {

    @Autowired
    SeEmployee seEmployee;
/*
    @GetMapping("/create")
    public String showCreate(){
        return "/employee/create";
    }
*/
    @PostMapping("/create")
    public String submitCreate(@ModelAttribute Employee employee){
        seEmployee.save(employee);
        return "redirect:/employee/list";
    }
    @GetMapping("/list")
    public String showMemberList(Model model){
        model.addAttribute("list", seEmployee.getAll());
        return "employee/list";
    }
    @GetMapping("/update/{id}")
    public String update (@PathVariable("id") int id, Model model){
        model.addAttribute("list", seEmployee.getAll());
        model.addAttribute("employee", seEmployee.findById(id));
        return "employee/list";
    }
    @PostMapping("/update")
    public String updateM(@ModelAttribute Employee employee){
        seEmployee.save(employee);
        return "redirect:/employee/list";
    }

    @GetMapping("/delete/{ident}")
    public String deleteMember (@PathVariable("ident") int id){
        seEmployee.delete(id);
        return "redirect:/employee/list";
    }


}
