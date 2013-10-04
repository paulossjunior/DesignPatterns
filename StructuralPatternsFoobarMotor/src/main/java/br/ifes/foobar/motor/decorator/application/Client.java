/*
 *  Java Design Pattern Essentials - Second Edition, by Tony Bevis
 *  Copyright 2012, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */
package br.ifes.foobar.motor.decorator.application;

import br.ifes.foobar.motor.decorator.AirConditionedVehicle;
import br.ifes.foobar.motor.decorator.AlloyWheeledVehicle;
import br.ifes.foobar.motor.decorator.LeatherSeatedVehicle;
import br.ifes.foobar.motor.decorator.MetallicPaintedVehicle;
import br.ifes.foobar.motor.decorator.Saloon;
import br.ifes.foobar.motor.decorator.SatNavVehicle;
import br.ifes.foobar.motor.decorator.StandardEngine;
import br.ifes.foobar.motor.decorator.Vehicle;
import br.ifes.foobar.motor.decorator.Vehicle.Colour;

public class Client {
    
    public static void main(String[] args) {
        // Create a blue saloon car...
        Vehicle myCar = new Saloon(new StandardEngine(1300));
        myCar.paint(Vehicle.Colour.BLUE);
        System.out.println(myCar);
        
        // Add air-conditioning to the car...
        myCar = new AirConditionedVehicle(myCar);
        System.out.println(myCar);
        
        // Now add alloy wheels...
        myCar = new AlloyWheeledVehicle(myCar);
        System.out.println(myCar);
        
        // Now add leather seats...
        myCar = new LeatherSeatedVehicle(myCar);
        System.out.println(myCar);
        
        // Now add metallic paint...
        myCar = new MetallicPaintedVehicle(myCar);
        System.out.println(myCar);
        
        // Now add satellite-navigation...
        myCar = new SatNavVehicle(myCar);
        System.out.println(myCar);
    }
    
}
