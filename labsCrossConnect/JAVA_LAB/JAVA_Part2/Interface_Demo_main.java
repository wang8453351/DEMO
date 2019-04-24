package JAVA_Part2;

public class Interface_Demo_main implements Interface_demo {
    @Override
    public void write(){
        System.out.println("Mammal eats");
    }
    @Override
    public void read(){
        System.out.println("Mammal travels");
    }

    public int noOfLegs(){
        return 0;
    }

    public static void main(String args[]){
        Interface_Demo_main m =new Interface_Demo_main();
        m.write();
        m.read();
    }



}
