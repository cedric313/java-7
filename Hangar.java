public class Hangar {

    public static void main(String[] args) {
       
        Car car1 = new Car("Honda", 1200);
        Boat boat1 = new Boat("Quicksilver", 300.2);

        System.out.println(car1.doStuff());
        System.out.println(boat1.doStuff());
    }

    


}