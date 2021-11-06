import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ClassWork {
    public static void main(String[] args) {

        ArrayList <Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        System.out.println(al);
        al.set(1, 20);
        System.out.println(al);
        al.remove(3);
        System.out.println(al);
        System.out.println(al.isEmpty());
//        for (int i = 0 ; i < al.size(); i++){
//            System.out.print(i);
//        }
//        System.out.println("________________");
//
//        for (Integer x:al) {
//            System.out.print(x);
//        }
//
//        System.out.println();
//
//        Iterator <Integer> itr = al.iterator();
//        while (itr.hasNext()){
//            Integer y = itr.next();
//            if(y == 3){
//                itr.remove();
//            }
//
//            System.out.println(itr.next());
//        }
//
//        System.out.println();


        System.out.println(al + "__________");


        System.out.println(al.remove(0));
        System.out.println(al);
        System.out.println(al.remove(1));
        System.out.println(al);

        Integer num = al.get(0) / al.get(1);
        System.out.println(num);

        int num1 = al.get(0);
        int num2 = al.get(1);
        int sum = num1 / num2;
        System.out.println(sum);

        Object [] arr = al.toArray();
        System.out.println(Arrays.toString(arr));

        String [] str = {"London","Turkey", "Dubai"};
        List<String> str1 = Arrays.asList(str);
        System.out.println(str1);


        }








    }

