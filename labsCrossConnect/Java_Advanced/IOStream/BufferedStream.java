/**
 *
 */
package IOStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author Kris Wang@20180605
 * TODO improve read/write IO stream efficiency. Set buffer region to do
 *
 */
public class BufferedStream {
    public static void main(String[] args) {
        BufferedStream bufs = new BufferedStream();
    }


    /**
     * construct method
     */
    public BufferedStream() {
        String content[] = {"demo1","demo2","demo3"};
        File file = new File("word.txt");
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bufw= new BufferedWriter(fw);
            for(int k=0;k<content.length;k++) {
                bufw.write(content[k]);
                bufw.newLine();
            }
            bufw.close();
            fw.close();
        }catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        try {
            FileReader fr = new FileReader(file);
            BufferedReader bufr = new BufferedReader(fr);
            String s = null;
            int i=0;
            while((s=bufr.readLine())!=null) {
                i++;
                System.out.println("For Line "+i+" : "+s);
            }
            bufr.close();
            fr.close();
        }catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }


    }
}
