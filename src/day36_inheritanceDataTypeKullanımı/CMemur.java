package day36_inheritanceDataTypeKullanımı;

import java.util.ArrayList;

public class CMemur extends BMuhasebe {
    protected int saatUcreti = 12;
    protected int gunlukMesai = 9;

    protected void maas() {
        System.out.println("Memurlar : " + (30 * saatUcreti * gunlukMesai) + " maaş alır");
    }

    protected void ozelSigorta() {
        System.out.println("Memurlar %60 indirimli özel sigorta yaptırabilir");
    }

    public static void main(String[] args) {
        CMemur mmr1 = new CMemur();
        System.out.println(mmr1.gunlukMesai);//9
        System.out.println(mmr1.saatUcreti);//12
        mmr1.maas();//Memurlar : 3240 maaş alır
        mmr1.ozelSigorta();//Memurlar %60 indirimli özel sigorta yaptırabilir
        mmr1.sigorta();//personel
        System.out.println(mmr1.isim);//personel
        System.out.println(mmr1.soyIsim);//personel
        System.out.println(mmr1.departman);//personel


        BMuhasebe mhsb1=new BMuhasebe();
        /*
        her ne kadar memur clasının içinde olsakta oluşturulan
        obje muhasebe clasından
        çünkü data türü ve constructor BMuhasebe

        String str="Murat";
        ArrayList<Integer> list=new ArrayList<>();
        Integer sayi=20;
        BMuhasebe classı da obje oluşturulabilen bir classtır
        yani data türüdür
        */
        System.out.println(mhsb1.gunlukMesai);//8 BMuhasebe
        System.out.println(mhsb1.saatUcreti);//10 BMuhasebe
        mhsb1.maas();//BMuhasebe
        mhsb1.ozelSigorta();//BMuhasebe
        mhsb1.sigorta();//personel
        System.out.println(mhsb1.isim);//personel
        System.out.println(mhsb1.soyIsim);//personel
        System.out.println(mhsb1.departman);//personel



    }
}
