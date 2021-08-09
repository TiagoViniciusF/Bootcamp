package lambdaEx1;

//public class Funcao {
    /*public static void main(String[] args){
        Funcao1 colocarPrefixoSrnaString = new Funcao1(){
           @Override
           public String gerar(String valor){
             return "Sr. "+valor;
            }
        };
        System.out.println(colocarPrefixoSrnaString.gerar("Joao"));
    }
    interface Funcao1{
        String gerar(String valor);
    }
}*/

    class FuncaoComLambda{
        public static void main(String[] args){
            Funcao colocarPrefixoSrNaString = valor -> "Sr. "+valor;
            System.out.println(colocarPrefixoSrNaString.gerar("João"));
        }
     @FunctionalInterface
     interface Funcao{
            String gerar(String valor);
     }


    }

