package day01variables;

public class Variables01 {

                         //Variable nasil oluşturulur?
        //1) Access Modifier   2)Data Type   3)Variable ismi   4)= 5)Deger   6);
        // Java'da ";" ingilizcedeki "." gibidir
        // Ingilizce'de "cumle" deriz, Java'da "statement" deriz

        //"=" sembolu "Assignment(Atama) Operator" olarak adlandırılır
        //"Assignment(Atama) Operator" sagdaki degeri alir soldaki variable'in içine koyar

        public int age=13;
        public int height = 183;

                            // Java'da Data Type'lari

                          //Primitive Data Type'lari
        /*
              1)int: Integer'in kısaltması. Integer tam sayı demektir. 32 bit kullanir.
               Matematik'de tam sayilarin basi ve sonu yoktur fakat Java'da tamsayilarin basi ve sonu vardir.
               En kucuk int= -2,174,483,648
               En buyuk int=  2,147,647

               2)byte: Tamsayilar icin kullanılır.8 bit kullanır.
                       En kucuk byte=-128
                       En buyuk byte= 127

              3)short: Tamsayilar içindir. 16 bit kullanılır.
                      En kucuk short= -32768
                      Eb büyük short= 32767

               4)Long: Tamsayilar içindir. 64 bit kullanır.
                       En kucuk long= -9,223,372,036,854,755,808
                       En buyuk long=  9,223.372.036,854,755,807

               5)float: Ondalıklı sayılar içindir. 32 bit kullanır.
                        "float" virgulden sonra 7 basamak içerebilir.
                        "float degerlerinde sonra "f" veya "F" koymanız gerekir.

               6) double: Ondalıklı sayılar içindir. 64 bit kullanır.
                          "double" virgulden sonra 7 basamak içerebilir.

               7)boolean:  "true" veya "false" degerleri icin kullanılır. 1 bit kullanır.

               8)char: Tek karakterler için kullanılır.16 bit kullanır.
                     A,c,2,?,_,=
                     Note: "char"lara deger verirken, degeri tek tirnak arasına koyunuz. Yoksa hata verir.

            Note: Java buyuk ve kucuk harflere duyarlıdır.
                              Java için TRUE ile true tamamen farklidir.

            Note: Numeric Data Types: byte < short < int < long < float < double
                  Numeric Olmayan Data Types: boolean - char


                                Non-Primitive Data Types


      String: Isim, adres, kimlik numarasi gibi bir veya birden fazla karakter iceren degerlerde kullanilir.
              String degerleri mutlaka cift tirnak arasina konulmalidir.
              String non-primitive dir. Yani bir String olusturdugunuzda Java size bir suru method verir.

                       Primitive ile Non-Primitive lerin farki nedir?
          1)Non-primitive data type'larinda degerin yaninda method'lar vardir.
                Primitive data type'larinda ise sadece deger vardir, method yoktur.
          2)Primitive data type'lari  Java tarafindan olusturulmustur, toplam 8 tanedir, biz Primitive data olusturamayiz
                Non-Primitve data type'lari Java tarafindan da olusturulmustur, biz de olusturabiliriz. Non-Primitive sayilamayacak
                kadar coktur, cunku her developer Non-Primitive data type olusturabilir.
          3)Primitive data type isimleri kucuk harflerle baslar
                Non-Primitive data type isimleri buyuk harfle baslar
          4)Primitive data type'lar memory'de farkli buyuklukte yerler kullanir.
                Non-Primitive'lerin hepsi memory'de ayni buyuklukte yer kullanirlar.



         */

        public byte price=12;
        public short population0fVillage= 23000;

        public float price0fShirt= 13.99F;
        public double weitghtOfcell= 0.000012045;

        // Siz "long" demenize rağmen Java verilen sayıyı "int" kabul eder
        // Bu yüzden, long bir variable'a "int" araliginin dısında bir sayı verirseniz mutlaka sonuna "L" veya "l" koyunuz
        public long populationOfworld = 7000000000L;

        //Burada "L" koymadığımız halde problem yok çunkü "1234" int aralığına uyar.
        public long x= 1234;

        public boolean osOld = true;
        public boolean isRich = false;

        public char initial= 'S';

        public String name = "Tom Hanks";

        //Note: "main method" arabanin motoru gibidir.
        // "main method" calismadan hicbir sey calısmaz

        public static void main(String[] args){

        }
}

