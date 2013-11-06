package br.edu.ifes.poo2.pizza.builder.pizza;

import br.edu.ifes.poo2.pizza.factory.ingrediente.FactoryMassaCone;

public class MussarelaBuilderCone extends PizzaBuilder {

	public MussarelaBuilderCone()
	{
		factoryMassa = new FactoryMassaCone();
	}
	
}
