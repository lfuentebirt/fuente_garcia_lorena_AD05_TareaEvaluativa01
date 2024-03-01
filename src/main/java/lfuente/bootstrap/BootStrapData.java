/*package lfuente.bootstrap;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lfuente.domain.Alimento;
import lfuente.repository.AlimentoRepository;

import lfuente.domain.Categoria;
import lfuente.repository.CategoriaRepository;

@Component
public class BootStrapData implements CommandLineRunner{
	
	@Autowired
	private AlimentoRepository alimentoRepository;
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Override
	public void run(String... arg0) throws Exception {
		Alimento alimento = new Alimento("Manzana", "Verde","Italia", 3);
		alimentoRepository.save(alimento);
		
        System.out.println("Cuento los alimentos: " + alimentoRepository.count());
        
        Categoria categoria = new Categoria("Frutas", "Alimento vegetal dulce");
        categoria.getAlimentos().add(alimento);
        
		categoriaRepository.save(categoria);
		
		
        System.out.println("Cuento los alimentos: " + alimentoRepository.count());
        System.out.println("Cuento las categorrias: " + categoriaRepository.count());
			
	}
}
*/
