public class Boat extends Vehicle {

    private double hour;

    public Boat(String brand, double hour) {  
        super(brand,0);  
        this.hour = hour;
    }
    public String doStuff() {  
        return "je suis " + getBrand() + "glou glou!";  
    }
}