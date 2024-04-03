package com.thanh.WEB.controller;

import com.thanh.WEB.model.Home;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class addController {
    @GetMapping("/toadd")
    public String nextAddHome(Home home, Model model){
        model.addAttribute("home", home);
        return "/seller/add-product";
    }
}
