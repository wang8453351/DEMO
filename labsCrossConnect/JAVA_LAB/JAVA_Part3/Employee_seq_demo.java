package JAVA_Part3;

import java.io.Serializable;

public class Employee_seq_demo implements Serializable{
    public String name;
    public String address;
    public transient int SSN;
    public int number;
    public void mailCheck(){
        System.out.println("Maililing a check to "+name+" "+address);
    }

}
