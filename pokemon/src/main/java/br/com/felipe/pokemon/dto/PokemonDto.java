package br.com.felipe.pokemon.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.felipe.pokemon.model.Evolucao;
import br.com.felipe.pokemon.model.Pokemon;
import br.com.felipe.pokemon.model.Tipo;


public class PokemonDto {
	
	private Long id;
	private String num;
	private String name;
	private List<Tipo> tipos;//(Grass, Poison, Fire, Flying, Water, Bug e etc);
	private Evolucao pre_evolution;
	private Evolucao next_evolution;
	
	public PokemonDto(Pokemon pokemon) {
		this.id = pokemon.getId();
		this.num = pokemon.getNum();
		this.name = pokemon.getName();
		this.tipos = pokemon.getTipos();
		this.pre_evolution = pokemon.getPre_evolution();
		this.next_evolution = pokemon.getNext_evolution();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Tipo> getTipos() {
		return tipos;
	}

	public void setTipos(List<Tipo> tipos) {
		this.tipos = tipos;
	}

	public Evolucao getPre_evolution() {
		return pre_evolution;
	}

	public void setPre_evolution(Evolucao pre_evolution) {
		this.pre_evolution = pre_evolution;
	}

	public Evolucao getNext_evolution() {
		return next_evolution;
	}

	public void setNext_evolution(Evolucao next_evolution) {
		this.next_evolution = next_evolution;
	}
	 
	public static List<PokemonDto> converter(List<Pokemon> pokemons) {
		return pokemons
				.stream()//devolve uma lista de PokemonsDto usa stream p n fazer um loop manual
				.map(PokemonDto::new)//chama o construtor que recebe o próprio pokemon como parâmetro
				.collect(Collectors.toList()); //transforma em uma lista
	}

}
