package AssignmentCollectionFramework;

import java.util.TreeSet;

public class TreeSet1 {

    public static void main(String[] args) {

        TreeSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(15);
        set.add(20);
        set.add(25);
        set.add(30);

        int element = 50;
        Integer result  = set.ceiling(element);

        System.out.println("TreeSet is : "+set);
        System.out.println("Given element is "+element);
        System.out.println("Ceiling element is  "+result);



    }
}
