# Design Pattern Observer

## Descrição

O padrão Observer é usado para notificar automaticamente um grupo de objetos dependentes quando o estado de outro objeto muda. Este padrão é útil quando há uma relação de um-para-muitos entre objetos, como em sistemas de monitoramento.

## Estrutura do Observer Pattern

- `Observer` (Interface)
- `TemperatureDisplay` (Classe concreta que implementa `Observer`)
- `Subject` (Interface)
- `TemperatureSensor` (Classe concreta que implementa `Subject`)

## Exemplo de Uso

```java
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
  }
}