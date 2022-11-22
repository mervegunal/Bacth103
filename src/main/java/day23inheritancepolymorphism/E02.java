package day23inheritancepolymorphism;

public class E02 {
    public static void main(String[] args) {
       String arr [] = {"Ali", "Can","Veli","Han"} ;

       getElementFromArray(arr,2);//Veli
       getElementFromArray(arr,0);//Ali
       getElementFromArray(arr,4);//Ali
    }



    //Bir String Array'den index girerek elemaan elde edebilmek icin bir method olusturun
    public static void getElementFromArray(String arr[], int idx){
        System.out.println(arr[idx]);

    }
}
