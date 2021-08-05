package ExemploHeranca;

public class Programa {

    public static void main(String[] args){

        Carro carro = new Carro();
        carro.setMarca("Ford");
        carro.setModelo("Fusion");
        carro.setQauntPortas(4);

        Moto moto = new Moto();
        moto.setMarca("Yamaha");
        moto.setModelo("Fazer");
        moto.setCilindradas("250");

        System.out.println(carro.getMarca());
        System.out.println(carro.getModelo());
        System.out.println(carro.getQauntPortas() + " Portas");

        System.out.println();

        System.out.println(moto.getMarca());
        System.out.println(moto.getModelo());
        System.out.println(moto.getCilindradas() + " Cilindradas");

        System.out.println();

        Veiculo generico = new Veiculo();
        generico.setValorVenal(1000.0);
        System.out.println(generico.calculaImposto());

        System.out.println();

        carro.setValorVenal(1000.0);
        System.out.println(carro.calculaImposto());

        System.out.println();

        moto.setValorVenal(1000.0);
        System.out.println(moto.calculaImposto());
    }
}
