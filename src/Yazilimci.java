public class Yazilimci extends Calisanlar{

    private String diller ;


    public Yazilimci(String isim, String soyad, int id,String diller) {
        super(isim, soyad, id);
        this.diller = diller ;
    }
    public void formatAt (String pc) {
        System.out.println(getIsim() + " adlı yazılımcı " + pc + " marka bilgisayara format atıyor...");
    }
}
