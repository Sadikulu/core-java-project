package day16_forLoop;

public class C03_ForLoop {
    public static void main(String[] args) {
        /* 10 ile 30 arasindaki(10 ve 30 dahil)
                sayilari aralarinda virgul olarak ayni satirda yazdirin*/
        for (int i = 10; i <=30 ; i++) {
            if (i<30){
                System.out.print(i+",");
            }else{
                System.out.print(i);
            }
        }
    }
}
