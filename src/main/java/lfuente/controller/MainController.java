package lfuente.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lfuente.repository.AlimentoRepository;
import lfuente.repository.CategoriaRepository;

@Controller
public class MainController {
	
	@Autowired
   	private AlimentoRepository alimentoRepository;
	@Autowired
   	private CategoriaRepository categoriaRepository;
	
	@GetMapping ({"/","/welcome"})
	public String welcome() {
		return "index";
	}
	
	@GetMapping ({"/alimentos"})
	public String getAlimentos(Model model) {
		model.addAttribute("alimentos", alimentoRepository.findAll());
		return "alimentos";
	}
	
	@GetMapping ({"/categorias"})
	public String getCategorias(Model model) {
		model.addAttribute("categorias", categoriaRepository.findAll());
		return "categorias";
	}

}
