package day42_abstractClass_Interfaces;

public interface I03_Interfaces {

    int SAYI=20;
    /*int sayi;
    interface'lerde tüm variable'ler public static ve final'dir
    dolayısıyla sonradan değer atama şansımız yoktur
    bunun için variable oluşturduğumuzda mutlaka değer atamalıyız

    bir interface bir classsı parent edinemez
     */
    void yakit();
    /*
    interface içindeki her metod public ve abstract özelliklere
    sahiptir

    abstract bir metodun body'si olması mümkün değildir
    java sonradan developerlerin isteği üzerine kısmi bir
    update yapmıştır.
    bir interface sonradan bir abstract metod eklerseniz
    o interface'i daha once implement etmis tum class'lara gidip
    hepsinde yeni eklenen method'u override etmeniz gerekir
    Bu da buyuk ve eskiden gelen projeler icin cok zor bir islemdir.

    bunun için java Java8den itibaren interface'lere sonradan
    body'si olan metod eklenmesine izin vermiştir
    bu metodların body'si olsada interface'in yapısı gereği
    bu metodlara concrete denmez
    body'si olan bu metodlar istisna olarak kabul edilebilirler
     */

    public void motor();

    public abstract void teker();


}
