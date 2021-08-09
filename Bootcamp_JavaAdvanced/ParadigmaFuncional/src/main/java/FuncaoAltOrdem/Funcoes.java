package FuncaoAltOrdem;

import java.util.function.Function;

public class Funcoes {
    public static void main(String[] args) {
        Function<String,String> retornaNomeAoContrario = texto -> new StringBuilder(texto).reverse().toString();
        Function<String,Integer> converterStringParaInteiro = string -> Integer.valueOf(string) * 2;
        System.out.println(retornaNomeAoContrario.apply("Tiago"));
        System.out.println(converterStringParaInteiro.apply("20"));
    }
}
