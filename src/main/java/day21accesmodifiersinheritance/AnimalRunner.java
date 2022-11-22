package day21accesmodifiersinheritance;

public class AnimalRunner {
    /*
    1)"Inheritance" sayesinde
        i)Code tekrarlarından kurtuluruz.
        ii)Code tamiri(maintenance) kolay olur.
        iii)Child Class'ları daha atomik yapmış oluruz.

    2)Bir Class'ı başka bir class'ın Child Class'ı yapmak için
      "extends" keyword kullanılır. ilk yazılan Class Child, ikinci
      yazılan Class parent olur.

    3)Child Class object'leri Parent Class'dan method ve variable'ları kullanabilirler.

    4)Parent Class object'leri Child Class'dan methodv e variable'ları kullanamazlar

    5)Object Class her Class'ın Parent'ıdır.
        Java'da Object Class hariç her class'ın parent'ı vardır
        Java'da parent'ı olmayan tek class Object Class'dır.

    6)"private" method ve variable'lar Child Class'lar tarafindan kullanilamaz.
     "protected" method ve variable'lar Child Class'lar tarafindan kullanilabilir.
          "default" method ve variable'lar ayni package'deki Child Class'lar tarafindan kullanilabilir.
          "public" method ve variable'lar Child Class'lar tarafindan kullanilabilir.
          Note: "Child Class'lar tarafindan kullanilabilir" olmak "inherit edilebilir" demektir.

    7) 4 tip inheritance vardir
            i)Multilevel Inheritance: Java bunu kabul eder
            ii)Hierarchical Inheritance: Bir parent icin coklu child, Java bunu kabul eder
            iii)Multiple Inheritance: Bir Child'a coklu Parent, Java bunu desteklemez.(Java does not support Multiple Inheritance)
            iv)Single Inheritance: Bir Child Class icin bir Parent Class demektir, Java bunu destekler
    */

    public static void main(String[] args) {

        Cat c1 = new Cat();

        c1.eat();
        c1.drink();
        c1.meow();

        Dog d1 = new Dog();
        d1.bark();
        d1.eat();
        d1.drink();
    }
}
