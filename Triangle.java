package Assignment1;

public class Triangle {

    int side1;
    int side2;
    int side3;


    public Triangle(int a, int b, int c){
        this.side1=a;
        this.side2=b;
        this.side3=c;

    }

    public void perimeter(){
        int p = side1+side2+side3;
        System.out.println(" Perimeter "+p);
    }

    public void area(){
        float area = (1/2)*side1*side2;
        System.out.println("Area is "+area);
    }


    public static void main(String[] args) {

        Triangle t = new Triangle(2,4,6);
        t.perimeter();
        t.area();

    }
}
