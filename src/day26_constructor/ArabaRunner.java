package day26_constructor;

import day25_constructor.Car;

public class ArabaRunner {
    public static void main(String[] args) {
        //bir gün önceki car clasından obje oluşturalım
        /*
        farklı bir package deki bir clastan obje oluşturduğumuzda
        acces midifierleri dikkate almalıyız
         */
        Car car1=new Car();
        System.out.println(car1.fiyat);
        /*
        araba classından bir obje oluşturduğumda eğer default constructor
        kullanıldıysa tüm özellikler için tek tek değer atamak zorunda kalırız
         */
        Araba araba1=new Araba();
        araba1.fiyat=100000;
        araba1.marka="Mercedes";
        araba1.yil=2010;
        araba1.model="C180";
        System.out.println("Araba1 bilgileri\nMarka :"+araba1.marka+"\n"+"model : "+araba1.model
                +"\n"+"Yıl : "+araba1.yil+"\n"+"Fiyat : "+araba1.fiyat);
        /*
        eğer bir objeyi oluştururken bazı özelliklerini argüment
        olarak belirtip o özellilerde bir obje oluşturmak istersek
        java itiraz eder. çünkü her classta default constructor vardır
        ve o da parametresizdir bizim yeni ve parametreli constructorlara
        ihitiyacımız vardır
         */
        Araba araba2=new Araba("BMW","5.20",2011,15000);
        System.out.println("Araba2 bilgileri\nMarka :"+araba2.marka+"\n"+"model : "+araba2.model
                +"\n"+"Yıl : "+araba2.yil+"\n"+"Fiyat : "+araba2.fiyat);

        Araba araba3=new Araba("Opel","Astra",2015,78000);
        System.out.println("Araba3 bilgileri\nMarka :"+araba3.marka+"\n"+"model : "+araba3.model
                +"\n"+"Yıl : "+araba3.yil+"\n"+"Fiyat : "+araba3.fiyat);



    }
}
