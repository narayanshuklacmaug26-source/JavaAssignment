package AssignmentCollectionFramework;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet2 {

    public static void main(String[] args) {

        TreeSet<String> set1 = new TreeSet<>();
        set1.add("Red");
        set1.add("Orange");
        set1.add("Black");
        set1.add("White");
        set1.add("Green");
        set1.add("Blue");
        set1.add("Yellow");
        System.out.println(set1);

       //1 Here i traverse through iterator
        Iterator iterator = set1.iterator();
        while(iterator.hasNext()){
           System.out.print(iterator.next()+" " );
        }


        // Here i traverse through iterator
        Iterator iterator1 = set1.iterator();
        while(iterator1.hasNext()){
            String data =  (String)iterator1.next();
            System.out.println(data+" ");
        }


        // here i copy one treeSet to another treeSet
        TreeSet<String> set2 = new TreeSet<>();
        set2.addAll(set1);
        System.out.println("Set 1: "+set1);
        System.out.println("Set 2: "+set2);


        //Here i reverse the set
        System.out.println("Before reverse the set"+set1);
        System.out.println("After reverse the set"+set1.descendingSet());



        //here i get The first element in treeSet
        System.out.println(set1.getFirst());


        //



    }
}
