package day07ternaystringmanipulation;

public class StringManipulation01 {
    public static void main(String[] args) {

    /*
                                 String Class Methodlari

       1)equals(): i)Iki tane String'in ayni olup olmadigini anlamaniza yarar.
                   ii)equals() methodu "boolean" return eder.

       2)equalsIgnorcase(): i) ıKi tane Stringin aynş olup olmadigini buyuk harf kucuk harfe dikkat etmeden anlamamiza yarar.
                            ii) equalsIgnoreCase() methodu "blooean" return eder

       3)toLowerCase(): i) Bir Stringdeki tum harfleri kucuk harfe cevirmek icin kullanilir.
                        ii) toLowerCase() methodu "String" return eder

       4)toUpperCase(): i) Bir Strşngdeki tum harfleri buyuk harfe cevirmek icin kullanilir.
                        ii)toUpperCase() methodu "String" eder.

       5)charAt(): i) Bir Strinden belli bir index deki characteri almak icin kullanilir
                   ii) charAt() methodu "char" return eder

       6)lenght(): i)Bir String'de kac tane character kullanildigini ogrenmek icin kullanilir
                   ii) lengt() methodu "int" return eder

       7)contains(): i) Bir Strinde belli bir characterin veya characterlerin var olup olmadigini anlamak icin kullanilir
                    ii) contains() method'u "blooean" return eder.

        8)split(): i)Bir String'i istedigimiz character'den parcalamaya yarar.
                   ii)split() method'u "Array" return eder.

 */
        /* Bir passwordun gecerli olup olmadigini asagidaki kurallara gore kontrol eden kodu yaziniz
         i)En az 8 character icermeli
         ii) space characteri icermemeli
         iii) Ilk harfi "M" veya "m" harf olmali
         iv)Son characteri "?" olmali

!! ONEMLİ
      */
        String pwd = "manisa12?";
        //En az 8 character icermeli
        boolean first = pwd.length() > 7;

        //ii)Space icermemeli
        boolean second = !pwd.contains("");

        //iii)Ilk harfi "M" veya "m" olmali
        boolean third = pwd.charAt(0) == 'M' || pwd.charAt(0) == 'm';

        //iv)Son characteri "?" olmali
        boolean fourth = pwd.charAt(pwd.length() - 1) == '?';

        System.out.println(first && second && third && fourth);

    }


}
