package day17_nestedForLoop;

public class C02_NestedForLoop {
    public static void main(String[] args) {
        //verilen sayıya göre çarpım tablosu oluşturun
        int input=3;
        for (int i = 1; i <=input ; i++) {
            for (int j = 1; j <=input ; j++) {
                System.out.print(i*j+" ");


            }
            System.out.println("");
        }

    }
}
