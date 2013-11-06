package br.edu.ifes.poo2.pizza.teste;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.edu.ifes.poo2.pizza.factory.pizza.FactoryPizzaConeMussarela;
import br.edu.ifes.poo2.pizza.model.MassaCone;
import br.edu.ifes.poo2.pizza.model.MassaConeImpl;
import br.edu.ifes.poo2.pizza.model.Pizza;
import br.edu.ifes.poo2.pizza.model.PizzaMussarela;

public class TestePizza {

	private FactoryPizzaConeMussarela factoryPizzaConeMussarela;
	
	@Before
	public void before()
	{
		factoryPizzaConeMussarela = new FactoryPizzaConeMussarela();
	}
	
	@Test
	public void FactoryPizza()
	{
		Pizza pizza = factoryPizzaConeMussarela.criarPizza();
		Assert.assertNotNull(pizza);
		Assert.assertSame(PizzaMussarela.class, pizza.getClass());
		Assert.assertSame(MassaConeImpl.class,pizza.getMassa().getClass());
	}
	
}
