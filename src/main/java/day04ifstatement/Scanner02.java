package day04ifstatement;

import java.util.Scanner;

public class Scanner02 {

   /* Note: char variableri matematiksel islemlerde kullanirsaniz, Java onlari ASCII degerlerini kullanir.
    orn; Sytem.out.println('A' + 'C'); ekrana AC yerine 132 yazdirir.
    Note: Javada "+" sembolunun iki anlami vardir. i) toplama islemi ii)Birlestirme islemi(Cancatenation)
     Java "+" gorunce toplama yapmaya calisir, yapamazsa birlestirme islemi yapmaya calisir, o da olmazsa hata verir.


    */
    public static void main(String[] args) {
        // Kullanicidan ilk ve soy ismini aliniz. İlk harflerini ekrana yazdiriniz
        // Ali Can ==> AC

    Scanner input = new Scanner(System.in);

        System.out.println("Ilk isminizi giriniz...");
        char ilk = input.next().charAt(0);//A

        System.out.println("Soy isminizi giriniz...");
        char son = input.next().charAt(0);//C (0 ilk karakter icin)

        System.out.println("" + ilk + son); //AC (stringi koyarak ASCII degerleri kullanmasini önledik)


       //2.Yol

        System.out.println("Tam isminizi giriniz");

        String tamIsim = input.nextLine();// Ali Can

        char ilkHarf = tamIsim.charAt(0);
        System.out.print(ilkHarf);

        char soyIsminIlkHarfi = tamIsim.split(" ")[1].charAt(0);
        System.out.println(soyIsminIlkHarfi);





    }
}
