package day26exceptions;

public class Exceptions03 {

    public static void main(String[] args) {

        double d=divideStringByTheNumOfTheChar("124");
        System.out.println(d);//41,0
    }

    //String'deki character sayisini bulunuz, String'i integer'a ceviriniz, Integer'i character sayisina bolunuz.

    public static double divideStringByTheNumOfTheChar(String str){

        int length=str.length();

        int i=Integer.valueOf(str);

        return i/length;
    }

    public static double divideStringByTheNumOfTheCharacter(String str){
        int length = 0;
        int i = 0;
        double sonuc = 0;
        try {
            length = str.length();//NullPointerException: "null" String ile "length()" kullanildiginda alinir
            i = Integer.valueOf(str);//NumberFormatException: Icinde rakamdan farkli character olan String'ler valueOf() ile kullanildiginda
            sonuc = i / length;//ArithmeticException: Bolen sayi sifir oldugunda alinir
        }catch(NullPointerException e){
            System.out.println("NullPointer'a ozel");
        }catch(NumberFormatException e){
            System.out.println("Diger tum Exceptition'lar icin...");
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        return sonuc;
    }

    /*
     Note: 1)Aralarinda "parent-child" relationship olan Exception Claass'lari multiple catch'lerde kullanmak isterseniz


     */


}




