public class Calisanlar {
    private String isim ;
    private String soyad ;
    private int id ;

    public Calisanlar(String isim, String soyad, int id) {
        this.isim = isim;
        this.soyad = soyad;
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void bilgileriGöster () {
        System.out.println("isim : " + isim);
        System.out.println("soyad : " + soyad);
        System.out.println("id : " + id );

    }
}
