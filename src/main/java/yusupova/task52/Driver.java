/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yusupova.task52;

/**
 *
 * @author a.yusupova
 */
public class Driver {
    Driver()
    {
        
        
    }
    

    public void drive()
    {
        Car.SteeringWheel crank = vehicle.new SteeringWheel();
        Car.Motor heart = vehicle.new Motor();
        Car.Body b = vehicle.new Body();
        
        System.out.println("We've "+((b.isRusty()?"rusty":"nice"))+" car!");
        
        heart.setSpeed(Math.random()*200);
        
         Car.Wheel rr = vehicle.new Wheel(Car.Wheel.Type.REAR_RIGHT);
         Car.Wheel rl = vehicle.new Wheel(Car.Wheel.Type.REAR_LEFT);
         Car.Wheel fl = vehicle.new Wheel(Car.Wheel.Type.FRON_LEFT);
         Car.Wheel fr = vehicle.new Wheel(Car.Wheel.Type.FRON_RIGHT);
         
        class LocalSpeedometer{
            public void print()
            {
                System.out.println("Rear left wheel speed: "+rl.getVelocity());
                System.out.println("Rear right wheel speed: "+rr.getVelocity());
                System.out.println("Front left wheel speed: "+fl.getVelocity());
                System.out.println("Front right wheel speed: "+fr.getVelocity());
            }
        }
        
        LocalSpeedometer s =new LocalSpeedometer();
        
        
        crank.turnLeft();s.print();
        crank.turnRight();s.print();
        
        
        crank.turnLeft();s.print();
        crank.turnRight();s.print();
        
        crank.turnLeft();s.print();
        crank.turnRight();s.print();
        
        System.out.println("5 starts!");
         
         
        
        
        
    }
    
    public void setCar(Car f)
    {
        vehicle = f;
    }
    
    protected Car vehicle;
}
