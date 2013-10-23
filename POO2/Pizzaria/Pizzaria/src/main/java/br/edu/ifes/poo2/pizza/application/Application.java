package br.edu.ifes.poo2.pizza.application;

import br.edu.ifes.poo2.pizza.factory.ingrediente.AbstractFactoryIngrediente;
import br.edu.ifes.poo2.pizza.factory.ingrediente.FactoryMassaCone;
import br.edu.ifes.poo2.pizza.factory.ingrediente.FactoryMassaTradicionalBorda;
import br.edu.ifes.poo2.pizza.factory.pizza.AbstractFactoryPizza;
import br.edu.ifes.poo2.pizza.factory.pizza.FactoryPizzaConeMussarela;
import br.edu.ifes.poo2.pizza.factory.pizza.FactoryPizzaTradicionalBordaMussarela;
import br.edu.ifes.poo2.pizza.model.Ingrediente;
import br.edu.ifes.poo2.pizza.model.Pizza;

public class Application {

	public static void main(String[] args) {
		
		
		AbstractFactoryIngrediente factory = new FactoryMassaTradicionalBorda();
		
		Ingrediente ingrediente = factory.criarIngrediente();
		
		System.out.println("Factory: "+factory.getClass());
		System.out.println("Tipo: "+ingrediente.getClass());
		
		factory = new FactoryMassaCone();

		ingrediente = factory.criarIngrediente();
		System.out.println("Factory: "+factory.getClass());
		System.out.println("Tipo: "+ingrediente.getClass());
		
		System.out.println("========");
		
		AbstractFactoryPizza factoryPizza = new FactoryPizzaTradicionalBordaMussarela();
		
		Pizza pizza = factoryPizza.criarPizza();
		
		System.out.println("Pizza: "+pizza.getClass());
		System.out.println("Massa Pizza: "+pizza.getMassa().getClass());
		
		factoryPizza = new FactoryPizzaConeMussarela();
		
		pizza = factoryPizza.criarPizza();
		
		System.out.println("Pizza: "+pizza.getClass());
		System.out.println("Massa Pizza: "+pizza.getMassa().getClass());

	}

}
