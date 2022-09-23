package day33_encapsulation;

public class Tasit {
    private String tasitTuru;
    private boolean muayenesiVarMi;
    private int yil;

    public String getTasitTuru() {
        return tasitTuru;
        //getter metodu da tek satırlık bir işlem yapıyor
        //başka classların private olduğu için erişemediği
        //tasitTuru bilgisini class içinden alıp
        //istenen farklı classlara return ediyor
    }

    public void setTasitTuru(String tasitTuru) {
        this.tasitTuru = tasitTuru;
        //return olmadığı icin bu methodun cağırıldığı tasitrunner
        // classinden yazdirilamaz
        //burada bir satırlık islem yapıyor o bir satırlık islemde
        // bizim gönderdiğimiz parametreyi instence variable a atıyor.
    }

    public boolean isMuayenesiVarMi() {
        return muayenesiVarMi;
        //boolean variableler için oluşturulan getter metodlarının
        //ismi isvariableismi(isMuayenesiVarMi) şeklinde olur
    }

    public void setMuayenesiVarMi(boolean muayenesiVarMi) {
        this.muayenesiVarMi = muayenesiVarMi;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }
}
