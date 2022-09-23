package day10_stringmanipulation;

public class C01_charAt {
    public static void main(String[] args) {
        String  str="java ögrenmek ne guzel";
        System.out.println(str.charAt(0));//ilk harfi yazdırır j
        System.out.println(str.toUpperCase().charAt(7));//R harfi yazdırır
        System.out.println(str.charAt(21));//l harfini verir
        //System.out.println(str.charAt(22));//hata verir çünkü 22 harfli değil
        // son harfi bulmak için str'nin uzunluğunun 1 eksiğini index olarak giririz
        // eğer index  uzunluğu veya başka bir sayıyı girersek hata verir
        // charAt kullandığımızda sonuç char olacağından artık manipulation yapamayız
        // String metodlarından birini kullanacaksak charAt'ten önce kullanmalıyız

    }
}
