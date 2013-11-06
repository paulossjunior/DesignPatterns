package br.edu.ifes.poo2.pizza.builder.pizza;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifes.poo2.pizza.factory.ingrediente.AbstractFactoryMassa;
import br.edu.ifes.poo2.pizza.model.Massa;
import br.edu.ifes.poo2.pizza.model.Pizza;
import br.edu.ifes.poo2.pizza.model.PizzaImpl;
import br.edu.ifes.poo2.pizza.model.Queijo;

public abstract class PizzaBuilder {
	
	protected AbstractFactoryMassa factoryMassa;
	
	protected Pizza pizza;
		
	public PizzaBuilder()
	{
		pizza = new PizzaImpl();
	}
	
	public void fazerMassa(){
		
		Massa massa = (Massa) factoryMassa.criarIngrediente();
		
		pizza.adicionarMassa(massa);
	}
	
	public void fazerQueijo(){
		
		List<Queijo> queijos = new ArrayList<Queijo>();
		
		pizza.AdicionarQueijo(queijos);
	}
	
	public Pizza getPizza(){
		
		return pizza;
	}
	

}
