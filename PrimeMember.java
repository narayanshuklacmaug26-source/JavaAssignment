package Assignment2;

public class PrimeMember extends Member {

    private int joiningYear;
    private double joiningFee;
    private boolean isActive;



    PrimeMember(String name, int age, String phoneNumber, String address, double salary) {

        super(name, age, phoneNumber, address, salary);

        this.joiningYear= joiningYear;
        this.joiningFee= joiningFee;
        this.isActive= isActive;

    }



    public void setJoiningYear(int joiningYear){
        this.joiningYear= joiningYear;
    }

    public void setJoiningFee(double joiningFee){
        this.joiningFee= joiningFee;
    }

    public void  setActive(boolean isActive){
        this.isActive= isActive;
    }

    public int getJoiningYear(){
        return joiningYear;
    }

    public double getJoiningFee(){
        return joiningFee;
    }

    public boolean getIsABoolean(){
        return isActive;
    }



    public void display(){
        super.display();
        System.out.println("Joining year is "+joiningYear);
        System.out.println("Joining fee is "+joiningFee);
        System.out.println("Is Active or not "+isActive);
    }


}
