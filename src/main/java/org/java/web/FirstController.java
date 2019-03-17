package org.java.web;

import org.java.service.InfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;


@Controller
public class FirstController {

    @Autowired
    private InfService infService;

    @GetMapping("/init")
    public String init(Model model){

        List<Map> list = infService.getList();
        model.addAttribute("list",list );
        model.addAttribute("id","12345" );
        return "index";
    }


}
