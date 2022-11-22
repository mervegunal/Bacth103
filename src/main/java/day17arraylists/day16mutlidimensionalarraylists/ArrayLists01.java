package day17arraylists.day16mutlidimensionalarraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {

    /*
    ArrayListler ayni data tipine sahip birden fazla datayi depolamak icin kullanilir.
    Array ile ArrayListin farki nedir?
    1)Array olstururken Arrayin icine kac tane eleman koyamamiz gerektigini soylemeliyiz, soyledigimiz eleman sayisindan fazla eleman koyamayiz.
      Array'ler eleman sayisinda "fixed" dirler.
      ArrayList'leri olstururken eleman sayisi soylemeye gerek yok, cunku ArrayListler eleman sayisinda "flexible"(esnek) dirlar.
    2)Array'lerin icine "primitive" ve "reference"lar konabilir.
      ArrayListlerin icine ise sadece "non-primitve"ler konulur.
    3)Arrayler super fast, cok hizli. Arrayler memory i cok az kullanir.
    Note: Eleman sayisi kesin belli olan coklu datalari depolamak icin Array kullaniriz,
    fakat eleman sayisi degisken olan coklu datalar icin Array kullanma riskini almayin!

     */

    public static void main(String[] args) {

        //arrayList nasil olusturulur?
        ArrayList<Integer> ages = new ArrayList<Integer>();
        //2.Yol
        ArrayList<Integer> heights = new ArrayList<>();
        //3.Yol
        List<Integer> nums = new ArrayList<>();

        //ArrayList'ler nasil yazdirilir?
        System.out.println(nums); //[]

        //ArrayList'lere nasil eleman eklenir?
        //add() her zaman elemani en sona ekler. (insertion order)
        nums.add(21);
        nums.add(18);
        nums.add(20);
        System.out.println(nums); //[21, 18, 20]

        nums.add(1,50);
        System.out.println(nums);// [21, 50, 18, 20]

        List<Integer> prices = new ArrayList<>();
        prices.add(23);
        prices.add(185);

        nums.addAll(prices);
        System.out.println(nums); // [21, 50, 18, 20, 23, 185]
        System.out.println(prices); // [23, 185]

        nums.addAll(2, prices);
        System.out.println(nums); // [21,50, 23, 185 ,20, 23, 185]

        //ArrayListlerin eleman sayisi nasil bulunur?
        int elemanSayisi = nums.size();
        System.out.println(elemanSayisi); //8

        //ArrayList'lerde herhangi bir eleman nasil secilir?
        //get() methodu istenen bir index'teki elemani verir.(onemli)***
        int el1 = nums.get(3);
        System.out.println(el1); //185

        //ArrayListin bos olup olmadigini nasil anlariz?
        boolean bos1 = nums.isEmpty();
        System.out.println(bos1); //false

        boolean bos2 = ages.isEmpty();
        System.out.println(bos2); //true

        //ArrayList'de bir eleman nasil degistirilir?
        nums.set(3, 200);
        System.out.println(nums); // [21, 50, 23, 200, 18, 20, 23, 185]

        //Example 1: nums ArrayList'indeki tum tek sayilari 11 artirdiktan sonra ekrana yazdiriniz.

        for (int w : nums){
            if (w%2!=0){
                nums.set(nums.indexOf(w),w+11);

            }
        }
        System.out.println(nums); //[32, 50, 34, 200, 18, 20, 34, 196]


        //remove() methodunun icine tamsayi koyarsaniz Java onu index olarak kabul eder
        //Example 2: ArrayList'den 200 elemaninin ilk gorunumunu siliniz
        //Note: Tum tamsayilar Java icin aksi söylenmedikce primitive dir yani "int"dir
        //Note 2: "pirimitive"ler ArrayListlerin elemani olamazlar.
        //Note 3: "primitive"i "Wrapper Class"a cevirirseniz, non-primitive olur ve non-primitive ler Arraylerin elemani olur index olamaz

        Integer sayi = 34;
        nums.remove(sayi);
        System.out.println(nums); // [32, 50, 18, 20, 34, 196]
















    }
}
