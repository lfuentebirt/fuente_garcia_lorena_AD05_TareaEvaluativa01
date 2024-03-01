package lfuente;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
 *	AD05_TE01 -   Framework para el acceso de datos
 *				  Lorena Fuente (DAM)
 *				  Aplicación que muestra un listado de alimentos y su categoría.
 *				  Un alimento solo podrá ser de una categoría y una categoría podrá
 *				  contener más de un alimento 
 * 
 * 
 */
@SpringBootApplication
public class Ad05Te01Application {

	public static void main(String[] args) {
		SpringApplication.run(Ad05Te01Application.class, args);
	}

}
