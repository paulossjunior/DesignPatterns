/*
 *  Java Design Pattern Essentials - Second Edition, by Tony Bevis
 *  Copyright 2012, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */
package br.ifes.foobar.motor.builder.application;

import br.ifes.foobar.motor.builder.CarBuilder;
import br.ifes.foobar.motor.builder.CarDirector;
import br.ifes.foobar.motor.builder.VehicleBuilder;
import br.ifes.foobar.motor.builder.VehicleDirector;
import br.ifes.foobar.motor.model.AbstractCar;
import br.ifes.foobar.motor.model.Saloon;
import br.ifes.foobar.motor.model.StandardEngine;
import br.ifes.foobar.motor.model.Vehicle;

public class Client {
    
    public static void main(String[] args) {
        
    	AbstractCar car = new Saloon(new StandardEngine(1300));
        
    	VehicleBuilder builder = new CarBuilder(car);
        
    	VehicleDirector director = new CarDirector();
        
    	Vehicle v = director.build(builder);
        
    	System.out.println(v);
    }
    
}
