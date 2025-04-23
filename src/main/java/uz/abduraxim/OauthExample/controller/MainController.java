package uz.abduraxim.OauthExample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class MainController {

    @GetMapping(value = "/maqsad")
    public String get(){
        return "O'zbekistonni birgalikda yuksaltiramiz";
    }
}
