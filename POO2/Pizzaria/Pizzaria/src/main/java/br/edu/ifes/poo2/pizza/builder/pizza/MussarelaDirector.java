package br.edu.ifes.poo2.pizza.builder.pizza;

import br.edu.ifes.poo2.pizza.model.Pizza;

public class MussarelaDirector extends PizzaDirector {

	@Override
	public Pizza fazerPizza(PizzaBuilder pizzaBuilder) {
		
		pizzaBuilder.fazerMassa();
		
		pizzaBuilder.fazerQueijo();
		
		Pizza pizza = pizzaBuilder.getPizza();
		
		return pizza;
	}

}
