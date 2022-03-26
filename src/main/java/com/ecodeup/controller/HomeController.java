package com.ecodeup.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ecodeup.model.Producto;

@Controller
public class HomeController {

	@GetMapping("/")
	public String mostrarHome(Model model) {
		
		String articulo = "acces point dlink router";
		double precio = 25000;
		String descripcion = "para extender la señal de su router";
		
		model.addAttribute("articulo", articulo);
		model.addAttribute("precio", precio);
		model.addAttribute("descripcion", descripcion);
		
		Producto producto1 = new Producto();
		producto1.setId(1);
		producto1.setNombre("Consola");
		producto1.setDescripcion("Consola de videojuegos, de las emjores en el mercado");
		producto1.setPrecio(3000000);
		
		model.addAttribute("producto1", producto1);
		
		return "home";
		
	}
	
	@GetMapping("/lista")
	public String mostrarListado(Model model) {
		List<String> productos = new ArrayList<>();
		
		productos.add("Xbox");
		productos.add("Celular");
		productos.add("Control");
		productos.add("Portatil");
		
		model.addAttribute("productos", productos);
		
		return "lista";
		
	}
	
}
