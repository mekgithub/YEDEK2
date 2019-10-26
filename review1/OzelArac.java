package review1;


public class OzelArac {

    private boolean camlarAcilabilir;
    private boolean kapilarAcilabilir;

    public OzelArac() {
        motorDegerleriniKontrolEt();
    }

    private void motorDegerleriniKontrolEt() {
        System.out.println("Arabanın motor değerlerinin kontrol edilmesi tamamlandı.");
    }


    protected boolean arabayiCalistir() {
        System.out.println("Arabayı çalıştırmak için gerekli tetikleme yapıldı.");
        System.out.println("Araba başarılı bir şekilde çalıştırıldı.");

        return true;
    }

    public boolean isCamlarAcilabilir() {
        return camlarAcilabilir;
    }

    protected void setCamlarAcilabilir(boolean camlarAcilabilir) {
        this.camlarAcilabilir = camlarAcilabilir;
    }

    public boolean isKapilarAcilabilir() {
        return kapilarAcilabilir;
    }

    protected void setKapilarAcilabilir(boolean kapilarAcilabilir) {
        this.kapilarAcilabilir = kapilarAcilabilir;
    }
}