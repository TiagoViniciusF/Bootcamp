package ExemploHeranca;

public class Moto extends Veiculo{

    private String cilindradas;

    public String getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(String cilindradas) {
        this.cilindradas = cilindradas;
    }
    /* Ex Polimorfismo */

    public double calculaImposto() {
        return this.getValorVenal() * 0.03;
    }
}
