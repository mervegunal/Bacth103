package day12loops;

import java.util.Scanner;

public class WhileLoops01 {
    public static void main(String[] args) {

        //Example 1: 3 den 10 a kadar tamsayilari ayni satirda ekrana yaziniz

        //1.Yol:(for loop)
        for(int i=3; i<11; i++){
            System.out.print(i+" ");

        }
        System.out.println(); //(alt satira gecmesi icin bos sout koyduk)

        //2.Yol:(while loop)

        int i=3;

        while(i<11){ //(-iken demektir. i küçük iken 11 den)
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

       //Note: while daha okunur bir kod yazar. For ve while ayni şeyleri çözer tek fark okunuslaridir

       //Example 2: 17 den 4 e kadar tum cift sayilari ekrana ayni satirda yazdiran kodu yaziniz

        int k = 17;

        while(k>3){

            if(k%2==0){
                    System.out.print(k + " ");
             }

             k--;

            System.out.println(); //bos satir icin

          //Example 3: 12 den 67 ye kadar sayılarin toplamini veren kodu yazınız
            int sum = 0;
            int m = 12;

            while(m<68){

                sum = sum + m;

                m++;
            }
            System.out.println(sum);//2212

            //Example 4: Size verilen bir tamsayinin rakamlari toplamini ekrana yazdiran kodu yaziniz

            int sonuc = 0;

            int sayi = 385;

            while(sayi>0){

                sonuc = sonuc + sayi%10;

                sayi = sayi/10;
            }
            System.out.println(sonuc);


            //Example 5: Kullanicidan aldiginiz bir sayinin carpim tablosunu ekrana yazdiriniz
            //           3 ==> 3x1=3  3x2=6  3x3=9 ... 3x10=30

            Scanner input = new Scanner(System.in);
            System.out.println("Carpim tablosunu gormek icin bir sayi giriniz");
            int s = input.nextInt();
            int n = 1;

            while(n<11){

                System.out.println(s + "x" + n + " = " + s*n);

                n++;
            }







        }








    }


}
