package day11_stringManupulations;

public class C01_indexOf {
    public static void main(String[] args) {
        String str="Java ögrenmek cok guzel";
        /*verilen bir strinde herhangi bir string veya char'ın ilk kullanıldığı index'i
        bize döndürür
         */
        System.out.println(str.indexOf('g'));//6
        System.out.println(str.indexOf("r"));//7
        System.out.println(str.indexOf("j"));//-1= küçük harf olduğu için
        System.out.println(str.indexOf("mek"));//10
        //eğer istediğimiz index'ten sonrasını kontrol etmek istersek
        //o zaman aynı metodu iki parametreli olarak kullanabiliriz
        System.out.println(str.indexOf("g",(6+1)));//18 yazılan indexten başlar
                                                           //yani 6+1 den sonra g arar
        //yukarıdaki str'de 2. ve 3. e'sinin indexsini bulunuz
        //2.e'yi bulabilmek için 1.e'nin indexine ihtiyaç var
        int ilke=str.indexOf("e");
        int ikincie=str.indexOf("e",(ilke+1));
        // eğer varsa 2.e varsas 3.e'nin olup olmadığını bulalım

        if (ikincie==-1){
            System.out.println("verilen str'de 2.e yok");
        } else {
            int ücüncüe=str.indexOf("e",(ikincie+1));
            if (ücüncüe==-1){
                System.out.println("verilen str'da 3.e yok");
            }else{
                System.out.println("verilen str'da 3.e'nin index'i= "+ücüncüe);
            }
        }
    }

}
