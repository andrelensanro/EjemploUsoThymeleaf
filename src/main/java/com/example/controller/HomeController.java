package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.model.Producto;

@Controller
public class HomeController {
	@GetMapping("/")
	public String mostrarHome(Model model){
		String articulo = "Sandalias para la playa";
		double precio = 22.06;
		String descripcion = "sandalias muy comadas para la playa, buena resistencia";
		
		
		model.addAttribute("articulo", articulo);
		model.addAttribute("precio", precio);
		model.addAttribute("descripcion", descripcion);
		
		
		Producto producto = new Producto();
		
		producto.setId(1);
		producto.setNombre("Silla para programador");
		producto.setDescripcion("Silla con respaldo muy comoda");
		producto.setPrecio(145);
		
		model.addAttribute("producto", producto);
		
		
		
		return "home";
	}
	
	@GetMapping("/lista")
	public String mostrarListado(Model model) {
		List<String> productos = new ArrayList<String>();
		productos.add("Silla para montar camarones");
		productos.add("Caballo de mar");
		productos.add("Arco para atrapar peces");
		
		model.addAttribute("productos", productos);
		
		return "lista";
	}
	@GetMapping("/tabla")
	public String mostrarProductos(Model model) {
		List<Producto> listaProductos = new ArrayList<Producto>();
		listaProductos = obtenerProductos();
		model.addAttribute("lista", listaProductos);
		return "lista";
	}
	

	private List<Producto> obtenerProductos(){
		
		List<Producto> listaProductos = new ArrayList<Producto>();
		
		Producto p1 = new Producto();
		p1.setId(1);
		p1.setNombre("Silla de montar camarones");
		p1.setDescripcion("Silla ergonomica");
		p1.setPrecio(123);
		Producto p2 = new Producto();
		p2.setId(2);
		p2.setNombre("Carrito de piedras de la suerte");
		p2.setDescripcion("Suerte si la pones sobre el cofre");
		p2.setPrecio(10);
		Producto p3 = new Producto();
		p3.setId(3);
		p3.setNombre("Green book");
		p3.setDescripcion("Para una mejor comodidad y molestar a los que deseen molestarse");
		p3.setPrecio(1345);
	
		listaProductos.add(p1);
		listaProductos.add(p2);
		listaProductos.add(p3);
		
		return listaProductos;
	}
	
	
}
