package lfuente.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import lfuente.domain.Alimento;

public interface AlimentoRepository extends JpaRepository<Alimento, Long>{
	
}
