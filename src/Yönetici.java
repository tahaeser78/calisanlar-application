public class Yönetici extends Calisanlar{

    private int sorumluKisi ;

    public Yönetici(String isim, String soyad, int id, int sorumluKisi) {
        super(isim, soyad, id);
        this.sorumluKisi = sorumluKisi ;

    }
    public void zamYap (int miktar ) {

        System.out.println(getIsim() +" adlı yönetici çalışanlara " + miktar + " kadar zam yapıyor " );
    }
}
