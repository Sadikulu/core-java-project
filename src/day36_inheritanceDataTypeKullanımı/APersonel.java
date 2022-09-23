package day36_inheritanceDataTypeKullanımı;

public class APersonel {
    String isim="İsim belirtilmedi";
    String soyIsim="Soyisim belirtilmedi";
    String departman="Departman belirtilmedi";

    protected void maas(){
        System.out.println("Tüm personelimiz maaş alır");
    }

    protected void sigorta(){
        System.out.println("Tüm personelimiz sigorta yapılır");
    }
}
