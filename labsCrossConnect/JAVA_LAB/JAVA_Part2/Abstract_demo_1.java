package JAVA_Part2;

public abstract class Abstract_demo_1 {

    private String name;
    private String address;
    private int number;
    public Abstract_demo_1(String name,String address,int number){
        System.out.println("construct function");
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public double computePay(){
        System.out.println("Inside Employee computePay");
        return 0.0;
    }

    public void mailcheck(){
        System.out.println("Mailing to check "+this.name+" "+this.address);
    }

    @Override
    public String toString(){
        return this.name + " "+this.address+ " "+number;
    }

    public String getName() {
        return name;
    }

    public String getAddress(){
        return address;
    }
    public void setAddress(String newAddress){
        address = newAddress;
    }

    public int getNumber()
    {
        return number;
    }

}
