package br.com.felipe.pokemon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.felipe.pokemon.model.Tipo;

public interface TipoRepository extends JpaRepository<Tipo, Long> {

}
