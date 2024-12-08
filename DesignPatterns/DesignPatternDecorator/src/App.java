import classes.*;

public class App {
  public static void main(String[] args) throws Exception {
    Cafe cafe = new CafeComLeite(new CafeExpresso());

    System.out.println(cafe.getNome());
    System.out.println(cafe.getPreco());
  }
}
