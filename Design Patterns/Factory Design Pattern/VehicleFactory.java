
public class VehicleFactory {

    public static Vehicle getVehicle(String s)
    {
        switch(s)
        {
            case "car":
                return new Car();
            case "bus":
                return new Bus();
        }
        return new Car();
    }
}