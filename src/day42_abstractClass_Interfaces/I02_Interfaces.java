package day42_abstractClass_Interfaces;

import java.util.ArrayList;
import java.util.List;

public interface I02_Interfaces {
    int SAYI=30;
    String ISIM="Yıldız Koleji";
    /*
    interface bir class değildir

    abstract classlar java da abstraction(soyutlaştırma/kural koyma)
    işlevini yapıyordu
    ancak abstract bir classta abstract olmyan metodlarda
    olabilir bu da full abstraction yapmaya izin vermez

    eğer java da içinde hiç concrete metod olmasın dediğimiz bir
    class oluşturmak istiyorsanız bunu interface yaplısınız

    1-interface'lerde concrete metod olmaz
    2-ınterface'ler full abstraction yaptığından interface'lerden
    obje oluşturulamaz
    hatırladığınız gibi interface olan Listten direkt obje oluşmaz
    List<String> list= new List<>();
    bunun yerine constructor'u lisitin childi olan ArrayList'ten seçeriz
    List<String> list = new ArrayList<>();
    3- class'larda bir child birden fazla parent edinemez
    ancak interface'lerde concrete metod olmadığından biz
    her metodu child classta override etmek zorundayız
    override ederken kimin söylediğini override etmenin önemi yok
    4-ınterface'ler neyin yapılması gerektiğini söyler
    ama nasıl yapılacağına karışmaz

     */

}
