package Assignment2;

public class Rectangle {

    private final int length;
    private final int breadth;


    Rectangle(int length, int breadth){
        this.length= length;
        this.breadth= breadth;
    }

    public void printArea(){
        int area = length*breadth;
        System.out.println("Area of Rectangle is "+area);
    }


    public void  printPerimeter(){
        int perimeter = 2*(length+breadth);
        System.out.println("Perimeter of Rectangle is "+perimeter);

    }



}
