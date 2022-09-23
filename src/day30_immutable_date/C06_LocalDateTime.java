package day30_immutable_date;

import java.time.LocalDateTime;

public class C06_LocalDateTime {
    public static void main(String[] args) {
        LocalDateTime tarihSaat=LocalDateTime.now();
        System.out.println(tarihSaat);//2022-07-23 T 19:40:26.374941
        System.out.println(tarihSaat.plusMonths(3).plusHours(100));//2022-10-27T23:42:36.142690300
        System.out.println(tarihSaat.minusDays(100).plusHours(100));//2022-04-18T23:43:32.545299600
        System.out.println(tarihSaat.toLocalDate());//2022-07-23

    }
}
