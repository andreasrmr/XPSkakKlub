package com.dat18c.xpskakklub.controllers;

import com.dat18c.xpskakklub.models.Employee;
import com.dat18c.xpskakklub.services.SeEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("employees")
public class AdmEmployees {

    @Autowired
    SeEmployee seEmployee;

    @GetMapping("create")
    public String showCreate(){
        return "/employee/create";
    }

    @PostMapping("create")
    public String submitCreate(@ModelAttribute Employee employee){
        seEmployee.save(employee);
        return "redirect:/employees/create";
    }


}
