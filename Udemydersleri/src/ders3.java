import java.util.Scanner;

public class ders3 {
    public static void main(String[] args) {
      /*
      Karşılaştırma Operatörleri

      ==    -->    Eşit mi ?
      !=    -->    Eşit Değil mi ?
      >     -->    Büyük mü ?
      >=    -->    Büyük veya Eşit mi ?
      <     -->    Küçük mü ?
      <=    -->    Küçük veya Eşit mi?

       */

        System.out.println(3==4);
        System.out.println(3 != 4);
        System.out.println(5 > 4);
        System.out.println(5 >= 2);
        System.out.println("mehmet" == "mehmet");   // > vb. kullanılamaz Stringler karşılaştırılamaz.


        /*
        Mantıksal Operatörler

        &&   --> and Operatörü
        Hepsi doğruysa true, biri bile yanlışsa false.

        ||   --> or Operatörü
        Bir tanesi bile doğruysa ture, hepsi yanlışsa false.

        !   --> not Operatörü
        True olan bir işlemi false, False olan bir işlemi true'ya çevirir.

         */

        System.out.println(3 != 3 && 2 > 3 || "murat" != "murat");
        System.out.println(!(3<4));
        System.out.println(!((3<4 && "murat"=="murat") || 3.4 > 2.1));




    }
}
