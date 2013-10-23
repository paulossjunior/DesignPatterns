package br.edu.ifes.poo2.pizza.model;

import java.util.List;

public abstract class AbstractPizza implements Pizza {

	private Massa massa;
	
	private List<Queijo> queijos;
	
	
	public void adicionarMassa(Massa massa) {
		
		this.massa = massa;

	}

	public void AdicionarQueijo(List<Queijo> queijos) {
		 this.queijos = queijos;

	}
	
	public Massa getMassa(){
		
		return massa;
	}

}
