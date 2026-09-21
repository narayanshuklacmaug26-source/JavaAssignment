package AssignmentCollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayList1 {

    public static void main(String[] args) {

        // 1. Create an ArrayList and add some colors
        ArrayList<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Orange");
        System.out.println(list);

        // 1 Here i print ArrayList.
        System.out.println("1. Original ArrayList: here i print ");
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            String data = (String)iterator.next();
            System.out.print(data+" ");
        }


         // 2 here I add element in first position.
        list.add(0,"Black");
        System.out.println("\n2. After inserting Black at first position:");
        System.out.print(list);


        // 3. Retrieve an element at a specified index
        String color = list.get(1);
        System.out.println("\n3. Element at index 2:");
        System.out.println(color);


        // 4. Insert an element at the specific position
        list.set(2,"Yellow");
        System.out.println("\n4. After updating element at index 2:");
        System.out.println(list);


        // 5. Remove the third element
        list.remove(2);
        System.out.println("\n5 .After removing the third element ");
        System.out.println(list);


        // 6. search for element
        String searchElement = "Green";
        System.out.println("\n6 Searching for "+searchElement+" : ");

        if(list.contains(searchElement)){
            System.out.println(searchElement+" this element is present in ArrayList");
        }
        else{
            System.out.println(searchElement+" this element is not present in ArrayList");
        }



        //  7. Sort ArrayList
        System.out.println("\n7 After Sorting the ArrayList ");
        Collections.sort(list);
        System.out.println(list);



        // 8.Copy ArrayList to another ArrayList
        System.out.println("\n8 After copying one ArrayList to another ArrayList");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("");
        list2.add("");
        list2.add("");
        list2.add("");
        Collections.copy(list2,list);
        System.out.println(list2);



        // 9.After the shuffle element in java
        System.out.println("\n9 After shuffle element in ArrayList ");
        System.out.println("Before Shuffle list "+list2);
        Collections.shuffle(list2);
        System.out.println("After Shuffle list "+list2);



        // 10. Modify the java program reverse ArrayList
        System.out.println("\n9 After reverse the element in ArrayList ");
        System.out.println("Before reverse the list "+list);
        Collections.reverse(list);
        System.out.println("After reverse the list "+list);









    }
}
