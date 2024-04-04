/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yusupova.task52;

/**
 *
 * @author a.yusupova
 */
public class Car {
    
    Car(Driver drvr){
        
        rr = this.new Wheel(Wheel.Type.REAR_RIGHT);
        rl = this.new Wheel(Wheel.Type.REAR_LEFT);
        fr = this.new Wheel(Wheel.Type.FRON_RIGHT);
        fl = this.new Wheel(Wheel.Type.FRON_LEFT);
        
        steerer = this.new SteeringWheel();
        motor = this.new Motor();
        
        state = State.values()[(int)Math.floor(Math.random()*4)];
        
        driver = drvr;
        driver.setCar(this);
        
    }
//    двигатель, корпус, колеса, руль
    
    
    protected String howFast()
    {
        return "Running at " + this.vel + " km/hr";
    }
    
    public class Motor{
        public void setSpeed(double v)
        {
            Car.this.vel = v;
            System.out.println(Car.this.howFast());
        }
    }
    
    
    public class Body{
        public boolean isRusty()
        {
            if(Car.this.state == Car.State.HEAVYLY_USED
                    || Car.this.state == Car.State.BOLT_BUCKET)
                return true;
            else
                return false;
        }
    }
    
    public class Wheel{
        public enum Type{
            FRON_LEFT,
            FRON_RIGHT,
            REAR_LEFT,
            REAR_RIGHT
            
        }
        
        public Type place;
        Wheel(Type t){
            place = t;
        }
        
        double getVelocity()
        {
            double res = Car.this.vel;
            double dir_ = Car.this.dir;
            
            switch(place)
            {
                case FRON_LEFT:
                    res += 10*Math.cos(dir_*Math.PI/180.0);
                    break;
                case FRON_RIGHT:
                    res += -10*Math.cos(dir_*Math.PI/180.0);
                    break;
                case REAR_LEFT:
                    res += 20*Math.cos(dir_*Math.PI/180.0);
                    break;
                case REAR_RIGHT:
                    res += -20*Math.cos(dir_*Math.PI/180.0);
                    break;
            }
            
            return res;
        }
        
        
    }
    
    public class SteeringWheel{
        
        void turnRight(){
            System.out.println("Steering right");
            Car.this.moveDirection(-45);
        }
        
        void turnLeft(){
            System.out.println("Steering left");
            Car.this.moveDirection(45);
        }
        
    }
    
    void moveDirection(double angle)
    {
        dir = angle;
        System.out.println("Car is moving to "+dir+"°");

    }
    
    
    public enum State{
        NEW,
        USED,
        HEAVYLY_USED,
        BOLT_BUCKET
    }
    
    public Driver getDriver()
    {
        return this.driver;
    }
    
    
    protected double dir = 0;
    protected double vel = 0;
    protected Wheel rl;
    protected Wheel rr;
    protected Wheel fr;
    protected Wheel fl;
   
    protected Motor motor;
    protected SteeringWheel steerer;
    
    protected State state;
    
    
    protected Driver driver;
    
}
