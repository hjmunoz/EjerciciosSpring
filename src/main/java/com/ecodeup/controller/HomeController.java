package com.ecodeup.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String mostrarHome(Model model) {
		
		String articulo = "acces point dlink router";
		float precio = 25000;
		String descripcion = "para extender la señal de su router";
		
		model.addAttribute("articulo", articulo);
		model.addAttribute("precio", precio);
		model.addAttribute("descripcion", descripcion);
		
		return "home";
		
	}
	
}
