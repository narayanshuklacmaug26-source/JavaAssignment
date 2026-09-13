package Assignment1;

public class Rectangle {

    int length;
    int breadth;

    public Rectangle(int len , int br){
        this.length= len;
        this.breadth= br;

    }

    public void ares(){
        int a =  length*breadth;
        System.out.println("Area is "+a);
    }


    public static void main(String[] args) {

        Rectangle r = new Rectangle(4,5);
        r.ares();
        Rectangle r1 = new Rectangle(5,8);
        r1.ares();




    }
}
