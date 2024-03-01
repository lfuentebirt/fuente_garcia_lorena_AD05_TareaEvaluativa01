package lfuente.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name="alimento")
public class Alimento {
	
	@Id
	@SequenceGenerator(name = "col_gen", sequenceName = "col_sqe", schema="alimentos" , allocationSize = 1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "col_gen")
	private Long id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@Column(name="origen")
	private String origen;
	
	@Column(name="precio")
	private int precio;
	
	@ManyToOne
	@JoinColumn (name = "categoria_id")
	private Categoria categoria;
	
	public Alimento(String nombre, String descripcion, String origen, int precio) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.origen = origen;
		this.precio= precio;
	}

}
