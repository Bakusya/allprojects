package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListClass1 {
    public static void main(String[] args) {
        // Array -> fixed size
        int [] nums = new int [2];
        nums[0] = 34;
        System.out.println(Arrays.toString(nums));
        ArrayListClass1 obj = new ArrayListClass1();
        obj.sum(12,45);

        // Syntax of ArrayList

        // generic

        ArrayList<String> list = new ArrayList<>();

        // non generic

        ArrayList nonGenericList = new ArrayList();

        // 1 StringBuilder
        StringBuilder sb = new StringBuilder(); // 16
        // 2 StringBuilder
        StringBuilder sb1 = new StringBuilder(20); // 20
        sb1.append("Welcome");
        System.out.println(sb1);
        // 3 StringBuilder
        StringBuilder sb2 = new StringBuilder(sb1);
        System.out.println(sb2);
        // 4 StringBuilder
        StringBuilder sb3 = new StringBuilder("World");


        // ArrayList always works only with objects(wrapper classes)

        // 1 ArrayList

        ArrayList<String> l1 = new ArrayList<>();

        // 2 ArrayList

        ArrayList<String> l2 = new ArrayList<>(120);

        // 3 ArrayList

        ArrayList<String> l3 = new ArrayList<>(l2);


        // add(String)

        ArrayList<String> l4 = new ArrayList<>();
        l4.add("Mike");
        l4.add("John");
        l4.add("Kim");
        System.out.println(l4); // [Mike, John, Kim]

        // add(index, String)

        l4.add(2, "William"); // [Mike, John, William, Kim]
        System.out.println(l4);
        ArrayList<String> l5 = new ArrayList<>();
        l5.add("Harry");
        System.out.println(l5); // [Harry]

        // addAll(Collection)
        // addAll(index, Collection)

        l5.addAll(0,l4);
        System.out.println(l5); // [[Mike, John, William, Kim, Harry]

        // remove()

        ArrayList<String> carsList = new ArrayList<>();
        carsList.add("BMW");
        carsList.add("Bugatti");
        carsList.add("Ferrari");
        carsList.add("MacLauren");
        carsList.add("Tesla");
        System.out.println(carsList);

        // remove(index)

        carsList.remove(0);
        System.out.println(carsList);

        // remove(object)

        carsList.remove("Ferrari");
        System.out.println(carsList);
        ArrayList<String> carsList2 = new ArrayList<>();
        carsList2.add("Subaru");
        carsList2.add("Bentley");
        carsList2.addAll(carsList);
        System.out.println(carsList2);

        // removeAll

        carsList2.removeAll(carsList);
        System.out.println(carsList2);

        // removeIf()

        carsList2.removeIf(str -> str.contains("Bentley"));
        System.out.println(carsList2);

        // clear()

        carsList2.add("Toyota");
        carsList2.add("Audi");
        carsList2.clear();
        System.out.println(carsList2);
        ArrayList<Integer> l6 = new ArrayList<>();
        ArrayList<String> flowers = new ArrayList<>();
        flowers.add("rose");
        flowers.add("tulip");
        flowers.add("orcid");

        // get()

        System.out.println(flowers.get(1));
        System.out.println(flowers.get(0));
        String str [] = {"one", "two"};
        System.out.println(str[1]);
        System.out.println("Length of array 'str': " + str.length);

        // set() --> change

        System.out.println(flowers); // [rose, tulip, orcid]
        flowers.set(2, "Frees");
        System.out.println(flowers); // [rose, tulip, Frees]

        // isEmpty() -> pusto li v obekte

        System.out.println(flowers.isEmpty()); // false
//        flowers.clear();
//        System.out.println(flowers.isEmpty()); // true


        // size() --> s, l, m, xxl

        System.out.println("Size of flower list: " + flowers.size());

        // equals()

        ArrayList<Character> listSymbols = new ArrayList<>();
        listSymbols.add('A'); // A
        System.out.println(listSymbols);
        ArrayList<Character> listSymbols2 = new ArrayList<>();
        listSymbols2.add('A');
        System.out.println(listSymbols2);
        System.out.println(listSymbols.equals(listSymbols2)); // true
        listSymbols2.add('B'); // A, B
        System.out.println(listSymbols.equals(listSymbols2)); // false

        // contains()

        ArrayList<String> sizeOfTShirt = new ArrayList<>();
        sizeOfTShirt.add("x");
        sizeOfTShirt.add("xs");
        sizeOfTShirt.add("m");
        System.out.println(sizeOfTShirt);
        System.out.println(sizeOfTShirt.contains("xs")); // true

        // containsAll()

        ArrayList<String> sizeOftShirt2 = new ArrayList<>();
        sizeOftShirt2.add("l");
        sizeOftShirt2.add("xxl");
        sizeOftShirt2.addAll(0,sizeOfTShirt);
        System.out.println(sizeOftShirt2);
        System.out.println(sizeOftShirt2.containsAll(sizeOfTShirt)); // true

        // sort() in Arrays

        int [] numbers = {3, 9, 0, 1};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        // sort() in ArrayList

        ArrayList<Double> priceList = new ArrayList<>();
        priceList.add(50.45);
        priceList.add(90.5);
        priceList.add(67.34);
        System.out.println("Before sorting: " + priceList);
        Collections.sort(priceList);
        System.out.println("After sorting" + priceList);

        // Difference

        //Arrays   --> fixed size,      primitive data types
        //ArrayList -> flexible size,   wrapper classes
    }
    public void sum(int num, int num2){
        int result = num + num2;
        System.out.println(result);
    }
}

