package com.dat18c.xpskakklub.controllers;

import com.dat18c.xpskakklub.models.CompanyInfo;
import com.dat18c.xpskakklub.models.Contingent;
import com.dat18c.xpskakklub.services.SeCompanyInfo;
import com.dat18c.xpskakklub.services.SeContingent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("company")
public class AdmCompany {

    @Autowired
    SeContingent seContingent;

    @Autowired
    SeCompanyInfo seCompanyInfo;


    //all access no edit
    @GetMapping("/info")
    public String showCompanyInfo(Model model){
        model.addAttribute("info", seCompanyInfo.getInfo());
        model.addAttribute("list", seContingent.getAll());
        return "company/info";
    }
    //skal styres af access control
    @GetMapping("/contingent/delete/{ident}")
    public String deleteContingent (@PathVariable("ident") int id){
        seContingent.delete(id);
        return "redirect:/company/info";
    }
    //skal styres af access control
    @GetMapping("/contingent/update/{id}")
    public String update (@PathVariable("id") int id, Model model){
        model.addAttribute("info", seCompanyInfo.getInfo());
        model.addAttribute("list", seContingent.getAll());
        model.addAttribute("contingent", seContingent.findById(id));
        return "company/info";
    }

    @PostMapping("/update")
    public String updateC(@ModelAttribute Contingent contingent) {
        seContingent.save(contingent);
        return "redirect:/company/info";
    }
}
