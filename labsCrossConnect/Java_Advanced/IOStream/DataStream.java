/**
 *
 */
package IOStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author Kris Wang @20180605<p>
 * TODO: read data without caring about which the data type is.
 * If we want to read data stream, the best way we suggested is using readUTF to return String type.
 * It generates mess information if we use readByte or readChar;
 */
public class DataStream {

    public static void main(String[] args) {
        DataStream dstream = new DataStream();

    }
    public DataStream() {
        try {
//            FileOutputStream fs = new FileOutputStream("word.txt");
            File file = new File("word.txt");
            FileOutputStream fos =new FileOutputStream(file);
            DataOutputStream ds = new DataOutputStream(fos);
            ds.writeUTF("Use UTF to write into data");
            ds.writeBytes("Use Byte to write into data");
            ds.writeChars("Use Char to write into data");
            ds.close();
            FileInputStream fis = new FileInputStream("word.txt");
            DataInputStream dis = new DataInputStream(fis);
            String txt =dis.readUTF();
            System.out.println(txt);

            byte txtOfBytes = dis.readByte();
            System.out.println(txtOfBytes);//error information, mess code

            char txtOfChar = dis.readChar();
            System.out.println(txtOfChar);//error information, mess code
        }catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();

        }
    }

}
