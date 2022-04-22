package Taxi;

public class TaxiCar implements Car {
    public void Move(){
        System.out.println("Taxi di chuyen");
    }
    public void stop(){
        System.out.println("Taxi dung den do");
    }
    public void TurnRight(){
        System.out.println("Taxi re phai");
    }
    public void TurnLeft(){
        System.out.println("Taxi re trai");
    } 
}