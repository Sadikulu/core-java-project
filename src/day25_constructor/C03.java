package day25_constructor;

public class C03 {
    /*
   proje oluştururken bazı classlar run etmek için değil
   variable ve metod oluşturup bunlar başka classlardan
   kullanmak için oluşturulur
    */
    /*
    default constructor parametresizdir
    göremezsek bile ihtiyaç olduğunda çalışır

    class içerisinde parametreli veya parametresiz herhangi bir
    consructor oluşturursak ja default constructor'ı siler

     */
    C03(){

    }
    /* oluşturduğumuz parametresiz bu constructor
    default constructor ile birebir aynıdır
    ama biz oluşturduğumuz için buna default constructor
    demeyiz. buna parametresiz constructor deriz
     */
    String isim="Etka";
    public void method01(){
        System.out.println("C03 metod çalıştı");
    }
}
