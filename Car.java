public class Car extends Vehicle {

    public Car(String brand , int kilometer) {  
        super(brand,kilometer);  
        
    }
    public String doStuff() {  
        return "je suis " + getBrand()  + "vroom vroom!";  
    }
}