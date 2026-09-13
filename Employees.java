package Assignment1;

public class Employees {

    double salary;
    int hour;


    public void getInfo(int sal, int hoursPerDay){
        this.salary= sal;
        this.hour= hoursPerDay;
    }


    public void addSal(){
        if(salary<500){
            salary= salary+10;
        }
    }


    public void addWorks(){
        if(hour>6){
            salary=salary+5;
        }
    }



    public void printSalary(){
        System.out.println("Print Final Salary "+salary);
    }


    public static void main(String[] args) {


        Employees e = new Employees();
        e.getInfo(100, 5);
        e.addSal();
        e.addWorks();
        e.printSalary();


    }
}
