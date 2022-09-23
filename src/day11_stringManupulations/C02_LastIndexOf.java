package day11_stringManupulations;

public class C02_LastIndexOf {
    public static void main(String[] args) {
        String cumle="Java cok kolay, Java cok güzel";
        String kelime="kolay";
        //verilen kelimen için aşağıdaki şartlardan uygun olanı yazan bir programı yazınız
        //verilen kelime cümlede kullanılmamış
        //verilen kelime cümlede sadece 1 kez kullanılmış
        //verilen kelime cümlede 1'den fazla kullanılmış
        int kelimeIlkIndex=cumle.indexOf(kelime);
        int kelimeSonIndex=cumle.lastIndexOf(kelime);
        if (kelimeIlkIndex==-1){
            System.out.println("verilen kelime cümlede kullanılmamış");
        } else if (kelimeSonIndex==kelimeIlkIndex) {
            System.out.println("verilen kelime cümlede sadece 1 kez kullanılmış");
        }else{
            System.out.println("verilen kelime cümlede 1'den fazla kullanılmış");
        }

    }
}
