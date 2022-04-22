package Main;
import Taxi.TaxiCar;
public class taxi {
    public static void main(String[] args){
        TaxiCar txc = new TaxiCar();
        txc.Move();
        txc.stop();
        txc.TurnRight();
        txc.TurnLeft();
    }
}