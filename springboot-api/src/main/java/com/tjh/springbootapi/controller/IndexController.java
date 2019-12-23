package com.tjh.springbootapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class IndexController {

    @RequestMapping(value = "index")
    public String toIndex() {
        return "indexController";
    }

    @GetMapping("/detail")
    public String toDetail(Model model, HttpServletRequest request) {
        String id = request.getParameter("id");
        return "report/" + id;
    }

}
