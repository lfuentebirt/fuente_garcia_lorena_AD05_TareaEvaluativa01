package lfuente.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lfuente.domain.Alimento;
import lfuente.repository.AlimentoRepository;
import lfuente.repository.CategoriaRepository;

@Controller
@RequestMapping ("/alimentos")
public class AlimentoController {
	
	@Autowired
	AlimentoRepository alimentoRepository;
	
	@Autowired
	CategoriaRepository categoriaRepository;
	
	
	@GetMapping("/delete/{id}")
	public String initDelete(@PathVariable("id") Long id) {
		alimentoRepository.deleteById(id);
		return "redirect:/alimentos";
	}
	
	@GetMapping("/new")
	public String initCreationForm(Model model) {
		Alimento alimento = new Alimento();
		model.addAttribute("alimento", alimento);
		model.addAttribute("categorias", categoriaRepository.findAll());
		return "alimentoForm";
	}
	
	@PostMapping("/new/submit")
	public String submitCreationForm(@ModelAttribute Alimento alimento) {
		alimentoRepository.save(alimento);
		return "redirect:/alimentos";
	}
	
	@GetMapping("/edit/{id}")
	public String initEditForm(@PathVariable("id") Long id, Model model) {	
		model.addAttribute("alimento", alimentoRepository.findById(id));
		model.addAttribute("categoria", categoriaRepository.findAll());
		return "alimentoForm";
	}

}
