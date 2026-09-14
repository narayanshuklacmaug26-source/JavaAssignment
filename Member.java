package Assignment2;

import java.util.Scanner;

public class Member {


    private String name;
    private int age;
    private String phoneNumber;
    private String address;
    private double salary;




    Member(String name, int age, String phoneNumber, String address, double salary){
        this.name=name;
        this.age=age;
        this.phoneNumber= phoneNumber;
        this.address= address;
        this.salary= salary;
    }




     public void setName(String name){
        this.name = name;
     }

     public void setAge(int age){
        this.age=age;
     }

     public void setPhoneNumber(String phoneNumber){
        this.phoneNumber=phoneNumber;
     }

     public void setAddress(String address) {
         this.address = address;
     }

     public void setSalary(double salary){
        this.salary=salary;
     }

     public String getName(){
        return name;
     }

     public int getAge(){
        return age;
     }

     public String getPhoneNumber(){
        return phoneNumber;

     }

     public String getAddress(){
        return address;
     }

    public double getSalary(){
        return salary;
    }






    void display(){
        System.out.println("Name is "+name);
        System.out.println("Age is "+age);
        System.out.println("Phone Number is "+phoneNumber);
        System.out.println("Address is "+address);
        System.out.println("Salary is "+salary);
    }



    public void printSalary(double n){
        System.out.println("Salary is "+n);

    }



}
