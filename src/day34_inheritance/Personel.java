package day34_inheritance;

public class Personel {
    /*
    eğer parent class olacak şekilde tasarladığınız bir class varsa
    veya ilerde bu classı parent yapmak isteyenler olabilir diyorsanız
    variable ve metodların acces modifierini protected seçmeliyiz
     */
    protected int persNo;
    protected String isim="İsim belirtilmedi";
    protected String departman="Departman belirtilmedi";

    protected void maas(){
        System.out.println("Tüm personelin maaşı vardır");

    }
    protected void mesai(){
        System.out.println("Tüm personel statüsüne göre mesai yapar");

    }
    protected void fazlaMesaiUcreti(){
        System.out.println("Personel fazla mesai ücretini statüsüne göre alır");

    }
}
