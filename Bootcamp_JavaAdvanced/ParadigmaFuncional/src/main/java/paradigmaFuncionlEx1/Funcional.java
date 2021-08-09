package paradigmaFuncionlEx1;

import java.util.function.UnaryOperator;

public class Funcional {
    public static void main(String[] args){
        UnaryOperator<Integer> calculaValorVezes5 = valor -> valor*5;
        int valor = 10;
        System.out.println("O resultado é " + calculaValorVezes5.apply(10));
    }
}

