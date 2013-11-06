package br.edu.ifes.poo2.pizza.model;

import java.util.List;

public interface Pizza {
	
	public void adicionarMassa (Massa massa);
	
	public void AdicionarQueijo (List<Queijo> queijos);
	
	public Massa getMassa();

}
