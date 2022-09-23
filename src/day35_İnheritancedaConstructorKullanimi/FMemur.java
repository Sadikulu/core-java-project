package day35_İnheritancedaConstructorKullanimi;

public class FMemur extends EMuhasebe{
    /*
    Extends keyword kullanılan classlarda ister default cons
    bulunsun istersekte biz yeni cons.(lar) oluşturalım
    java constructorın ilk satırına super(); constructor call yazar

    super(); constructor call default constructora benzer
    görünmesede orada vardır ve çalışır
    ancak biz ilk satıra farklı bir constructor call yazarsak
    java super();'ı siler

    eğer biz müdahale edip kendi constructor callumuzu oluşturmazsdak
    javanın default olarak oluşturduğu constructor call her zaman
    parametresizdir yani super();
     */

    FMemur (){

        System.out.println("Memur parametresiz cons");
    }

    FMemur(String isim){

        System.out.println("Memur parametreli cons");
    }

    public static void main(String[] args) {
        FMemur mmr1=new FMemur("Ali");

    }

}
