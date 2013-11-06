package br.edu.ifes.poo2.pizza.factory.pizza;

import br.edu.ifes.poo2.pizza.factory.ingrediente.FactoryMassaTradicionalBorda;
import br.edu.ifes.poo2.pizza.model.PizzaMussarela;

public class FactoryPizzaTradicionalBordaMussarela extends AbstractFactoryPizza{
	
	public FactoryPizzaTradicionalBordaMussarela()
	{
		this.pizza = new PizzaMussarela();
		
		this.factoryMassa = new FactoryMassaTradicionalBorda();
		
	}

}
