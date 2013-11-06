package br.edu.ifes.poo2.pizza.application;

import br.edu.ifes.poo2.pizza.builder.pizza.MussarelaBuilderCone;
import br.edu.ifes.poo2.pizza.builder.pizza.MussarelaBuilderTradicionalBorda;
import br.edu.ifes.poo2.pizza.builder.pizza.MussarelaBuilderTradicionalFina;
import br.edu.ifes.poo2.pizza.builder.pizza.MussarelaDirector;
import br.edu.ifes.poo2.pizza.builder.pizza.PizzaBuilder;
import br.edu.ifes.poo2.pizza.builder.pizza.PizzaDirector;
import br.edu.ifes.poo2.pizza.model.Pizza;

public class Application2 {

	public static void main(String[] args) {
		
		
		PizzaDirector pizzaDirector = new MussarelaDirector();
		
		PizzaBuilder pizzaBuilder = new MussarelaBuilderTradicionalFina();
		
		Pizza pizza = pizzaDirector.fazerPizza(pizzaBuilder);
		
		System.out.println("Pizza Massa: "+pizza.getMassa().getClass());
		
		pizzaBuilder = new MussarelaBuilderTradicionalBorda();
		
		pizza = pizzaDirector.fazerPizza(pizzaBuilder);
		
		System.out.println("Pizza Massa: "+pizza.getMassa().getClass());
		
		pizzaBuilder = new MussarelaBuilderCone();
		
		pizza = pizzaDirector.fazerPizza(pizzaBuilder);
		
		System.out.println("Pizza Massa: "+pizza.getMassa().getClass());
		
	}
}
