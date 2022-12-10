package day32maps;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterators02 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Z");
        myList.add("K");
        myList.add("A");
        myList.add("J");
        myList.add("M");

        //Example 1: Iterators kullanarak List elemanlarini tersten console'a yazdiriniz.
        ListIterator<String> itr = myList.listIterator();

        //hasNext() method!u pointer dan sonra eleman varsa "true", yoksa "false" return eder.
        //next()method'u pointer'i bir sonraki elemanin onune koyar ve ustunden atladigi elemani return eder.

        while(itr.hasNext()){

            itr.next();
        }

        // hasPrevious() methodu, pointer'dan önce eleman varsa true, yoksa false return eder.
        // hasNext() methodu, pointer'ı bir önceki elemanın sonuna koyar ve üstünden atladığı elemanı return eder.

        while(itr.hasPrevious()){
            String el = itr.previous();

            System.out.print(el + "");
        }

        //Example 2: List'deki tum elemanlari siliniz.
        while(itr.hasNext()){
            itr.next();
            itr.remove();
        }
    }
}
