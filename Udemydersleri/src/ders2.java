import java.util.Scanner;

public class ders2 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        //  BEDEN KİTLE INDEKSİ HESAPLAMA

        System.out.println("Lütfen boyunuzu giriniz (Örnek: 1,58)");
        double boy = Input.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz");
        int kilo = Input.nextInt();
        double bedenkitleindeksi = kilo / (boy * boy);
        System.out.println("Beden Kitle İndeksiniz: " + bedenkitleindeksi);
        System.out.println();


        //KİLOMETREYE GÖRE TOPLAM ÖDENECEK TUTAR HESAPLAMA

        System.out.println("Kilometrede kaç kuruş yakıyor ? ");
        double kuruş = Input.nextDouble();
        System.out.println("Kaç kilometre yol gitti?");
        double yol = Input.nextDouble();
        double ödenecek = kuruş * yol;
        System.out.println("Toplam ödemeniz gereken tutar: " + ödenecek + " tl'dir.");


        //KULLANICIDAN ALDIĞINIZ İKİ SAYININ DEĞERİNİ DEĞİŞTİRME

        int birinci_sayi;
        int ikinci_sayi;

        System.out.println("birinci sayıyı giriniz: ");
        birinci_sayi = Input.nextInt();

        System.out.println("ikinci sayıyı giriniz: ");
        ikinci_sayi = Input.nextInt();

        System.out.println("değiştirilmeden önce... ");
        System.out.println("Birinci sayı : " + birinci_sayi  + " İkinci sayı : " + ikinci_sayi );

        int gecici = birinci_sayi;
        birinci_sayi = ikinci_sayi;
        ikinci_sayi = gecici;

        System.out.println("Değiştirildikten sonra...");
        System.out.println("Birinci sayı : " + birinci_sayi + " İkinci sayı : " + ikinci_sayi );


        // DİK ÜÇGENİN HİPOTENÜSÜNÜ BULMA

        System.out.println("Üçgenin bir kenarını giriniz : ");
        double köşe1 = Input.nextDouble();

        System.out.println("Üçgenin diğer kenarını giriniz : ");
        double köşe2 = Input.nextDouble();

         double hipotenüs = Math.sqrt(köşe1* köşe1 + köşe2 * köşe2);   //Math.sqrt karekök almaya yarar.
        System.out.println("Hipotenüs : " + hipotenüs);




    }
}
