package Assignment4;

public class String4 {

    public static void main(String[] args) {

        String str ="The quick brown fox jumps over the lazy dog.".toLowerCase();

        for(char ch='a'; ch<='z'; ch++){
            System.out.print(ch+" ");
        }
        System.out.println();

        for(char ch='a'; ch<='z'; ch++){
            System.out.print(str.indexOf(ch)+" ");
        }
        System.out.println();

        System.out.println("Sample string of all alphabet \""+str+"\"");
    }
}
