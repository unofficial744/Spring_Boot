public class Abstrac {
    
    public static void main(String[] args) {
        
        Car c1 = new Car();
        c1.Start();
        c1.Stop();

    }
}

abstract class Vehicle{

    abstract void Start();

    void Stop(){
        System.out.println("Vehicle stop");
    }
}

class Car extends Vehicle{
    void Start(){
        System.out.println("Car Satrt with key");
    }
}