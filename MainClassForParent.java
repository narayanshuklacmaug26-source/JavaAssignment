package Assignment2;

public class MainClassForParent {

    public static void main(String[] args) {

        GrandParent gp = new GrandParent();
        gp.show();

        Parent p = new Parent();
        p.show();

        GrandParent gp1= new Parent();
        gp1.show();






    }
}
