/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package yusupova.task52;

/**
 *
 * @author a.yusupova
 */
public class Task52 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Driver deer = new Driver();
        
        Car beepBeeper = new Car(deer);
        Car.Body bdbuilder = beepBeeper.new Body();
        
        System.out.println("We've "+((bdbuilder.isRusty()?"rusty":"nice"))+" car!");
        
        Car.Motor heart = beepBeeper.new Motor();
        heart.setSpeed(200);
        
        Car.SteeringWheel crank = beepBeeper.new SteeringWheel();
        crank.turnLeft();
        
       
        beepBeeper.getDriver().drive();
        
    }
}
