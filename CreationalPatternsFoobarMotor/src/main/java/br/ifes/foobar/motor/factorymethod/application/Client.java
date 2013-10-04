/*
 *  Java Design Pattern Essentials - Second Edition, by Tony Bevis
 *  Copyright 2012, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */
package br.ifes.foobar.motor.factorymethod.application;

import br.ifes.foobar.motor.factorymethod.CarFactory;
import br.ifes.foobar.motor.factorymethod.VanFactory;
import br.ifes.foobar.motor.factorymethod.VehicleFactory;
import br.ifes.foobar.motor.factorymethod.VehicleFactory.Category;
import br.ifes.foobar.motor.factorymethod.VehicleFactory.DrivingStyle;
import br.ifes.foobar.motor.model.Vehicle;

public class Client {

	public static void main(String[] args) {
		
		// I want an economical car, coloured blue...
		VehicleFactory carFactory = new CarFactory();
		Vehicle car = carFactory.build(VehicleFactory.DrivingStyle.ECONOMICAL,
				Vehicle.Colour.BLUE);
		System.out.println(car);

		// I am a "white van man"...
		VehicleFactory vanFactory = new VanFactory();
		Vehicle van = vanFactory.build(VehicleFactory.DrivingStyle.POWERFUL,
				Vehicle.Colour.WHITE);
		System.out.println(van);
		
		///Using static factory
		// Create a red sports car...
		Vehicle sporty = VehicleFactory.make(VehicleFactory.Category.CAR,
				VehicleFactory.DrivingStyle.POWERFUL, Vehicle.Colour.BLUE);
		System.out.println(sporty);
	}

}
