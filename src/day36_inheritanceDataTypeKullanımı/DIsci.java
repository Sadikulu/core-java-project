package day36_inheritanceDataTypeKullanımı;

public class DIsci extends BMuhasebe {
    protected int saatUcreti = 11;
    protected int gunlukMesai = 7;

    protected void maasIsci() {
        System.out.println("Isçiler : " + (30 * saatUcreti * gunlukMesai) + " maaş alır");
    }

    protected void ozelSigortaIsci() {
        System.out.println("Memurlar %70 indirimli özel sigorta yaptırabilir");
    }

    public static void main(String[] args) {
        BMuhasebe isc1=new DIsci();
        /*
        bir obje oluşturulurken data türü ve constructor aynı
        classtan ise direkt o classa gidiyorduk

        eğer data türü ve constructor farklı ise
        obje constructorın olduğu classın objesidir
        ancak bizden istenen
        işçi clasındaki spesifik özellikler değil
        bir işçinin muhasebe classında tüm çalışanlarla beraber
        sahip olduğu genel özellikleri yazdırır
         */
        System.out.println(isc1.gunlukMesai);//8 BMuhasebe
        System.out.println(isc1.saatUcreti);//10 BMuhasebe
        isc1.maas();//BMuhasebe Personel minumum : 2400 maaş alır
        isc1.ozelSigorta();//BMuhasebe İsteyen çalışanlara %50 indirimli özel sigorta yapılır
        isc1.sigorta();//Personal
        System.out.println(isc1.isim);//Personal
        System.out.println(isc1.soyIsim);//Personal
        System.out.println(isc1.departman);//Personal


        APersonel isc2=new DIsci();
        //System.out.println(isc2.gunlukMesai);//
        //System.out.println(isc2.saatUcreti);//
        isc2.maas();// BMuhasebe
        //isc2.ozelSigorta();//
        isc2.sigorta();//Personal
        System.out.println(isc2.isim);//Personal
        System.out.println(isc2.soyIsim);//Personal
        System.out.println(isc2.departman);//Personal
        /*
        eğer data türü olan classta aradığımız özellik yoksa
        varsa parentinr gidebilir ama childe dönüş olmaz
        aradığı özelliği bulamazsa CTE verir
         */
    }
}
