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

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="categoria")
public class Categoria {
	
	@Id
	@SequenceGenerator(name = "col_gen2", sequenceName = "col_sqe2", schema="alimentos", allocationSize = 1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "col_gen2")
	private Long id;
	
	private String nombre;
	
	private String propiedades;
	
	
	@OneToMany (mappedBy = "categoria",cascade = CascadeType.ALL)
	List <Alimento> alimentos = new ArrayList<>();
	
	// constructor con parametros determinados
	public Categoria(String nombre, String propiedades) {
		super();
		this.nombre = nombre;
		this.propiedades = propiedades;
	}

}
