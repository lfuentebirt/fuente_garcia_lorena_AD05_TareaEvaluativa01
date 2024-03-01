package lfuente.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import lfuente.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
	
}