package oopPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainCar {
    public static void main(String[] args) {

        Toyota toyota = new Toyota("Toyota","Camry", 2019,10000);
        System.out.println(toyota);

        BMW bmw = new BMW("BMW", "X6",2016,15000);
        System.out.println(bmw);

        Mersedec merc = new Mersedec("Mercedes", "SClass",2015,18000);
        System.out.println(merc);

        MercedesBenzG amg = new MercedesBenzG("Mers", "G - Class", 2010,30000);
        amg.setAmg("AMG");
        System.out.println(amg);


        List <Mersedec> list1 = new ArrayList<>(Arrays.asList(merc));
        list1.add(amg);
        System.out.println(list1);

        List<BMW> list2 = new ArrayList<>(Arrays.asList(bmw));
        System.out.println(list2);

        List <Toyota> list3 = new ArrayList<>(Arrays.asList(toyota));
        System.out.println(list3);



    }
}
