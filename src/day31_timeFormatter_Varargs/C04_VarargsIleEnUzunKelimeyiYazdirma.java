package day31_timeFormatter_Varargs;

public class C04_VarargsIleEnUzunKelimeyiYazdirma {
    public static void main(String[] args) {
        enUzunKelimeyiYazdirma("Ali","Ayşe","Ismail","Babayiğit");
    }

    public static void enUzunKelimeyiYazdirma(String... kelime) {
        String enuzunKelime=kelime[0];
        for (String each:kelime) {
            if (each.length()>enuzunKelime.length()){
                enuzunKelime=each;
            }
        }
        System.out.println("en uzun kelime : " + enuzunKelime);
    }
}
