/**
 *
 */
package IOStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * @author Kris Wang@20180605
 * TODO: Zip Class(Internal class in java)<p>
 * zipFileName : *.zip
 * inputFileName : folderName or fileName
 *
 */
public class ZipStream {

    public static void main(String[] args) {
        ZipStream book = new ZipStream();
        try {
            book.zip("./word.zip", new File("/home/demo/Project/Smar8_Lab/labsCrossConnect/image"));
            System.out.println("Zip are finished...");
        }catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
    public ZipStream() {

    }
    @SuppressWarnings("resource")
    private void zip(String zipFileName,File inputFile) throws Exception{
//        FileOutputStream fos = new FileOutputStream(inputFile);
        FileOutputStream fos_zip = new FileOutputStream(zipFileName);
        ZipOutputStream out = new ZipOutputStream(fos_zip);
        zip(out,inputFile,"");//base = ""
        System.out.println("Zip on going.......");
        out.close();
//        fos.close();
        fos_zip.close();

    }
    private void zip(ZipOutputStream out,File f,String base) throws Exception {
        if(f.isDirectory()) {// include all files in folder
            File[] fl = f.listFiles();
            out.putNextEntry(new ZipEntry(base+"/"));
            base = base.length()==0?"":base+"/";// judge file whether is empty.
            System.out.println("file length : "+fl.length);
            for(int i =0;i<fl.length;i++) {
                zip(out,fl[i],base+fl[i]);
            }
        }else {
            out.putNextEntry(new ZipEntry(base));
            FileInputStream in = new FileInputStream(f);
            int b ;
            System.out.println(base);
            while((b=in.read())!=-1) {//read until to the end of file
                out.write(b);//write byte into zip, b means length of byte. in.read()---> return length of byte in file
            }
            in.close();
        }
    }

}
