import java.util.Scanner;

public class ders4 {
    public static void main(String[] args) {
        /*

        if (koşul) {
            Koşul sağlanınca (true) bu blok çalışır.

            }

        else {
        Bu bloğun üstündeki herhangi bir koşul sağlanmadığında bu blok çalışır.

        }

         */

        Scanner Input = new Scanner(System.in);

        System.out.println("Lütfen yaşınızı giriniz : ");
        int yaş = Input.nextInt();

        if (yaş<18) {
            System.out.println("Bu mekana giremezsiniz.");
        }
        else {
            System.out.println("Bu mekana girebilirsiniz.");
        }

        /*

        if (koşul) {

        }
        else if (başka bir koşul) {

        }
        else if (başka bir koşul) {

        }
        else {

        }

         */

        System.out.println("Lütfen notunuzu giriniz: ");
        int not = Input.nextInt();

        if (not >= 90) {
            System.out.println("AA");
        }
        else if (not >= 85) {
            System.out.println("BA");
        }
        else if (not >= 80) {
            System.out.println("BB");
        }
        else if (not >= 75) {
            System.out.println("CB");
        }
        else {
            System.out.println("Dersten Kaldınız");
        }

        /*

        switch (op) {
            case durum1:
                islemler
                break
            case durum2:
                islemler
                break
                .
                .
                .
           default:
                islemler
                break
          }

         */

        System.out.println("Lütfen islem giriniz");
        int islem = Input.nextInt();

        switch (islem) {
            case 1:
                System.out.println("1.işlem");
                break;
                case 2:
                    System.out.println("2.işlem");
                    break;
                    case 3:
                        System.out.println("3.işlem");
                        break;
                        case 4:
                            System.out.println("4.işlem");
                            break;
                        default:
                            System.out.println("Geçersiz işlem");
                            break;
        }




    }
}
