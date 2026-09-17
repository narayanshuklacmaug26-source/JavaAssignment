package Assignment4;

public class String5 {

    public static void main(String[] args) {

        String str="The quick brown fox jumps over the lazy dog.";
        System.out.println("Original String is: "+str);

        String newString = str.replaceAll("fox","cat");
        System.out.println("New String is: "+newString);


    }
}
