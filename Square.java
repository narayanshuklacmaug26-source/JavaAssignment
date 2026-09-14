package Assignment2;

public class Square extends Rectangle {

     private int side;



    Square(int side ){
        super(side, side);
        this.side=side;

    }


    @Override
    public void printArea(){
        int area =  side*side;
        System.out.println("Area of square "+area);
    }

    @Override
    public void printPerimeter(){
        int perimeter = 4 * side;
        System.out.println("Perimeter of square "+perimeter);
    }




}
