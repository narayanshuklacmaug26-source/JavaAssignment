package Assignment4;

public class String2 {

    public static void main(String[] args) {

        String s1= "This is Exercise 2";
        String s2= "This is Exercise 1";

        System.out.println("String 1: "+s1);
        System.out.println("String 2: "+s2);

        int result = s1.compareTo(s2);

        if(result<0){
            System.out.println("First String is smaller ");
        }
        else if (result>0){
            System.out.println("First String is greater ");

        }
        else{
            System.out.println("Both string are equals ");
        }

    }
}
