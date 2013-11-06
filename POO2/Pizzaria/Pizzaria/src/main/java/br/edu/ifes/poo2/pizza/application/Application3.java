package br.edu.ifes.poo2.pizza.application;

import br.edu.ifes.poo2.pizza.manager.Massa;
import br.edu.ifes.poo2.pizza.manager.PizzaManager;
import br.edu.ifes.poo2.pizza.manager.Sabor;
import br.edu.ifes.poo2.pizza.model.Pizza;

public class Application3 {

	public static void main(String[] args) {
		
		PizzaManager pizzaManager =  PizzaManager.getInstance();
		
		try {
			//Sem usar ENUM
			Pizza pizza = pizzaManager.getPizza("Mussarela","TradicionalBorda");
						
			System.out.println(pizza.getClass());
			
			//Usando ENUM
			pizza = pizzaManager.getPizza(Sabor.Mussarela,Massa.TradicionalBorda);
			
			System.out.println(pizza.getClass());
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
