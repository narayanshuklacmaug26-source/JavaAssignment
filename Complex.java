package Assignment1;

import java.util.Scanner;

public class Complex {

    int real;
    int imaginary;

    public Complex(double real, double imag){
        this.real= (int) real;
        this.imaginary= (int) imag;

    }


    void sum(Complex c){
        double r = this.real + c.real;
        double i = this.imaginary+c.imaginary;
        System.out.println("Sum "+r+" + "+i+" i ");
    }


   void difference(Complex c){
        double r = this.real - c.real;
        double i = this.imaginary - c.imaginary;
       System.out.println("Difference = " + r + " + " + i + "i");
   }

   void product(Complex c){
        double r = (this.real * c.real)-(this.imaginary*c.imaginary);
        double i =(this.real * c.imaginary)+(this.imaginary * c.real);
       System.out.println("Product = " + r + " + " + i + "i");
   }





    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        // First complex number
        System.out.print("Enter real part of first number: ");
        double r1 = sc.nextDouble();

        System.out.print("Enter imaginary part of first number: ");
        double i1 = sc.nextDouble();

        // Second complex number
        System.out.print("Enter real part of second number: ");
        double r2 = sc.nextDouble();

        System.out.print("Enter imaginary part of second number: ");
        double i2 = sc.nextDouble();

        Complex c1 = new Complex(r1, i1);
        Complex c2 = new Complex(r2, i2);

        c1.sum(c2);
        c1.difference(c2);
        c1.product(c2);


    }
}
