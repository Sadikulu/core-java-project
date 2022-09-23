package day41_abstrackClass_Interface;

public abstract class DAraba {
    public static void main(String[] args) {
        /*
        abstract class da main metod opsiyonel'dir
        eğer abstract class sadece child class'ların taşımak zorunda
        olduğu özellikleri belirlemek için oluşturulduysa main metoda
        ihtiyaç olmaz sadece abstract metodlar olur
        ama bir abstract metod'da standart nelirlemek dışında da
        metodlar çalışabilir bu durumda ihitiyaç olursa main oluşturulabilir

         */
    }
    protected abstract void yakit();
    protected abstract void kaporta();

    protected abstract void motor();
    /*
    sadece child class'ların mecburi taşıyacakları özellikleri
    belirleyen metodlar abstract metod olur ve abstract
    metodların {} olmaz
     */
    public void klima(){
        System.out.println("Bazı arabalarda klima olabilir");
        /*
        abstract olmayan metodlara concrete metod denir
        abstract metodu abstract keyword ile belirtmek zorunludur
        concrete metodlarda bunun declare edilmesine gerek yoktur
        biz sadece abstraction ile ilgili konuştuğumuzda
        abstract olmayan metodlardan bahsetmek için concrete tabiri
        kullanırız
         */
    }
}
