package ExemploHeranca;

public class Carro extends Veiculo{

    private int qauntPortas;

    public int getQauntPortas() {
        return qauntPortas;
    }

    public void setQauntPortas(int qauntPortas) {
        this.qauntPortas = qauntPortas;
    }
    /* Ex polimorfismo */


    public double calculaImposto() {
        return this.getValorVenal() * 0.07;
    }
}
