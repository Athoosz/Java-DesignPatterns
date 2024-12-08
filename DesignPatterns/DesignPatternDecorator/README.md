# Design Pattern Decorator

## Descrição

O padrão Decorator é usado para adicionar funcionalidades a um objeto dinamicamente. Este padrão cria uma classe decoradora que envolve a classe original e fornece funcionalidades adicionais mantendo a interface da classe original.

## Estrutura do Decorator Pattern

- `Cafe` (Interface)
- `CafeSimples` (Classe concreta que implementa `Cafe`)
- `CafeExpresso` (Classe concreta que implementa `Cafe`)
- `CafeDecorator` (Classe abstrata que implementa `Cafe` e contém um objeto `Cafe`)
- `CafeComLeite` (Classe concreta que estende `CafeDecorator`)

## Exemplo de Uso

```java
import classes.*;

public class App {
  public static void main(String[] args) throws Exception {
    Cafe cafe = new CafeComLeite(new CafeExpresso());

    System.out.println(cafe.getNome()); // Saída: Café expresso, com leite
    System.out.println(cafe.getPreco()); // Saída: 5.0
  }
}