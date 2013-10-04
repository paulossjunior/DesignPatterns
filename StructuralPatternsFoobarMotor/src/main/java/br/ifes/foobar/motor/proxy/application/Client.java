/*
 *  Java Design Pattern Essentials - Second Edition, by Tony Bevis
 *  Copyright 2012, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */
package br.ifes.foobar.motor.proxy.application;

import br.ifes.foobar.motor.flyweight.Engine;
import br.ifes.foobar.motor.flyweight.EngineDiagnosticTool;
import br.ifes.foobar.motor.proxy.EngineProxy;

public class Client {
    
    public static void main(String[] args) {
        Engine engine = new EngineProxy(1300, false);
        engine.diagnose(new EngineDiagnosticTool());
    }
    
}
