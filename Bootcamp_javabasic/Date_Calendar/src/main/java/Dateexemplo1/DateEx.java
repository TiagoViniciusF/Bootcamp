package Dateexemplo1;

import java.util.Date;

public class DateEx {
    public static void main(String[] args){

        Long currentTimeMillis = System.currentTimeMillis();
        System.out.println(currentTimeMillis);

        Date novaData = new Date(currentTimeMillis);
        System.out.println(novaData);
    }
}
