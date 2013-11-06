package br.edu.ifes.poo2.pizza.builder.pizza;

import br.edu.ifes.poo2.pizza.factory.ingrediente.FactoryMassaTradicionalFina;

public class MussarelaBuilderTradicionalFina extends
		MussarelaBuilderTradicional {
	
	public MussarelaBuilderTradicionalFina()
	{
		factoryMassa = new FactoryMassaTradicionalFina();
	}

}
