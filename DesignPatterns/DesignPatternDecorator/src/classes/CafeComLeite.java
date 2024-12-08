package classes;

public class CafeComLeite extends CafeDecorator{
    public CafeComLeite(Cafe cafeDecorado) {
        super(cafeDecorado);
    }

    public String getNome() {
        return super.getNome() + ", com leite";
    }

    public double getPreco() {
        return super.getPreco() + 1.0;
    }
}
