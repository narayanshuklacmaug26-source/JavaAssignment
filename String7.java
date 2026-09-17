package Assignment4;

public class String7 {

    public static void main(String[] args) {

        String str= "The quick brown fox jumps";
        System.out.println("The Given string is "+str);

        for(int i=str.length()-1; i>=0; i--){
            char ch = str.charAt(i);
            System.out.print(ch);
        }



    }
}
