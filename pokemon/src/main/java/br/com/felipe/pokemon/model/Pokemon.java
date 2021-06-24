package br.com.felipe.pokemon.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Pokemon {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String num;
	private String name;
		
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "pokemon", fetch = FetchType.LAZY)
	private List<Tipo> tipos = new ArrayList<>();
	
	@OneToOne
	private Evolucao pre_evolution;
	
	@OneToOne
	private Evolucao next_evolution;
	
	public List<Tipo> getTipos() {
		return tipos;
	}
	public void setTipos(List<Tipo> tipos) {
		this.tipos = tipos;
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
