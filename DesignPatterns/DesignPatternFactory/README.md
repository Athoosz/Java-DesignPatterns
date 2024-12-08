# Design Pattern Factory

## Descrição

O padrão Factory é um padrão de criação que fornece uma interface para criar objetos em uma superclasse, mas permite que as subclasses alterem o tipo de objetos que serão criados. Este padrão é usado para definir uma interface para criar um objeto, mas deixa as subclasses decidirem qual classe instanciar.

## Estrutura do Factory Pattern

- `Vehicle` (Interface)
- `Car` (Classe concreta que implementa `Vehicle`)
- `Truck` (Classe concreta que implementa `Vehicle`)
- `VehicleFactory` (Classe que contém o método de criação de objetos `Vehicle`)

## Exemplo de Uso

```java
import classes.*;

public class App {
    public static void main(String[] args) throws Exception {
        VehicleFactory vehicleFactory = new VehicleFactory();

        Vehicle car = vehicleFactory.getVehicle("CAR");
        car.drive(); // Saída: Driving a car

        Vehicle truck = vehicleFactory.getVehicle("TRUCK");
        truck.drive(); // Saída: Driving a truck
    }
}