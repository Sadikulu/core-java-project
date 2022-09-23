package day31_timeFormatter_Varargs;

public class C05_VarargsParametreIleKullanma {
    public static void main(String[] args) {
        enUzunKelimeyiYazdirma(5,"Ali","Ayşe","Ismail","Ahmet","Babayiğit");
        /*
        Varargs teorik olarak sonsuz sayıda element yazilabilir
        bir metod'da parametre olarak varargs varsa varargs'ın
        sınırlarını bilebilmesi için parametrelerin sonuncusu olmalıdır
        öncesinde farklı parametreler olabilir ama varargs'dan
        sonra parametre olamaz
        bu kuraldan dolayı bir metod'da sadece bir varargs oabilir
         */
    }

    public static void enUzunKelimeyiYazdirma(int kelimeSayisi,String... kelime) {
        String enuzunKelime=kelime[0];
        for (String each:kelime) {
            if (each.length()>enuzunKelime.length()){
                enuzunKelime=each;
            }
        }
        System.out.println("en uzun kelime : " + enuzunKelime);
    }
}
