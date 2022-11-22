package day32maps;

import java.util.Hashtable;

public class HashTable01 {

    /*

    1)HashTable bir map'dir.
    2)HashTable entrySet'leri herhangi bir siralamaya tabi tutmaz.
    3)HashTable, HashMap'lerden daha yavastir. Cunku HashTable'lar thread-safe ve synchronized'dir.
    4)HashTable'larda key null olamaz. Key'i null yaparsaniz NullPointerException atar.
    5)HashTable'larda value null olmaz. Value'yu null yaparsaniz NullPointerException atar.

    Note: toString() method'u obje'leri console'da detaylari ile gorebilmek icin class'ların icinde olusturulur.
      toString() method'unu olusturmadan object'i console'a yazdırırsanız Java o object'in adresini yazdırır.


     */

    public static void main(String[] args) {

        Hashtable<String, Integer> countryPopulations = new Hashtable<>();
        countryPopulations.put("USA",400000000);
        countryPopulations.put("Germany", 83000000);
        countryPopulations.put("Turkey", 90000000);
        System.out.println(countryPopulations); //

      //  countryPopulations.put(null, 9000000);
      //  countryPopulations.put("France", null);

        Hashtable<String, Students> myStudents = new Hashtable<>();
        myStudents.put("Math", new Students("Tom Hanks", "th@gmail.com",21, true ));
        System.out.println(myStudents);

        String name = myStudents.get("Math").name;
        System.out.println(name);

        int age = myStudents.get("Math").age;
        System.out.println(age);


    }
}
