package cz.czechitas.java2webapps.lekce10.controller;

import cz.czechitas.java2webapps.lekce10.service.TridaService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/trida")
public class TridaController {

    private final TridaService tridaService;

    public TridaController(TridaService tridaService) {
        this.tridaService = tridaService;
    }

    @GetMapping("")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("/trida/index");
        modelAndView.addObject("tridy", tridaService.findAll());
        return modelAndView;
    }

    @GetMapping("/{id}")
    public ModelAndView detail(@PathVariable int id) {
        ModelAndView modelAndView = new ModelAndView("/trida/detail");
        modelAndView.addObject("trida", tridaService.findById(id));
        modelAndView.addObject("studenti", tridaService.getStudents(id));
        return modelAndView;
    }
}
