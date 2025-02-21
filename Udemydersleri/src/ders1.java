import java.util.*;

public class ders1 {
public static void main(String[] args) {
    System.out.print("Merhaba Java");      //Print aynı satırda bırakır.
    System.out.println("Hoşgeldiniz...");  //Println alt satırda bırakır.

    int a = 4;
    System.out.println(a);

    int b = 3 + 5 ;
    System.out.println(b);

    int toplam = a + b;
    System.out.println("Toplam = " + toplam);

    // byte --> short --> int --> long
    // int --> float --> double

    double maxDoubleValue = Double.MAX_VALUE;
    System.out.println(maxDoubleValue);

    String c = "Merhaba";
    System.out.println(c + " Hoşgeldiniz...");

    String d = "Java\tProgramlama\nDili";
    System.out.println(d);

    System.out.println(10d / 4);  //Küsüratı göstermesi için ya biri double olacak ya da float


    a += 2 ; // a = a + 2;     a++  veya ++a  da kullanılabilir
    System.out.println(a);
    a *= 4;
    System.out.println(a);


    System.out.println(b++);
    System.out.println(++b);


    Scanner Input = new Scanner(System.in);

    System.out.println("Yaşınızı giriniz");
    int yas = Input.nextInt();
    System.out.println("Yaşınız: " + yas);

    System.out.println("Bir sayı giriniz");
    double sayı = Input.nextDouble();
    System.out.println("Sayınız: " + sayı);


    System.out.println("Adınızı giriniz: ");
    Input.nextLine();        // sayısal veriden sözel veriye geçerken bi tane boşluk bırakmak lazım (Dummy denir)
    String ad = Input.nextLine();
    System.out.println("Adınız: " + ad);


    if (Input.hasNextInt()){
        int sayi = Input.nextInt();
        System.out.println("Sayı: " + sayi);
    }
    else {
        System.out.println("Lütfen bir sayı giriniz");
    }


}
}
