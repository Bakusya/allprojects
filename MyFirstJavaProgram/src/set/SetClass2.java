package set;

import java.util.*;

public class SetClass2 {
    public static void main(String[] args) {
        Set<Integer> h = new HashSet<>(Arrays.asList(1,2,3,4,5));
        System.out.println(h);
        h.add(6);
        h.add(7);
        h.add(8);
        h.add(9);
        h.add(10);
        System.out.println(h);
        System.out.println(h.isEmpty());
        h.remove(10);
        System.out.println(h);
        for (Integer a : h) {
            System.out.println(a);
        }
        Iterator<Integer> itr = h.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next() + " ");
        }
        System.out.println();
        for (int i = 0; i < h.size(); i++){
            System.out.print(i + " ");
        }
        System.out.println();
        Set<Character> symbols = new LinkedHashSet<>(Arrays.asList('W', 'T', 'Y', 'C'));
        for (int i = 0; i < symbols.size(); i++){
            System.out.println(i);
        }
        List<Character> symbols2 = new ArrayList<>();
        symbols2.addAll(symbols);
        System.out.println(symbols2);
        for (int i = 0; i < symbols2.size(); i++){
            System.out.println(symbols2.get(i));
        }
        System.out.println(symbols2.get(0));
        Set<String> colors = new HashSet<>(Arrays.asList("Yellow", "Black", "Purple", "Pink", "Green", "Red"));
        System.out.println(colors);
        Set<String> colors2 = new LinkedHashSet<>(colors);
        System.out.println(colors2);
        Set<String> colors3 = new TreeSet<>(colors2);
        System.out.println(colors3);
        List<String> actors = new ArrayList<>(Arrays.asList("Will Smith", "*", "Will Smith", "}", "Leonardo Dicaprio", "09", "Bred Pitt", "Tom Hardy"));
        System.out.println("AL actors: " + actors);
        Set<String> actors2 = new TreeSet<>(actors);
        System.out.println("Set actors: " + actors2);
        Set<Double> dNumbers = new LinkedHashSet<>();
        boolean bool1 = dNumbers.add(23.89); // true
        boolean bool2 = dNumbers.add(34.87); // true
        boolean bool3 = dNumbers.add(23.89); // false
        System.out.println(bool1 + "\n" + bool2 + "\n" + bool3);
        Set<Integer> set = new LinkedHashSet<>(Arrays.asList(1,2,3,4,5));
        Object [] obj = set.toArray();
        System.out.println(Arrays.toString(obj));
        List<Object> list = new ArrayList<>(Arrays.asList(obj));
        System.out.println(list.remove(0));
        System.out.println(list);

        ArrayList<String> inputList = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your last name");
        String lastName = scan.nextLine();

        if(lastName.endsWith("ov")) {

            System.out.println(inputList.add(lastName));
            System.out.println(inputList);
        }
        System.out.println();
    }
}
