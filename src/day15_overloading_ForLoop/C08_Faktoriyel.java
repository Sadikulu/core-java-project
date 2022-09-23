package day15_overloading_ForLoop;

public class C08_Faktoriyel {
    public static void main(String[] args) {
        /*
        input olarak verilen bir tamsayı için faktoriyel hesaplayıp
        yazdıran bir metod oluşturun

        verilen sayı negatif veya 20'den büyük olursa "girilen sayıını
        faktoriyeli hesaplanamaz" uyarısı yazdırın
         */
        int input=5;
        faktoriyelHesapla(input);

    }

    public static void faktoriyelHesapla(int input) {
        int faktoriyel=1;
        if (input<0 || input>20){
            System.out.println("girilen sayının faktoriyeli hesaplanamaz");
        } else if (input==0) {
            System.out.println("0!=1'dir");
        }else{
            for (int i = 1; i <=input ; i++) {
                faktoriyel*=i;
            }
            System.out.println("faktoriyel değeri: "+faktoriyel);
        }
    }
}
