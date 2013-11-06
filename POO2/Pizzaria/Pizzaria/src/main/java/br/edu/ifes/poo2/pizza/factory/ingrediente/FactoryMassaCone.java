package br.edu.ifes.poo2.pizza.factory.ingrediente;

import br.edu.ifes.poo2.pizza.model.Ingrediente;
import br.edu.ifes.poo2.pizza.model.MassaConeImpl;
import br.edu.ifes.poo2.pizza.model.MassaTradicionalBordaImpl;

public class FactoryMassaCone extends AbstractFactoryMassa {

	@Override
	public Ingrediente criarIngrediente() {
		// TODO Auto-generated method stub
		return new MassaTradicionalBordaImpl();
	}

}
