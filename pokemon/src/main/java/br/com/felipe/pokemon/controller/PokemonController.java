package br.com.felipe.pokemon.controller;

import java.net.URI;
import java.util.List;

import javax.transaction.Transactional;
//import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.felipe.pokemon.dto.PokemonDto;
import br.com.felipe.pokemon.form.PokemonForm;
import br.com.felipe.pokemon.model.Pokemon;
import br.com.felipe.pokemon.repository.PokemonRepository;
import net.felipemacedo.equipes.controller.dto.DetalhesDoProjetoDto;
import net.felipemacedo.equipes.model.Projeto;

@RestController
@RequestMapping("/pokemons")
public class PokemonController {
	

	@Autowired
	private PokemonRepository pokemonRepository;
	
	//Metodo GET "pokemons": Retorna todos os pokemons;
	
	@GetMapping
	//@RequestMapping("/pokemons")
	public List<PokemonDto> listar() {

		List<Pokemon> pokemons = pokemonRepository.findAll();
		return PokemonDto.converter(pokemons);
	}
	
	//Método Post cadastrando	
	@PostMapping
	@Transactional
	public ResponseEntity<PokemonDto> cadastrar(@RequestBody PokemonForm form, UriComponentsBuilder uriBuilder) {
		Pokemon pokemon = form.converter();
		pokemonRepository.save(pokemon);
		URI uri = uriBuilder.path("/pokemons/{id}").buildAndExpand(pokemon.getId()).toUri();
		return ResponseEntity.created(uri).body(new PokemonDto(pokemon));
	}
	
	//buscar um pokemon
	
	@GetMapping("/{id}")
	@Transactional
	public PokemonDto detalhar(@PathVariable Long id) {
		Pokemon pokemon = pokemonRepository.getOne(id);
		return new PokemonDto(pokemon);
	}

}
