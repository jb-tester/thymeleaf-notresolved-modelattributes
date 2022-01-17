package com.mytests.thymeleaf.thymeleafnotresolvedmodelattributes;

import org.springframework.ui.ModelMap;

import java.util.ArrayList;
import java.util.Arrays;


public class ModelVars {
    public void addVars(ModelMap model){
        model.addAttribute("someindex",0);
        model.addAttribute("someint",10);
        model.addAttribute("someint2",20);
        model.addAttribute("somestr",0);
        model.addAttribute("someitem", new Item("prop1_val","prop2_val","prop3_val"));
        model.addAttribute("someflag", true);
        model.addAttribute("somelist", new ArrayList<String>(Arrays.asList("element1","element2","element3")));
    }
}
