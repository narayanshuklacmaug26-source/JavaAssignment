package Assignment1;

public class Employee {

    String name;
    int joining;
    int salary;
    String address;

   public  Employee(String name, int join , int sal, String add){
       this.name=name;
       this.joining= join;
       this.salary=sal;
       this.address=add;

   }

   public void show(){
       System.out.println("Name     "+" Year joining  "+"  Address");
       for(int i=0; i<3; i++) {
           System.out.println(name + "     " + joining + "        " + address);
       }

   }


    public static void main(String[] args) {

       Employee e = new Employee("Robert",1994,23000,"64C- WallsStreet");
       Employee e1 = new Employee("Sam",2000,23000,"68D-WallsStreet");
        Employee e2 = new Employee("jhon",1999,23000,"26B-WallsStreet");

       e.show();
       e1.show();
       e2.show();





    }


}
