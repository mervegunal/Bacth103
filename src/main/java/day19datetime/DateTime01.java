package day19datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DateTime01 {

    public static void main(String[] args) {
        //Example 1: "Anlik tarihi"(Current Date) ekrana yazdiriniz

        LocalDate currentDate = LocalDate.now();

        System.out.println(currentDate);// 2022-10-21

        //Example 2: "Anlik zamani" (Current Time) ekrana yazdiran kodu yaziniz

        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime); //13:42:32.032258

        //Example 3: "Anlik tarihi (Current Date) ve "Anlik zamani"(Current Time) ekrana yazdiran kodu yaziniz
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime); //2022-10-21T13:46:19.435213

        //Example 4: Japonyadaki Anlik tarihi(Current Date) ve "Anlik zamani"(Current Time) ekrana yazdiran kodu bulunuz
        LocalDateTime currentDateTimeInJapan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentDateTimeInJapan); //2022-10-22T02:52:04.180120100

        //Example 5: Istanbuldaki Anlik tarihi(Current Date) ve anlik zamani(Current Time) ekrana yazdiran kodu yaziniz
        LocalDateTime currentDateTimeIstanbul = LocalDateTime.now(ZoneId.of("Europe/Istanbul"));
        System.out.println(currentDateTimeIstanbul); //2022-10-21T20:54:09.843004200

        //Example 6: Bugünden 789 gun sona emekli olacaginiza gore, emeklilik harihini hesaplayan kodu yaziniz.
        LocalDate countDate = LocalDate.of(2022,10,21);
        LocalDate retireDate = countDate.plusDays(789);
        System.out.println(retireDate); //2024-12-18

        //Example 7: Iki cocugunuzun dogum tarihkleri arasindaki farki gun olarak hesaplayan kodu yaziniz
        LocalDate dobAli = LocalDate.of(2005,5, 17);
        LocalDate dobVeli = LocalDate.of(2013,2,8);

        //between(dobAli, dobVeli) methodu kullanildiginda daha eski olan tarih once yazilmalidir
        Long diff = ChronoUnit.DAYS.between(dobAli, dobVeli);
        System.out.println(diff); //2824

        //Example 8: Istanbulun fethi ile, cumhuriyetin kurulması arasında kac ay oldugunu gosteren kodu yaziniz
        //           29 Mayis 1453 ==> Istanbulun fethi            29 Ekim 1923 ==> Cumhuriyetin kurulusu
        LocalDate istanbulunFethi = LocalDate.of(1453,5,29);
        LocalDate cumhuriyetKurulus = LocalDate.of(1923,10,29);

        Long aySayisi = ChronoUnit.MONTHS.between(istanbulunFethi, cumhuriyetKurulus);
        System.out.println(aySayisi);// 5645

        //Example 9: Verilen tarihin hangi burcta oldugunu gosteren kodu yaziniz
        LocalDate myDate = LocalDate.of(1989,4,13);


        //1.Yol:
        int day = myDate.getDayOfMonth();
        int month = myDate.getMonthValue();

        if(day>=21 && month==3){
            System.out.println("Koc");
        }else if(day<=20 && month==4){
            System.out.println("Koc");
        }else if(day>=21 && month==4){
            System.out.println("Boga");
        }else if(day<=20 && month==5){
            System.out.println("Boga");
        }
        //2.Yol:
        if((day>=21 && month==3) || (day<=20 && month==4) ){
            System.out.println("Koc");
        }else if((day>=21 && month==4) || (day<=20 && month==5)){
            System.out.println("Boga");
        }


    }











    }

