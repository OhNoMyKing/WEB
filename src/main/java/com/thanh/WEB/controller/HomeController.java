package com.thanh.WEB.controller;

import com.thanh.WEB.model.Home;
import com.thanh.WEB.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class HomeController {
    @Autowired
    private HomeService homeService;
    //
    @PostMapping("/add-home")
    public String saveHome(@ModelAttribute("home") Home home,
                              @RequestParam("imageHome") MultipartFile imageHome) {
        homeService.save(imageHome, home);
        return "redirect:/home-list";
    }
    //
    @GetMapping("/home-list")
    public String homeList(Model model, @RequestParam(value = "pageNo", defaultValue = "1") Integer pageNo){
        Page<Home> homePage = homeService.findAll(pageNo);
        model.addAttribute("totalPage", homePage.getTotalPages());
        model.addAttribute("currentPage", pageNo);
        model.addAttribute("homePage", homePage);
        return "seller/product-list";
    }
}
