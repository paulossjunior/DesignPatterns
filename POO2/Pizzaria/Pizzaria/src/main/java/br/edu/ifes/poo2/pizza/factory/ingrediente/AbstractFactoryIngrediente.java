package br.edu.ifes.poo2.pizza.factory.ingrediente;

import br.edu.ifes.poo2.pizza.model.Ingrediente;

public abstract class AbstractFactoryIngrediente {
	
	protected Ingrediente ingrediente;

	public abstract Ingrediente criarIngrediente();
	
}
