package day32maps;

import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMap01 {

/*
        1)TreeMap'ler entrySet'leri key'lere gore "natural order" da siralar.
        2)TreeMap'ler en yavas map'lerdir.
        3)TreeMap'ler thread-safe ve syncronized degildir.
     */

    public static void main(String[] args) {

        TreeMap<String, Double> salaries = new TreeMap<>();
        salaries.put("Tom Hanks", 3000.00);
        salaries.put("Mary Star", 1000.00);
        salaries.put("Jimmy Jones", 5000.00);
        salaries.put("Kevin Bridgeman", 6000.00);

        System.out.println(salaries);// {Jimmy Jones=5000.0, Kevin Bridgeman=6000.0, Mary Star=1000.0, Tom Hanks=3000.0}

        //tailMap() verilen key'den baslayaarak son kadar tum entr'leri size verir.
        SortedMap<String, Double> map1 = salaries.tailMap("Kevin Bridgeman");
        System.out.println(map1);

        NavigableMap<String, Double> map2 = salaries.tailMap("Kevin Bridgeman", false);
        System.out.println(map2);

        NavigableMap<String, Double> map3 = salaries.subMap("Kevin Bridgeman", true, "Tom Hanks", false);
        System.out.println(map3);

        Map.Entry<String, Double map4>salaries.lowerEntry("Mary Star");
        System.out.println(map4);




    }
}

