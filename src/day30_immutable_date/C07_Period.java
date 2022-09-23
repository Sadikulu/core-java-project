package day30_immutable_date;

import java.time.LocalDate;
import java.time.Period;

public class C07_Period {
    public static void main(String[] args) {
        //iki tarih arasındaki süreyi bulma

        LocalDate tarih1=LocalDate.of(1989,7,25);
        LocalDate bugun=LocalDate.now();
        Period period=Period.between(tarih1,bugun);
        System.out.println(period);//P-32Y-11M-29D
        System.out.println(period.getYears());//32
    }
}
