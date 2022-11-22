package day19datetime.day20stringbuilderstringbuffer;

public class StringBuilder01 {
    /*
        1)StringBuilder Java'da bir Class'tir.
        2)StringBuilder, String olusturmaya yarar.
        3)"String" Class varken nicin "StringBuilder" a ihtiyac duyariz?
         Cunku "String" Class "Immutable Class'dir, ama biz bazen "Mutable" Stringlere ihtiyac duyariz,
         StringBuilder bize "Mutable" String verir.
         4)"Immutable Class"larda varolan deger degistirilemez. Siz varolan bir degeri degistirmek istediginizde
         i)Memory'de yeni bir variable yeni degerle olusturulur
         ii)Eski variable'in pointer'i yeni variable'a dondurulur
         iii)Eger bir variable'i hicbir painter gostermiyorsa o variable "Garbage Collector" tarafindan silinir

         "Mutable Class"larda varolan deger degistirilebilir. Orijinal deger korunmaz.

         5) "String Class"larin "immutable" yapisi "security" icin onemlidir.
Ayni degere sahip birden fazla String oldugunda, Java bir tane Container olusturur ve ayni degere sahip String'lerin bu container'i kullanmasini temin eder.
Bu memory'i korumak icin iyidir ancak container'daki degeri bir variable icin degistirdigimizde tum variable'larin etkilenmesi tehlikesi vardir.
Bu tehlikeden kurtulmak icin Java String'leri "immutable(degismez)" yapmistir. Fakat herhangi bir variable'in degerini degistirmek icin Java bir yol bulmustur.
Degistirmek istediginiz variable icin yeni bir container olusturur ve variable'in pointer!ini bu yeni variable'a yonlendirir.
Boylelikle hem degisim saglanmis hem de digerleri etkilenmemis olur.

     */

    public static void main(String[] args) {
        String str = "Java";
        str = "Super Java";
        System.out.println(str);

        //StrinBuilder nasil olsuturulur?
        //1.Yol:

        StringBuilder strb = new StringBuilder("Java");
        System.out.println(strb); //Java

       // 2.Yol:
         StringBuilder strb2 = new StringBuilder();
         //Yol a:
         strb2.append("Java");
         strb2.append(" is easy");
         strb2.append("!!!");
         System.out.println(strb2);

         //Yol b:
        strb2.append("Learn").append(" Java earn").append(" money."); //Method Chain
        System.out.println(strb2);

        //StringBuilder'larda character sayisi nasil bulunur? ==> length() methodu ile bulunur.

        StringBuilder strb3 = new StringBuilder();
        strb3.append("Cat");
        int numOfChar = strb3.length();
        System.out.println(numOfChar);//3

        //Capacity asimlarinda capacity cvar olanin iki katinin iki fazlasina cikar
        int capacity = strb3.capacity();
        System.out.println(capacity);//70 ==>> 34*2 + 2

        //setChart(2, 'r'); ==> Index 2'deki characteri "r" ye cevirir
        strb3.setCharAt(2,'r');
        System.out.println(strb3);//

        //deleteCharAt(2); ==> Index 2 deki characteri siler
        strb3.deleteCharAt(2);
        System.out.println(strb3);

        //reverse() method'u StrinBuilder'i ters cevirir. Ali ==> İLA
        //"mutable"larda sadece method kullanmak orijinal degeri degistirmek icin yeterlidir.
        strb3.reverse();
        System.out.println(strb3); //

        //"Immutable"larda orijinal degeri degistirmek icin methodu kullanmak yeterli olmaz bir de "atama islemi" yapmalisiniz.
        String abc = "Java";
        abc = abc.replace("a","i");
        System.out.println(abc); //Java

        //toString() methodu StrinBuilder'lari String'e cevirir.
        String stringStrb3 = strb3.toString();
        System.out.println(stringStrb3);

        StringBuilder strb4 = new StringBuilder(stringStrb3);
        System.out.println(strb4);

        //insert(3, "XXXX"); 3. character den sonra "XXXX" leri koyar.
        strb4.insert(3, "XXXX");
        System.out.println(strb4);

        //insert(3, "KLMOQRSTU",5, 8); ==> 3. characterden sonra, "KLMOQRSTU" String'inin index 5,6,7 deki characterleri yerlestirir
        strb4.insert(3, "KLMOQRSTU", 5, 8 );
        System.out.println(strb4);

        StringBuilder a = new StringBuilder("Java");
        StringBuilder b = new StringBuilder("Java");

        //a.compareTo(b) methodu
        // i)StringBuilderlar tamamiyla ayni ise 0 verir.
        // ii)a alfabetik sirada b'den sonra gelirse pozitif olarak aradaki alfabetik olarak siralama farkini gosterir
        //iii)"a" alfabetik sirada "b" den once gelirse negatif olarak aradaki alfabetik siralama farkini gosterir

       int sonuc = a.compareTo(b);
       System.out.println(sonuc);










    }

}
