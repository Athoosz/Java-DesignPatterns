package classes;

public class TemperatureDisplay implements Observer {
  private String displayId;

  public TemperatureDisplay(String displayId) {
      this.displayId = displayId;
  }

  @Override
  public void update(float temperature) {
      System.out.println(displayId + " display: Temperatura atual " + temperature + "°C");
  }
}
