package classes;

public abstract class CafeDecorator implements Cafe {
    private Cafe cafeDecorado;

    public CafeDecorator(Cafe cafeDecorado) {
        this.cafeDecorado = cafeDecorado;
    }

    public String getNome() {
        return cafeDecorado.getNome();
    }

    public double getPreco() {
        return cafeDecorado.getPreco();
    }
}
