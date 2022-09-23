package day12_stringManipulations;

public class C02_replaceAll {
    public static void main(String[] args) {
        String str="1Bu2gu3n Ja*va- cok g3uz/el";
        //str' Bugun Java cok guzel haline getirin
        // replaveall deki all'ın amacı aynı özellikteki  karakterleri kapsar
        //bütün sayıları sil
        //bütün özel karakterleri sil


        //tüm özel karakterleri silelim dediğimizde space'lerde siliniyor
        //space'leri korumak için en başta onların yerine cümlede bulunmayacak
        // bir String koyalım
        //"qazwsx"
        str=str.replace(" ","qazwsx");
        str=str.replaceAll("\\W","");
        System.out.println(str);//1Bu2gu3nJavacokg3uzel
        str=str.replaceAll("\\d","");
        System.out.println(str);
        //istenmeyen özel karekter ve sayılardan kurtulduk
        //şimdi space'leri geri getirelim
        str=str.replace("qazwsx"," ");
        System.out.println(str);
    }
}
