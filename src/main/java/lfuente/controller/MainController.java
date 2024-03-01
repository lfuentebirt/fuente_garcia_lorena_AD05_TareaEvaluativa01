package lfuente.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lfuente.repository.AlimentoRepository;
import lfuente.repository.CategoriaRepository;

// Controlador principal
@Controller
public class MainController {
	
	// Utilizamos los Repositorios de ambas entidades, para acceder a sus métodos
	@Autowired
   	private AlimentoRepository alimentoRepository;
	
	@Autowired
   	private CategoriaRepository categoriaRepository;
	
	// Página principal que nos lleva al index
	@GetMapping ({"/","/welcome"})
	public String welcome() {
		return "index";
	}
	
	// Listado de alimentos
	@GetMapping ({"/alimentos"})
	public String getAlimentos(Model model) {
		model.addAttribute("alimentos", alimentoRepository.findAll());
		return "alimentos";
	}
	
	// Listado de categorias
	@GetMapping ({"/categorias"})
	public String getCategorias(Model model) {
		model.addAttribute("categorias", categoriaRepository.findAll());
		return "categorias";
	}

}
