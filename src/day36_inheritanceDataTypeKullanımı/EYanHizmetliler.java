package day36_inheritanceDataTypeKullanımı;

public class EYanHizmetliler extends BMuhasebe {
    protected int saatUcreti = 9;
    protected int gunlukMesai = 8;

    protected void maas() {
        System.out.println("Yan Hizmetliler: " + (30 * saatUcreti * gunlukMesai) + " maaş alır");
    }

    protected void issizlikSigorta() {
        System.out.println("Yan Hizmetliler %30 indirimli işsizlik sigortası yaptırabilir");
    }

    public static void main(String[] args) {
        /*
        overriding child classtaki bir metodun
        parent classtaki aynı isimdeki metodu etkisiz hale
        getirerek kendisinin spesifik özelliğini ortaya çıkarmasıdır

        overriding nerede dikkate alıyoruz
        bir obje oluşturulurken data türü ve constractor farklı ise

        eğer bir obje oluşturulurken data türü ve constractor farklı ise
        objenin özelliklerini belirlerken üç konuya dikkat çekmeliyiz
        1-obje constractorın olduğu classta oluşur
        2-objenin özelliklerini aramaya data türünün olduğu classtan başlarız
        bu classta aranan özellik bulunamazsa parent classlara bakılır
        oradada bulamazsak CTE verir

        eğer aranan özellik variable ise buldupumuz ilk değer, yazdırırız
        3- aranan özellik metod ise değeri yazdırmadan önce override
        edilmiş mi kontrol etmemiz gerekir
        eğer override edildiyse en güncel değeri yazdırırız
         */

        BMuhasebe yh1=new EYanHizmetliler();
        System.out.println(yh1.gunlukMesai);//8 BMuhasebe
        System.out.println(yh1.saatUcreti);//10 BMuhasebe
        yh1.maas();//EYanHizmetliler Yan Hizmetliler: 2160 maaş alır
        yh1.ozelSigorta();//BMuhasebe
        yh1.sigorta();//Personal
        System.out.println(yh1.isim);//Personal
        System.out.println(yh1.soyIsim);//Personal
        System.out.println(yh1.departman);//Personal
        //System.out.println(yh1.issizlikSigorta);
        //aramaya muhasebeden başladığımızdan issizlikSigortası
        //bulamadık o nedenle CTE verir
    }
}
