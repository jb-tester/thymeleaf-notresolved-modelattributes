package com.mytests.thymeleaf.thymeleafnotresolvedmodelattributes;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;

@Controller
public class MyController {



    @RequestMapping("/notresolved_vars")
    public String notresolved_vars(ModelMap model) {
        model.addAttribute("resolved_list", new ArrayList<>(Arrays.asList("element11","element22","element33")));
        new ModelVars().addVars(model);
        return "notresolved_vars";
    }

}
