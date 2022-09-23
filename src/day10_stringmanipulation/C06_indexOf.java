package day10_stringmanipulation;

public class C06_indexOf {
    public static void main(String[] args) {
        String str="java ögrenmek cok guzel";
        System.out.println(str.indexOf("o"));//5
        System.out.println(str.indexOf('g'));//6
        System.out.println(str.indexOf("t"));//bana int döndürüyor
                                            // int'de yok diye bir deger yoktur
                                            //0 dersek j'nin indexidir
                                           // ama negatif bir deger dönerse biz aranan
                                           //bir string'in str'de olmadıgını anlarız
                                           // java -1 döndürmeyi tercic etmiştir

        String str5="aldkskleruıhgrnverfoırejfıebvndlğpelfrjv";
        // str5'te p varmı?
        if (str5.indexOf("=")==-1){
            System.out.println("str5'te istenen karakter kullanılmamıştır");
        }else{
            System.out.println("str5'te istenen karakter kullanılmıştır");
        }
    }
}
