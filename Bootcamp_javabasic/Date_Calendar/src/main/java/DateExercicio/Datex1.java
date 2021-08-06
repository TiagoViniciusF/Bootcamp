package DateExercicio;

import java.util.Date;
public class Datex1 {
    public static void main(String[] args){

        Date dataNasc = new Date(632665355000L);
        Long currentTimeMillis = System.currentTimeMillis();
        Date dateAtual = new Date(currentTimeMillis);

        boolean isAfter = dataNasc.after(dateAtual);
        System.out.println(isAfter);

        boolean isBefore = dataNasc.before(dateAtual);
        System.out.println(isBefore);




    }



}
