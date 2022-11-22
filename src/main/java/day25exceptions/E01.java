package day25exceptions;

public class E01 {

    /* 1)"Expention" (istisnai hata) javada kodlarimizi calistirirken meydana gelen beklenmedik durumlardir.
       2) Expention lar ile calismanin iki yolu vardir.
          a) try-catch block kullanma ve exception olussa bile calismayi devam ettirme
          b) throw exception kullanarak calismayi durdurma (mesela yazdigimiz kod geregi bir dosya uzerinden okuma yapmamiz gerekiyor ise bu dosyamiz
          eger silinmis ise java dosyayi bulamaz ve uygulamanin devam etmesi gerekmez.
       3)Eger exception'ı handle etmez ise (sorunu halletmezsek) java calismaayi durdurur.
       4)try-catch kullanirken try kodunu bir ya da birden fazla catch ile birlikte kullanabiliriz.
       5)try-catch olmaksizin yalniz kullanilamaz.
       6)Eger yazmis oldugunuz herhangi bir kod satirinda problem olabileciğini dusunuyorsaniz try-catch block icine koymalisiniz.
       7)catch block paraantezi icerisine olmasi muhtemel exception class ismi yazilir.
       8)e.getmessage(), methodunu kullanarak teknik mesajlar elde edebiliriz.
         System.out.println(); burada yazmis oldugum mesajlar benim teknik olmayan aciklamalarimdir.
         e.printStackTrace(); methodu Expection ile ilgili detaylica teknik mesaaj verir. Kod calismaya devam eder
         System.err.println(); hata mesajini renkli olarak verir bu sayede consolda diger mesaajlardan ayirmak icin kullaniriz.
         9)Eger try body icindeki kod orunsuz calisirsa catch blok devreye girmez.


     */
    //1.Yol tavsiye edilmez.
    public static void main(String[] args) {

  //      divide(6,2);
  //      divide(0,2);
  //      divide(6,0);//Matematikte bir sayi 0 ile bölünemez


    }
    public void divide(int a, int b){
        if(b==0){
            System.out.println("Bir sayi 0 ile bolunemez");
    }else {
            System.out.println(a/b);
        }
    }

//    public static void divide2(int a, int b){
//
//        try{
//            System.out.println(a/b);
//        }catch (ArithmeticException e){
//            System.out.println("Bolme isleminde bir problem olustu");
//
//        }

        //2. Yol try-catch kullanarak exception'ı handle etmek tavsiye edilir.
        public static void divide2(int a, int b){

            try{
                System.out.println(a/b);
                System.out.println("hi exception");
                System.out.println("bye exception");

            }catch (ArithmeticException e){
                System.out.println("Bolme isleminde bir problem olustu");
            }
        //java matematik ile ilgili karsılasması muhtemel tum istisnalari, hatalari ArithmeticExpection class'ina koymustur.
        //Matematikteki tüm istisnalari detaylari bilmek zorunda degiliz



    }
}
