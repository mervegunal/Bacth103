package day15arraysmultidimensionalarrays.day22inheritancepolymorphism;

public class HondaAccord extends Honda{

    /*
    1)Siz Class olusturdugunuzda Java otomatik olarak size gorunmez bir constructor verir, cunku Java
    Class'in bir kalip oldugunu ve Object olusturmak icin yaratildigini ve object olusturmak icin consturctor'in sart oldugunu bilir.
    2)Java'nin otomatik olarak olusturdugu bu gorunmez consturctora "default constrouctor" denir.
    3)Siz kendiniz herhangi bir consturctor olusturdugunuzda Java "default constructor"i siler.
    4)Bir Class'da birden fazla constructor olabilir. Fakat bu constructorlarin parametreleri farkli olmalidir.
    5)"this" keyword "Bu Class anlamindadir. "this.price" demek bu Class'daki "price" isimli variable demektir.
    "this.price" syntax'i constructor'larin icinde kullanilir.
    6)Conctructor kullanarak variable'lar uzerinde yaptiginiz degisimler sadece Object uzerindeki variable'larin degerlerini degistirir.
    Class daki variable degerlerini degistiremez...


    */
    public int price;
    public int year;
    public String make;
    public String model;


    public HondaAccord(){

    }
    public HondaAccord(int price){

        this.price = price;
    }

    public HondaAccord(int price, int year){
        this.price = price;
        this.year = year;
        System.out.println("Honda Accord Constructor");
    }

    public HondaAccord(int price, int year, String Make, String Model){
        this.price = price;
        this.year = year;
        this.make = make;
        this.model = model;
    }

}
