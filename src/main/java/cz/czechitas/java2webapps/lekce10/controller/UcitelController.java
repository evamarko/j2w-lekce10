package cz.czechitas.java2webapps.lekce10.controller;

import cz.czechitas.java2webapps.lekce10.service.UcitelService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/ucitel")
public class UcitelController {
    private final UcitelService ucitelService;

    public UcitelController(UcitelService ucitelService) {
        this.ucitelService = ucitelService;
    }

    @GetMapping("")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("/ucitel/index");
        modelAndView.addObject("ucitele", ucitelService.findAll());
        return modelAndView;
    }
}
