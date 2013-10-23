package br.edu.ifes.poo2.pizza.factory.pizza;

import java.util.List;

import br.edu.ifes.poo2.pizza.factory.ingrediente.AbstractFactoryMassa;
import br.edu.ifes.poo2.pizza.model.Massa;
import br.edu.ifes.poo2.pizza.model.Pizza;
import br.edu.ifes.poo2.pizza.model.Queijo;

public abstract class AbstractFactoryPizza {

	protected Pizza pizza;
	
	protected AbstractFactoryMassa factoryMassa;
	
	public Pizza criarPizza(){
		
		Massa massa = criarMassa();
		
		List<Queijo> queijos = criarQueijos();
		
		pizza.adicionarMassa(massa);
		pizza.AdicionarQueijo(queijos);
		
		return pizza;
			
	}
	
	private List<Queijo> criarQueijos(){
		
		return null;
	}
	
	private Massa criarMassa(){
		
		return (Massa)factoryMassa.criarIngrediente();
	}
	
}
