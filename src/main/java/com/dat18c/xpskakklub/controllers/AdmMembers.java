package com.dat18c.xpskakklub.controllers;

import com.dat18c.xpskakklub.models.Member;
import com.dat18c.xpskakklub.services.SeMember;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("members")
public class AdmMembers {

        @Autowired
        SeMember seMember;

        @PostMapping("create")
        public String create(@ModelAttribute Member member){
            seMember.save(member);
            return "redirect:/members/list";
        }

        @GetMapping("/delete/{ident}")
        public String deleteMember (@PathVariable("ident") int id){
            seMember.delete(id);
            return "redirect:/members/list";
        }

        @GetMapping("/list")
        public String showMemberList(Model model){
            model.addAttribute("list", seMember.getAll());
            return "members/list";
        }

        @GetMapping("/update/{id}")
        public String update (@PathVariable("id") int id, Model model){
            model.addAttribute("list", seMember.getAll());
            model.addAttribute("member", seMember.findById(id));
            return "members/list";
        }

        @PostMapping("/update")
        public String updateM(@ModelAttribute Member member){
        seMember.save(member);
        return "redirect:/members/list";
    }


}
