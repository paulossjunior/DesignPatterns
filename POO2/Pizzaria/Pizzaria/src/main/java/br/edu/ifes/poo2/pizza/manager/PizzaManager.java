package br.edu.ifes.poo2.pizza.manager;

import br.edu.ifes.poo2.pizza.builder.pizza.PizzaBuilder;
import br.edu.ifes.poo2.pizza.builder.pizza.PizzaDirector;
import br.edu.ifes.poo2.pizza.model.Pizza;

public class PizzaManager {
	
	private static PizzaManager pizzaManager;
	
	private final String path = "br.edu.ifes.poo2.pizza.builder.pizza.";
	
	public synchronized static PizzaManager getInstance(){
		
		if (pizzaManager == null) 
		{
			pizzaManager = new PizzaManager();
		}
		
		return pizzaManager;
		
	}
	
	private PizzaManager(){}
	
	public synchronized Pizza getPizza(String sabor, String massa) throws ClassNotFoundException
	{
		Class c = null;
		try{
			
			//Instanciando a classe o builder
			c = Class.forName(path+sabor+"Builder"+massa);
			PizzaBuilder pizzaBuilder = (PizzaBuilder)c.newInstance();
			
			c = Class.forName(path+sabor+"Director");			
			PizzaDirector pizzaDirector = (PizzaDirector)c.newInstance();
									
			Pizza pizza = pizzaDirector.fazerPizza(pizzaBuilder);
			
			return pizza;	
		}catch (Exception e)
		{
			throw new ClassNotFoundException();
		}
	}
	
	public synchronized Pizza getPizza(Sabor sabor, Massa massa) throws ClassNotFoundException
	{
		Class c = null;
		try{
			
			//Instanciando a classe o builder
			c = Class.forName(path+sabor+"Builder"+massa);
			PizzaBuilder pizzaBuilder = (PizzaBuilder)c.newInstance();
			
			c = Class.forName(path+sabor+"Director");			
			PizzaDirector pizzaDirector = (PizzaDirector)c.newInstance();
									
			Pizza pizza = pizzaDirector.fazerPizza(pizzaBuilder);
			
			return pizza;	
		}catch (Exception e)
		{
			throw new ClassNotFoundException();
		}
	}
	
	

}
