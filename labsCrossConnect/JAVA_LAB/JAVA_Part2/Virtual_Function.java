package JAVA_Part2;



public class Virtual_Function  {
    private String name;
    private String address;
    private int number;
    public Virtual_Function(String name,String address,int number){
        System.out.println("construct function");
        this.name = name;
        this.address = address;
        this.number = number;


    }
    public void mailCheck(){
        System.out.println("Dog is : "+this.name+" "+this.address);
    }

    @Override
    public String toString(){
        return name+" "+address +" "+number;
    }
    public String getName () {
        return name;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String newAddress){
        address = newAddress;
    }
    public int getNumber(){
        return number;
    }


    //    public static void main (String args[]){
    //
    //    }



}

