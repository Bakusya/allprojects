package set;

import java.util.*;

public class SetClass1 {
    public static void main(String[] args) {
        HashSet<Integer> s1 = new HashSet<>();
        s1.add(15);
        s1.add(89);
        s1.add(56);
        s1.add(100);
        System.out.println("Set order: " + s1);
        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(15);
        al1.add(89);
        al1.add(56);
        System.out.println("AL order: " + al1);
        List<Integer> duplicateNumbers = new ArrayList<>(Arrays.asList(12,45,6,7,7,7,9,0,0,12));
        System.out.println("ArrayList: " + duplicateNumbers);

        // HasSet --> remove all duplicates, and shows unpredictable order

        Set<Integer> withoutDuplicateNums = new HashSet<>(Arrays.asList(12,200,45,6,7,7,7,9,0,0,12));
        System.out.println("HashSet: " + withoutDuplicateNums);

        // LinkedHashSet --> remove all duplicates, as show in bellow

        Set<Integer> linkedHashSetNums = new LinkedHashSet<>(Arrays.asList(12,45,6,7,7,7,9,0,0,12));
        System.out.println("LinkedHashSet: " + linkedHashSetNums);

        // TreeSet --> remove all duplicates and sorted all elements

        Set<Integer> treeSetNums = new TreeSet<>(Arrays.asList(12,200,45,6,7,7,7,9,0,0,12));
        System.out.println("TreeSet: " + treeSetNums);

        // add(), addAll()

        Set<String> countries = new HashSet<>();
        countries.add("UAE");
        countries.add("USA");
        countries.add("UK");
        System.out.println(countries);
        Set<String> countries2 = new HashSet<>();
        countries2.add("China");
        countries2.add("Japan");
        countries2.add("Korea");
        countries2.addAll(countries); // [USA, UK, UAE]
        System.out.println(countries2); // [USA, China, Japan, UK, UAE, Korea]


        // remove(), removeAll()

        System.out.println(countries2.remove("China")); // true
        System.out.println(countries2); // [USA, Japan, UK, UAE, Korea]
        System.out.println(countries2.removeAll(countries)); // true
        System.out.println(countries2);  // [Japan, Korea]

        // isEmpty()

        System.out.println(countries); // [USA, UK, UAE]
        System.out.println(countries2); // [Japan, Korea]
        System.out.println(countries.isEmpty()); // false


        // clear()

        countries2.clear();
        System.out.println(countries2);  // []

        // size()

        System.out.println(countries2.size()); // 0

        // contains(), containsAll()

        System.out.println(countries);
        System.out.println(countries2);
        System.out.println(countries2.contains("Japan")); // false
        System.out.println(countries2.containsAll(countries)); // false

        // retainAll()

        Set<String> names = new LinkedHashSet<>(Arrays.asList("James", "David", "Nick", "Bred", "Bred", "Alex"));
        Set<String> names2 = new LinkedHashSet<>(Arrays.asList("John"));
//        System.out.println("names: " + names); // [James, David, Nick, Bred, Alex]
//        System.out.println("names2: " + names2); // [John]
//
//        System.out.println("names2 retainAll in names2: " + names.retainAll(names2)); // true
//        System.out.println(names); // []
        System.out.println("+++++++++++++++++++++");

        // iterator()

        Set<String> name3 = new HashSet<>();
        name3.add("Julia");
        name3.add("Kate");
        name3.add("Rose");
        Iterator<String> itr1 = names.iterator();
        while (itr1.hasNext()){
            System.out.println("YEEEEEEEAAAPP : " + itr1.next());
        }

        // for each loop

        for (String i : name3) {
            System.out.println("mame3 with for each loop " + i);
        }
        System.out.println("______________________");
        for (String a : names) {
            System.out.println("Names with for each loop: + " + a);
        }
        System.out.println("========================");


        Set<Integer> nums = new HashSet<>(Arrays.asList(12,90,35));
        Iterator<Integer> itr = nums.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        for (Integer n : nums) {
            System.out.println(n);
        }
        Set setName = new HashSet();
        setName.add("Alex");
        setName.add(2021);
        setName.add('K');
        setName.add(23.98);
        System.out.println(setName);

    }
}
