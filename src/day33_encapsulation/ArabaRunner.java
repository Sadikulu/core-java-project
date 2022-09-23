package day33_encapsulation;

public class ArabaRunner {
    public static void main(String[] args) {
        Araba arb1=new Araba();
        //arb1 objesi üzerinden marka variablesine ulaşabildim
        //değiştirebildim(set) ve yazdırabildim(get)
        arb1.marka="Toyota";
        System.out.println(arb1.marka);
        /*
        acces modifier kullanarak marka variablesine ulaşımı
        tamamen serbest bırakabilirim veya tamamen engelleyebilirim
        private yaptığımız modele ise hiç ulaşamayız
        yani acces midifier ya hep ya hiç diyor*/

        //modeli değiştirelim ama göremeyelim
        //yakıyıda börelim ama değiştiremeyelim

        //set ve get yetkilerini özel tanımlamak isterseniz
        //1.adım-özel yetki tanımlayacağınız variableleri private yapın
        //           private bir dataya başka classlardan ulaşmak mümkün olmadığından
        //2.adım set yetkisi için setter ve get yetkisi için getter metodları oluşturalım

        arb1.setModel("Corolla");//model olarak Supra atandı
        //modeliv yazdırma imkanımız yok ,çünkü getter yok
        System.out.println(arb1.getYakit());//Yakıt olarak elektrikli bilgisini yazdırabildik
        //yakıtı değiştiremeyiz ,çünkü setter metodu yok
    }
}
