package day09stringmanipulations;

import java.util.Scanner;

public class StringManipulation01 {

    public static void main(String[] args) {

        String str = "Kara kara dusunme Ankara";

        //indexOf() method'u verilen character veya characterlerin "ilk gorunumun" index'ni verir.
        int idxA1 = str.indexOf("kara");
        System.out.println(idxA1);

        //lastIndexOf() method'u verilen character veya characterlerin "son gorunumun" index'ini verir.
       int idxA2 =  str.lastIndexOf("kara");
        System.out.println(idxA2);

        String s ="Mississippi";

        int idxI = s.indexOf("i");//indexOf() hem String hem de char ile kullanilabilir.

        System.out.println(idxI); // 1

        int idxIss1 = s.indexOf("iss");//Ilk gorunumun ilk karakterinin indexini verir

       int idxIss2 = s.lastIndexOf("iss"); //Son gorunumun "ilk" karakterinin indexini verir

        System.out.println(idxIss2);//4

        //Example 1: Bir String'deki bir characterin tekrarli veya tekrarsiz olup olmadigini gosteren kodu yaziniz
        //        "Helloooo" ==> H-->Tekrarsiz  e-->Tekrarisiz l-->Tekrarli  o-->Tekrarli


        String t = "Helloooo";
        char c = 'e';

        if(t.indexOf(c)==t.lastIndexOf(c)){
            System.out.println("Tekrarsiz");
        }else{
            System.out.println("Tekarli");
        }

        String u = "Learn Java earn money";
     //indexOf() iki parametre ile kullanilirsa ikinci parametrede verilen sayi kadar characteri gectikten sonra istenen characterin
     // ilk gorunumunun indexini return eder.
       int sonuc = u.indexOf("e",4);

        System.out.println(sonuc);//11
//lastIndexOf() iki parametre ,le kulanilirsa ikinci paramaetrede verilen sayiyi index olarak kabul edip en bastan
      String m = "Hello everyone!";
      int e = m.lastIndexOf("e",7);
        System.out.println(e);

      String v= "   " ;
     //isEmpty() Methodu bir String'in bos olup olmadigini kontrol eder.
     // Eger String'de hic character yoksa isEmpty() "true" return eder, herhangi bir character varsa "false" return eder.
     //length()==0 demek isEmpty() true verir demektir.
     //Bir Stringin bos olup olmadigini anlamak icin "length()==0" kullanmayin, "isEmpty()" kullanin
     //index saymaya daima 0 dan baslar

     boolean bosMu = v.isEmpty();
     System.out.println(bosMu);

     String x = " ";
     //isBlank() hem bos String icin hem de "sadece space" iceren Stringler icin true return eder.
     boolean blankMi = x.isBlank();

        System.out.println(blankMi);//true

        //Exampele 2: Kullanicidan alinan isim mutlaka space'den farkli en az 1 character icermelidir.

        Scanner input = new Scanner(System.in);
        System.out.println("Ilk isminizi giriniz...");
        String ilk = input.nextLine();

        if(ilk.isBlank()){
            System.out.println("Sana ismini gir dedim...");
        }else{
            System.out.println(ilk);
        }



    }
}
