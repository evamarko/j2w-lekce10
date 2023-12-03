package cz.czechitas.java2webapps.lekce10.controller;

import cz.czechitas.java2webapps.lekce10.service.RodicService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/rodic")
public class RodicController {
    private final RodicService rodicService;

    public RodicController(RodicService rodicService) {
        this.rodicService = rodicService;
    }

    @GetMapping("")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("/rodic/index");
        modelAndView.addObject("rodice", rodicService.findAll());
        return modelAndView;
    }

    @GetMapping("/{id}")
    public ModelAndView detail(@PathVariable int id) {
        ModelAndView modelAndView = new ModelAndView("/rodic/detail");
        modelAndView.addObject("rodic", rodicService.findById(id));
        modelAndView.addObject("studenti", rodicService.getDeti(id));
        return modelAndView;
    }
}
