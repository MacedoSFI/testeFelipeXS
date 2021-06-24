package br.com.felipe.pokemon.form;

import br.com.felipe.pokemon.model.Evolucao;
import br.com.felipe.pokemon.model.Pokemon;

public class PokemonForm {
	
	private String num;
	private String name;
	private String tipo;
	private Evolucao pre_evolution;
	private Evolucao next_evolution;
	
	
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
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
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
	
	public Pokemon converter() {
		return new Pokemon(num, name, tipo);
	}
}
