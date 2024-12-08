import classes.*;

public class App {
    public static void main(String[] args) throws Exception {
        VehicleFactory vehicleFactory = new VehicleFactory();

        Vehicle car = vehicleFactory.getVehicle("CAR");
        car.drive();

        Vehicle truck = vehicleFactory.getVehicle("TRUCK");
        truck.drive();
    }
}
