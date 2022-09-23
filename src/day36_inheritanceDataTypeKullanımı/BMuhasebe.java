package day36_inheritanceDataTypeKullanımı;

public class BMuhasebe extends APersonel {
    protected int saatUcreti=10;
    protected int gunlukMesai=8;

    protected void maas(){
        System.out.println("Personel minumum : "+(30*gunlukMesai*saatUcreti)+" maaş alır");
    }
    protected void ozelSigorta(){
        System.out.println("İsteyen çalışanlara %50 indirimli özel sigorta yapılır");
    }
}
