package JAVA;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class File_input_output {
    public static void main(String[] args) {
        try{
            byte bWrite[] = {11,21,3,40,5};
            OutputStream os = new FileOutputStream("test.txt");
            for(int x =0;x<bWrite.length;x++)
            {
                os.write(bWrite[x]);
            }
            os.close();

            InputStream is =new FileInputStream("test.txt");
            int size = is.available();

            for(int i=0;i<size;i++)
            {
                System.out.println((char)is.read()+" ");
            }
            is.close();

        }catch(IOException e)
        {
            System.out.println("Exception");
        }

    }
}

class fileStreamTest2{
    public static void main(String [] args) throws IOException{
        File f = new File("a.txt");
        FileOutputStream fop = new FileOutputStream(f);
        OutputStreamWriter writer = new OutputStreamWriter(fop,"UTF -8");
        writer.append("chinese input");
        writer.append("\r\n");
        writer.append("English");
        writer.close();
        FileInputStream fip = new FileInputStream(f);
        InputStreamReader reader = new InputStreamReader(fip,"UTF-8");
        StringBuffer sb = new StringBuffer();
        while (reader.ready()){
            sb.append((char)reader.read());
        }
        System.out.println(sb.toString());
        reader.close();
        fip.close();
    }
}
