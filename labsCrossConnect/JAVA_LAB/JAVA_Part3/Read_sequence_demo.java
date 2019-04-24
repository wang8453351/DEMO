package JAVA_Part3;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Read_sequence_demo {
    public static void main(String args[]){
        Employee_seq_demo e =null;
        try {
            FileInputStream fileIn = new FileInputStream("/tmp/Sequence_demo.ser");
            ObjectInputStream in =new ObjectInputStream(fileIn);
            e = (Employee_seq_demo)in.readObject();
            in.close();
            fileIn.close();

        }
        catch(IOException i){
            i.printStackTrace();
            return;
        }
        catch (ClassNotFoundException e1) {
            // TODO Auto-generated catch block
            System.out.println("Empolyee_seq_demo is not found");
            e1.printStackTrace();
            return;
        }

        System.out.println("DeSerialized Employee....");
        System.out.println("Name : "+e.name);
        System.out.println("Address : "+e.address);
        System.out.println("SSN: "+e.SSN);
        System.out.println("Number: "+e.number);
    }
}
