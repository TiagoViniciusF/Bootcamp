package RecursividadeFatorial;

public class FatorialTailCall {
    public static void main(String[] args){
        System.out.println(fatorialA(5));
    }
    public static double fatorialA(double valor) {
        return fatorialComTailCall(valor, 1);
    }
    public static double fatorialComTailCall(double valor, double numero){
        if (valor == 0){
            return numero;
        }
        return fatorialComTailCall(valor-1,numero*valor);
    }

}
//Se usar a recursividade muito longa, ou seja passar um numero muito grande,o java vai apresentar um
//erro de estouro de pilha, alem de deixar a sua aplicação mais lenta.