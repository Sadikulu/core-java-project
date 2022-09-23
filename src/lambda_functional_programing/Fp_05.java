package lambda_functional_programing;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Fp_05 {
    public static void main(String[] args) {
        Courses courseTurkishDay = new Courses("Summer", "Turkish Day", 97, 128);
        Courses courseTurkishNight = new Courses("Winter", "Turkish Night", 98, 154);
        Courses courseEnglishDay = new Courses("Spring", "English Day", 95, 132);
        Courses courseEnglishNight = new Courses("Winter", "English Night", 93, 144);

        List<Courses> coursesList = new ArrayList<>();
        coursesList.add(courseTurkishDay);
        coursesList.add(courseTurkishNight);
        coursesList.add(courseEnglishDay);
        coursesList.add(courseEnglishNight);

        System.out.println(ortalamaPuanlarVerilenSayidanBuyukMu(coursesList, 75));
        System.out.println(herhangiKursAdiVerilenKelimeyiIceriyorMu(coursesList, "Day"));
        System.out.println(ortalamaPuaniEnYuksekOlanKurs(coursesList));
        System.out.println(ortalamaPuanaGoreSiralaVeIlkVerilenleriAtla(coursesList,1));

    }

    //1)Tüm ortalama puanların verilen sayıdan büyük olup
    // olmadığını kontrol etmek için bir method oluşturun.
    public static boolean ortalamaPuanlarVerilenSayidanBuyukMu(List<Courses> list, int x) {
        return list.stream().allMatch(t -> t.getAverageScore() > x);
    }

    //2)Kurs adlarından en az birinin verilen kelimeyi içerip
// içermediğini kontrol etmek için bir method oluşturun
    public static boolean herhangiKursAdiVerilenKelimeyiIceriyorMu(List<Courses> list, String str) {
        return list.stream().anyMatch(t -> t.getCourseName().contains(str));
    }

    //3) Ortalama puanı en yüksek olan kursu
    // yazdırmak için bir yöntem oluşturun
    public static String ortalamaPuaniEnYuksekOlanKurs(List<Courses> list) {
        return list.stream().sorted(Comparator.comparing(Courses::getAverageScore).reversed()).findFirst().get().getCourseName();
    }

    //4) List öğelerini artan düzende ortalama puana
    // göre sıralayın ve ilk verilenleri atlayın
    public static List<Courses> ortalamaPuanaGoreSiralaVeIlkVerilenleriAtla(List<Courses> list,int x){
        return list.stream().sorted(Comparator.comparing(Courses::getAverageScore)).skip(x).collect(Collectors.toList());
    }

}
