package day32_stringBuilder;

public class C08_equals {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Java");
        StringBuilder sb2 = new StringBuilder("Java");
        String str="Java";
        System.out.println(sb1.equals(sb2));//false
        System.out.println(sb1.equals(sb1));//true
        //Stringbuilder da equals metodu ancak aynı obje olursa
        //true döner String'deki gibi düşünmeyin
        System.out.println(sb1.equals(str));//false

        System.out.println(sb1.compareTo(sb2));//0

        StringBuilder sb3 = new StringBuilder("Jave");
        System.out.println(sb1.compareTo(sb3));//-4

        /*
        compareTo metodu iki StringBuilder'ı baştan başlayarak
        harf harf karşılaştırır.ilk harf aynı ise ikincilere geçer ve
        ilk farklı olan harfe kadar gider.
        farklı olan iki harfin ascii kodları arasındaki farkı verir
        eğer hiç farklı harf yoksa sonuç olarak 0 döndürür
         */

    }
}
