package day18_whileDoWhileLoop;

public class C02_WhileLoop {
    public static void main(String[] args) {
        //kullanıcıdan bir sayı alın ve bu sayının rakamları toplamını yazınız
        int input=5432;
        int toplam=0;
        int birlerBasmagi=0;
        int temp=input;

        while (temp>0){
            birlerBasmagi=temp%10;
            toplam+=birlerBasmagi;
            temp/=10;
            
        }
        System.out.println("toplam = " + toplam);
    }
}
