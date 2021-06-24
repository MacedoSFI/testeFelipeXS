package br.com.felipe.pokemon.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Pokemon {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String num;
	private String name;
	private String tipo;
	
	@OneToOne
	private Evolucao pre_evolution;
	
	@OneToOne
	private Evolucao next_evolution;
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	public Long getId() {
		return id;
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
	
}
