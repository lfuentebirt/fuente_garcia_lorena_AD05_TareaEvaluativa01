package lfuente.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lfuente.domain.Categoria;
import lfuente.repository.CategoriaRepository;


@Controller
@RequestMapping ("/categorias")
public class CategoriaController {

	@Autowired
	CategoriaRepository categoriaRepository;
	// CRUD
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable("id") Long id) {
		categoriaRepository.deleteById(id);
		return "redirect:/categorias";
	}
	
	@GetMapping("/new")
	public String initCreationForm(Model model) {
		Categoria categoria = new Categoria();
		model.addAttribute("categoria", categoria);
		return "categoriaForm";
	}
	
	@PostMapping("/new/submit")
	public String processCreationForm(@ModelAttribute Categoria categoria) {
		categoriaRepository.save(categoria);
		return "redirect:/categorias";
	}
	
	@GetMapping("/edit/{id}")
	public String initEditForm(@PathVariable("id") Long id, Model model) {	
		model.addAttribute("categoria", categoriaRepository.findById(id));
		return "categoriaForm";
	}

}
