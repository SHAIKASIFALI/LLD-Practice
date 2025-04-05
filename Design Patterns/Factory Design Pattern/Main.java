

public class Main {
    public static void main(String[] args)
    {
        Vehicle car = new Car();
        car.drive();
        Vehicle bus = new Bus();
        bus.drive();

        Vehicle car1 = VehicleFactory.getVehicle("car");
        car1.drive();
    }
}