package br.com.felipe.pokemon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.felipe.pokemon.model.Pokemon;

public interface PokemonRepository extends JpaRepository<Pokemon, Long> {

}
