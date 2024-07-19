package com.anily.validationdemo.controller;

import com.anily.validationdemo.model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerController {

    @GetMapping("/")
    public String showForm(Model model){
        model.addAttribute("customer", new Customer());
        return "customer-form";
    }


}
