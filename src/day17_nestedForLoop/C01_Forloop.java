package day17_nestedForLoop;

public class C01_Forloop {
    public static void main(String[] args) {
       //verilen Stringdeki kullanılan harflaeri tekrarsız olarak
        //yazdırıp kelimede kullanılan farklı harf sayısıveren bir metod yapalım
        String input="Java her zaman guzel";
        tekrarsızYap(input);

    }

    public static void tekrarsızYap(String input) {
        String benzersizInput="";
        String islenecekKelime=input.replaceAll("\\W","");
        System.out.print(islenecekKelime.substring(0,1));
        benzersizInput+=islenecekKelime.substring(0,1);

        for (int i = 1; i <islenecekKelime.length(); i++) {
            if (!benzersizInput.contains(islenecekKelime.substring(i, i + 1))) {
                System.out.print(", " + islenecekKelime.substring(i, i + 1));
                benzersizInput += islenecekKelime.substring(i, i + 1);
            }
        }
        System.out.println(" ");
        System.out.println("input = " + input);
        System.out.println("benzersizInput = " + benzersizInput);

    }
}
