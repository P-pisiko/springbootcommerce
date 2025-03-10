package dev.commerse.controllers;

import dev.commerse.beans.Item;
import dev.commerse.database.DatabaseAccess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @Autowired
    DatabaseAccess db;

    @GetMapping("/")
    public String index(Model model) {

        System.out.println(db.getItemsList());
        model.addAttribute("itemList", db.getItemsList());
        return  "home";
    }

}
