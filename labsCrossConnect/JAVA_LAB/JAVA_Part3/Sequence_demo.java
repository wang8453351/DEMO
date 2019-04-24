package JAVA_Part3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Sequence_demo {
    public static void main(String args[]){
        Employee_seq_demo e = new Employee_seq_demo();

        e.name = "WP";
        e.address = "SHANGHAI";
        e.SSN=12121212;
        e.number =220637;

        try{
            FileOutputStream fileout = new FileOutputStream("/tmp/Sequence_demo.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileout);
            out.writeObject(e);
            out.close();
            fileout.close();
            System.out.println("Serialized data is saved in /tmp/Sequence_demo.ser");

        }
        catch(IOException i)
        {
            i.printStackTrace();
        }
    }

}
