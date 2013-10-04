package br.ifes.foobar.motor.facade;

/**
 *
 * @author Tony
 */
public abstract class AbstractVehicle implements Vehicle {
    
    private Engine engine;
    private Vehicle.Colour colour;
    
    public AbstractVehicle(Engine engine) {
        this(engine, Vehicle.Colour.UNPAINTED);
    }
    
    public AbstractVehicle(Engine engine, Vehicle.Colour colour) {
        this.engine = engine;
        this.colour = colour;
    }
    
    public Engine getEngine() {
        return engine;
    }
    
    public Vehicle.Colour getColour() {
        return colour;
    }
    
    public void paint(Vehicle.Colour colour) {
        this.colour = colour;
    }
    
    public void cleanInterior() {
        System.out.println("Cleaning interior");
    }
    
    public void cleanExteriorBody() {
        System.out.println("Cleaning exterior");
    }
    
    public void polishWindows() {
        System.out.println("polishing windows");
    }
    
    public void takeForTestDrive() {
        System.out.println("taking for test drive");
    }
    
    public String toString() {
        return getClass().getSimpleName() +
                " (" + engine + ", " + colour + ")";
    }
    
}
