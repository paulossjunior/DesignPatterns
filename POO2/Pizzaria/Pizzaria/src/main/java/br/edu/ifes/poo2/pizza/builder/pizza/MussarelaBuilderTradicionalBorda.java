package br.edu.ifes.poo2.pizza.builder.pizza;

import br.edu.ifes.poo2.pizza.factory.ingrediente.FactoryMassaTradicionalBorda;

public class MussarelaBuilderTradicionalBorda extends
		MussarelaBuilderTradicional {
	
	public MussarelaBuilderTradicionalBorda()
	{
		factoryMassa = new FactoryMassaTradicionalBorda();
	}

}
