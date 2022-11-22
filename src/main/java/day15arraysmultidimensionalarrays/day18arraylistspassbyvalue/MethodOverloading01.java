package day15arraysmultidimensionalarrays.day18arraylistspassbyvalue;

public class MethodOverloading01 {

    public static void main(String[] args) {

       /* method overloading nasil yapilir???

        1) method isimleri ayni olmalidir
        2) method parametreleri farkli olmalidir.
        i) Parametre ayilari degistirebilir.
        ii) Parametrelerin data type'larini degistirebiliriz
        iii) Parametrelerin yerlerini degistirebilirsiniz ancak
        data type'lari farkli ise
        3)Method ismi + Parametreler = Method Signature
        Method Signature disinda neyi degistirirseniz degistirin Java o methodlari farkli kabul edilemez.

        */

        add(3,5);

    }

    public static void add(int a, int b){
        System.out.println(a+b);
    }

    public static void add(int a, int b, int c){
        System.out.println(a+b+c);
    }
    public static void add(int a, double b){
        System.out.println(a+b);
    }

    public static void add(double a, int b){
        System.out.println(a+b);
    }




}
