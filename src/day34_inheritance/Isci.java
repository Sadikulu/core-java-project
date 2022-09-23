package day34_inheritance;

public class Isci extends Personel {
    /*
    Normal hayatımızda parent çocuk sahibi olmaya karar verebilir
    java da ise child classlar özelliklerini inherit etmek
    istedikleri classı kendilerine parent edinirler

    mesela işçi clasını oluşturunca nelere ihityacı var diye düşünsek
    personel clasındaki tüm variable ve metodlara ihtiyacı olduğunu
    görebiliriz. Bu durumda yeniden tüm variable ve metodları yeniden
    oluşturmak yerine personel clasını kendimize parent ilan ediriz

    bir classı parent edinmek için extends keyword kullanmalıyız
    bir class başka bir classı parent edindiğinde
    1-parent classtaki tüm özelliklere(variabla+metod)
    otomatik olarak sahip olur
    2-parent classtaki özelliklerin bazılarını kendilerine uyarlayabilir
    3-parent classta olmayan bazı yeni özellikler oluşturabilir
    Not:parent classtaki özelliklerden hiçbirini red edemez ama
    değiştirebilir
     */
    int persNo=1001;

    public static void main(String[] args) {
        Isci isci1=new Isci();
        System.out.println(isci1.isim);//İsim belirtilmedi
        //kendi classımızda isim variavlesi yok onun için parente gidiyoruz
        isci1.isim="Selim";
        System.out.println(isci1.persNo);//1001 kendi clasımızda varsa onu kullanırız
        isci1.maas();//İşçiler minumum 15 euro saat ücreti alır


    }
    public void maas() {
        System.out.println("İşçiler minumum 15 euro saat ücreti alır");
    }
    public void ozelSigorta() {
        System.out.println("İşçilerden isteyene %50 indirimli özel sigorta yaptırılır");
    }
}
