overridding                                                                                                                                                                                                       public class Codeternity {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Car car = new Car();

        vehicle.info();
        car.info();
    }
}

class Vehicle 
    public void info() {
        System.out.println("This is car");
    }
}

class Car extends Vehicle {
    public void info() {
        System.out.println("The car travels at a speed of 80 km");
    }
}