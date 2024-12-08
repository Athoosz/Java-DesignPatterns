import classes.*;

public class App {
  public static void main(String[] args) throws Exception {
    TemperatureSensor sensor = new TemperatureSensor();

    Observer display1 = new TemperatureDisplay("Display 1");
    Observer display2 = new TemperatureDisplay("Display 2");

    sensor.registerObserver(display1);
    sensor.registerObserver(display2);

    sensor.setTemperature(25.0f);
    sensor.setTemperature(30.0f);
    sensor.notifyObservers();
  }
}
