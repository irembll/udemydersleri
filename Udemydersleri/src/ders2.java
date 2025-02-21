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

        System.out.println("birinci sayıyı giriniz: ");
        int sayi1 = Input.nextInt();
        System.out.println("ikinci sayıyı giriniz: ");
        int sayi2 = Input.nextInt();

        System.out.println("sayi1 = " + sayi2 + " sayi2 = " + sayi1 );



    }
}
