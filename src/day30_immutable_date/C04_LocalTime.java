package day30_immutable_date;

import java.time.LocalTime;

public class C04_LocalTime {
    public static void main(String[] args) throws InterruptedException {
        LocalTime time1=LocalTime.now();
        System.out.println(time1);//19:13:52.354644600
        /*
        bizim oluşturduğumuz date ve time canlı saat veya tarih değildir
        localtime.now kullandığımız satırda o anki tarih veya saati alıp
        bizim variablemize store eder.artık time1 variablesinin
        değeri sabittir
         */
        Thread.sleep(3000);//3 saniye bekle

        time1=LocalTime.now();//time1 yeni değer atadık
        System.out.println(time1);//19:13:55.354644600
        System.out.println(time1.getSecond());//53
        System.out.println(time1.plusSeconds(10000));//22:18:48.681077100
        System.out.println(time1.minusMinutes(200));//16:13:44.537828700
        System.out.println(time1.withHour(3));//saati 3 yaptı
    }
}
