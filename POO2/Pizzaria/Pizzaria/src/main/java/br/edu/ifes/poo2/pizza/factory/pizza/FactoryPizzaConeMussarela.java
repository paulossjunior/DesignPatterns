package br.edu.ifes.poo2.pizza.factory.pizza;

import br.edu.ifes.poo2.pizza.factory.ingrediente.FactoryMassaCone;
import br.edu.ifes.poo2.pizza.model.PizzaMussarela;

public class FactoryPizzaConeMussarela extends AbstractFactoryPizza{
	
	public FactoryPizzaConeMussarela(){
		
		this.pizza = new PizzaMussarela();
		
		this.factoryMassa = new FactoryMassaCone();
	}

}
