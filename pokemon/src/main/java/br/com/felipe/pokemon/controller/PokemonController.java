package br.com.felipe.pokemon.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.felipe.pokemon.dto.PokemonDto;
import br.com.felipe.pokemon.model.Pokemon;
import br.com.felipe.pokemon.repository.PokemonRepository;

@RestController
@RequestMapping("/")
public class PokemonController {
	

	@Autowired
	private PokemonRepository pokemonRepository;
	
	@GetMapping("/pokemons")
	//@RequestMapping("/pokemons")
	public List<PokemonDto> listar() {

		List<Pokemon> pokemons = pokemonRepository.findAll();
		return PokemonDto.converter(pokemons);
	}
	
	
	//Metodo GET "pokemons": Retorna todos os pokemons;

}
