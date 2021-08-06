package CalendarExemplo1;
import java.util.Calendar;

public class CalendarEx1 {
    public static void main(String[] args){

        Calendar hoje = Calendar.getInstance();

        System.out.println("A data atual é : " + hoje.getTime());

        hoje.add(Calendar.DATE, -15);
        System.out.println("15 dias atrás : " + hoje.getTime());

        hoje.add(Calendar.MONTH, 4);
        System.out.println("4 meses depois : " + hoje.getTime());

        hoje.add(Calendar.YEAR, -3);
        System.out.println("3 anos atrás : " + hoje.getTime());


        Calendar agora = Calendar.getInstance();
        System.out.printf("%tc\n", agora);
        //qui ago 05 22:18:49 BRT 2021

        System.out.printf("%tF\n", agora);
        //2021-08-05

        System.out.printf("%tD\n", agora);
        //08/05/21

        System.out.printf("%tr\n", agora);
        //10:18:49 PM

        System.out.printf("%tT\n", agora);
        //22:18:49
    }

}
