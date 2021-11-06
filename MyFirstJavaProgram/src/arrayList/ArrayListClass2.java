package arrayList;

import java.util.*;

public class ArrayListClass2 {
    public static void main(String[] args) {
        int nums [] = {2,7,0,12,1};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        ArrayList<Integer> al = new ArrayList<>();
        al.add(12);
        al.add(45);
        al.add(0);
        al.add(100);
        al.add(6);
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
        al.set(0, 1);
        System.out.println(al);
        al.add(1, 50);
        System.out.println(al);
        ArrayList<Integer> al2 = new ArrayList<>();
        al2.add(90);
        al2.add(80);
        System.out.println(al2);
        al2.addAll(0, al);
        System.out.println(al2);
        System.out.println(al.equals(al2)); // false
        System.out.println(al2.contains(90)); // true
        System.out.println(al.containsAll(al2)); // false
        System.out.println(al.isEmpty()); // false
        System.out.println(al2.size());
        System.out.println(al2.remove(5)); // 100
        System.out.println(al2);
        System.out.println(al2.removeAll(al)); // true
        System.out.println(al2); // 90, 80
        System.out.println(al2.remove(1));
        System.out.println(al2);
        ArrayList<String> strList = new ArrayList<>();
        strList.add("1");
        strList.add("80");
        strList.add("90");
        System.out.println(strList.remove(0));
        System.out.println(strList.remove("80"));
        System.out.println(strList);
        al2.clear();
        System.out.println(al2);
        System.out.println(strList.get(0));
        strList.removeIf(num -> num.contains("90"));
        System.out.println(strList);
        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(12);
        nums1.add(0);
        nums1.add(56);
        Collections.sort(nums1);
        // for loop
//        for (int i = 0; i <= nums1.size(); i++){
//
//                System.out.println(nums1.remove(0));
//
////            System.out.print(nums1.get(i) + " ");
//
//        }
        for ( Integer i : nums1) {
            System.out.println(i + ", ");
        }
        System.out.println("_________________________");

        // iterator()

        Iterator<Integer> itr = nums1.iterator();
        while (itr.hasNext()){ // 0 <= 3
            Integer i = itr.next();
            if (i == 56){
                itr.remove();
            }
        }
        System.out.println(nums1);

        // Converting between array and list

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("MacBook");
        list1.add("Mouse");
        list1.add("Speaker");
        list1.add("headphone");

        // Converting list to array
        // 1 way
        Object[] objArray = list1.toArray();
        System.out.println(Arrays.toString(objArray));
        //2 way
        String [] strArray = list1.toArray(new String[0]);
        System.out.println(Arrays.toString(strArray));
        // 3 way                            4
        String [] strArray2 = new String[list1.size()];  // String [] strArray2 = new String[4]
//        strArray2[0] = "Monitor";
        strArray2 = list1.toArray(strArray2);
        for (String str : strArray2){
            System.out.println(str + " ");
        }
        // Converting array to list
        String[] book = {"pages", "name"};
        List<String> listOfBook = Arrays.asList(book);
        System.out.println(listOfBook.size());
        ArrayList<String> str3 = new ArrayList<>();
        str3.add("Hello");
        List<String> str4 = new ArrayList<>();
        str4.add("World");
        System.out.println(str3.get(0) +" " + str4.get(0) + "!");
        String str = "Flower";
    }
}
