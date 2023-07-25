import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("PROGRAMA HOŞGELDİNİZ...");
        String islemler = "1- yazilimci \n" +
                "2- yönetici işlemleri \n" +
                "çıkış için q ya basın ";

        Yazilimci yazilimci = new Yazilimci("Ayşe", "Coşkun", 123, "java , pyhton");
        Yönetici yönetici = new Yönetici("Mustafa Murat", "Coşkun", 3213, 10);


        while (true) {
            System.out.println(islemler);
            String islem = scanner.nextLine();

            if (islem.equals("q")) {
                System.out.println("Programdan çıkış yapılıyor...");
                break;
            } else if (islem.equals("1")) {
                String yazilimciİslemler = "1- Bilgileri Göster \n" +
                        "2- format at \n" +
                        "Ana menüye dönmek için q ya basın ";
                while (true) {
                    System.out.println(yazilimciİslemler);
                    System.out.println("hangi işlemi yapmak istediğiniz seçiniz");
                    String yazilimciİslem = scanner.nextLine();
                    if (yazilimciİslem.equals("q")) {
                        System.out.println("ana menüye dönülüyor ");
                        break;
                    } else if (yazilimciİslem.equals("1")) {
                        yazilimci.bilgileriGöster();

                    } else if (yazilimciİslem.equals("2")) {
                        System.out.println("format atmak istediğiniz pc markası nedir ? ");
                        String pc = scanner.nextLine();
                        yazilimci.formatAt(pc);

                    }
                }

            } else if (islem.equals("2")) {
                String yöneticiİslemler = "1- Bilgileri Göster \n" +
                        "2- zam yap \n" +
                        "Ana menüye dönmek için q ya basın ";


                while (true) {
                    System.out.println(yöneticiİslemler);
                    System.out.println("hangi işlemi yapmak istediğiniz seçiniz");
                    String yöneticiİslem = scanner.nextLine();
                    if (yöneticiİslem.equals("q")) {
                        System.out.println("ana menüye dönülüyor ");
                        break;
                    } else if (yöneticiİslem.equals("1")) {
                        yönetici.bilgileriGöster();

                    } else if (yöneticiİslem.equals("2")) {
                        yönetici.zamYap(12000);


                    }


                }

            }
        }
    }
}