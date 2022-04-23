package br.ifsul.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ifsul.dto.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Integer>{
	
}
