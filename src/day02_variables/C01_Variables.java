package day02_variables;

public class C01_Variables {
    public static void main(String[] args) {
               int      not               =              60                   ;
        //Data türü  variable ismi   assigment sign  variable değeri  işlem bitti işareti


        int not2=70;

        // java önce değeri hesaplar sonra assing işlemi yapar
        // not2'yi 80 yapalım
        not2=90;

        //yeni bir int oluşturalım değeri ilk iki veriablenin ortalaması olsun
        int ort=(not+not2)/2;
        System.out.println("ortalama="+ort);

        //"  " içinde yazılan herşey metindir java tırnak içinde ne görürse onu yazdırır
        // eğer bir variable'ın değerini yazdırmak istiyorsanız
        //"  " olmadan variable ismini yazmalısınız
        System.out.println(ort);


    }

}
