package Assignment2;

import java.util.Scanner;

public class MainClassForMember {

    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a name: ");
        String name = sc.nextLine();

        System.out.println("Enter a age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter a phone Number: ");
        String phoneNumber= sc.nextLine();

        System.out.println("Enter a address: ");
        String address= sc.nextLine();

        System.out.println("Enter a salary");
        double  salary = sc.nextDouble();


       // Member m = new Member(name,age,phoneNumber,address,salary);

        PrimeMember m = new PrimeMember(name,age, phoneNumber,address,salary);


        System.out.println("Enter a salary ");
        int n = sc.nextInt();
        m.printSalary(n);


        m.setName("Narayan");
        m.setAge(19);
        m.setAddress("Tari Bara Gaon");
        m.setSalary(123444);
        m.setPhoneNumber("968457495894");

        m.getName();
        m.getAge();
        m.getAddress();
        m.getSalary();
        m.getPhoneNumber();

        m.display();




    }
}
