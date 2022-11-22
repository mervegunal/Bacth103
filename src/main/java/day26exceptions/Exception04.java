package day26exceptions;

public class Exception04 {

    public static void main(String[] args) {

        printAge(-25);

    }
    //Yas'i ekrana yazdiran bir method olusturunuz.
   public static void printAge(int age){

      if(age>0 || age>200) {
           throw new IllegalArgumentException("Yas negatif olamaz veya 200 den buyuk");

        }
        System.out.println(age);
     }




}
