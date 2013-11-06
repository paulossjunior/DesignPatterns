package br.edu.ifes.poo2.pizza.factory.ingrediente;

import br.edu.ifes.poo2.pizza.model.Ingrediente;
import br.edu.ifes.poo2.pizza.model.MassaTradicionalFinaImpl;

public class FactoryMassaTradicionalFina extends AbstractFactoryMassa {

	@Override
	public Ingrediente criarIngrediente() {
		// TODO Auto-generated method stub
		return  new MassaTradicionalFinaImpl();
	}

}
