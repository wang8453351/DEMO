package IOStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author demo
 *One question : where is "word.txt"
 *Answer : it created in program path;
 */
public class FileInputOutputStream {
    public static void main(String[] args) {
        FileInputOutputStream finout = new FileInputOutputStream();
    }

    public FileInputOutputStream() {
        File file = new File("word.txt");
        try {
            FileOutputStream out = new FileOutputStream(file);
            byte buy[] = "I am wangping from ADVANTEST!".getBytes();
            out.write(buy);
            out.close();
        }catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        System.out.println("Output Stream - write END!");
        try {
            FileInputStream in = new FileInputStream(file);
            byte byt[] = new byte[1024];
//            int len = in.read(byt);
//            in.read();
            in.read(byt);
            in.close();
//            System.out.println("Infomation for word : "+new String(byt,0,len));
            System.out.println("Infomation for word : "+new String(byt));
        }catch(Exception e) {
            e.printStackTrace();
        }

    }
}
