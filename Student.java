package Assignment1;

public class Student {

    String name;
    int roll_no;
    String phone_no;
    String address;

    public Student( String name,int rollno){
        this.roll_no= rollno;
        this.name=name;
    }

    public Student(String name,int roll, String phone, String address){
        this.name= name;
        this.roll_no= roll;
        this.phone_no= phone;
        this.address= address;

    }


    void displayInfo(){
        System.out.println("Name is "+name);
        System.out.println("Roll number is "+roll_no);
        System.out.println("Phone number is "+phone_no);
        System.out.println("Address is "+address);

    }


    public static void main(String[] args) {

        Student s = new Student("Jhon",2);
        s.displayInfo();

        Student s1 = new Student("Sam",123,"6736246232","Princeton");
        s1.displayInfo();

    }

}


