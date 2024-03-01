package lfuente.domain;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//Clase- Entidad Categoria. 
	// Utilizamos Lombok para organizar el código y evitar el código repetitivo (getters, setters, etc.)
	// Mapeado con la tabla categoria
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="categoria")
public class Categoria {
	
	// atributos de la clase
	// creado con secuencia en BD, y le indicamos que se incremente en 1
	@Id
	@SequenceGenerator(name = "col_gen2", sequenceName = "col_sqe2", schema="alimentos", allocationSize = 1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "col_gen2")
	private Long id;
	
	private String nombre;
	
	private String propiedades;
	
	// relación ManyToOne con Categorias. Un alimento puede pertenecer a una categoria, pero una  categoria
		// puede tener más de un alimento. Por ello, recogemos la lista de alimentos.
		// Al eliminar una categoria, se eliminan los alimentos de la misma
	@OneToMany (mappedBy = "categoria",cascade = CascadeType.ALL)
	List <Alimento> alimentos = new ArrayList<>();
	
	// constructor con parametros determinados, sin los alimentos
	public Categoria(String nombre, String propiedades) {
		super();
		this.nombre = nombre;
		this.propiedades = propiedades;
	}

}
