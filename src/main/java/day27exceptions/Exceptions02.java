package day27exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions02 {

    /*
   1) FileInputStream fis = new FileInputStream("src/main/java/day27exceptions/File1.txt");
   "new" den sonraki "FileInputStream" hata verir. Cunku; biz Java'ya verilen adresteki dosyaya git dedik, Java
   iki endiseye kapidi. i) Ya adres yanlissa  ii)Ya verilen adreste dosya yoksa.
   Biz "method isminden" sonra, "throws FilNotFoundException" yazarak, Java'ya bu iki endise duydugun durum olursa "Exception At" dedik.

   2) while(k = fis. reaad()) != -1{} yazdigimizda "read()" methodu hata verir. Cunku biz Javaya dosyadaki karakterleri oku dedik. Jaava bir endiseye kapildi
   i) Yaa okumasi gereken karakterler Java'nin bilmedigi karakterlerse
   Biz method isminden sonra "throws IOExpection" yazarak, Jaava'ya bu durumla karsilastiginda "Expection At" dedik.

   3)Method isminden sonra "throws IOException" yazarsanız Java "throws FileNotFoundException" ı siler. Çünkü;
       "IOException", "FileNotFoundException" ı kapsar. "IOException", "FileNotFoundException" ın parent'ıdır, onun yaptığı
       her şeyi yapabilir, o yüzden "IOException" varken "FileNotFoundException" a gerek yoktur.

       "IOException", "Input Output Exception" demektir.



     */
    //1.Way:
    public static void main(String[] args) throws IOException {

        readTheTextFromTheFile();

    }

    //Bir text file'daki text'i okuyan kodu yaziniz.
    public static void readTheTextFromTheFile() throws IOException {

        FileInputStream fis = new FileInputStream("src/main/java/day27exceptions/File1.txt");
        int k = 0;
        while ((k = fis.read()) != -1) {
            System.out.print((char) k);
        }

    }

    //2.way:

    public static void readTheText() {
        try {
            FileInputStream fis = new FileInputStream("src/main/java/day27exceptions/File1.txt");

            int k = 0;
            while ((k = fis.read()) != -1) {
                System.out.print((char) k);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Dosya'nin adresi veya varligi ile ilgili bir problem var.");
        } catch (IOException e) {
            System.out.println("Dosya'da okunamayan bir karakter var");
        }


    }
}
