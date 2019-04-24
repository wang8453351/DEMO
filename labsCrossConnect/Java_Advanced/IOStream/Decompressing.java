/**
 *
 */
package IOStream;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * @author demo
 *
 *if we set file.mkdirs and file.createNewFile, generated file will be converted from file to folder.
 *So bufferedOutputStream will be disable.
 *if we comment file.mkdirs and delete /home/demo/../image/ folder, it can't not createNewFile in prog path.
 *should add bufferOutputStream to copy bytes of zip file....
 */
public class Decompressing {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        ZipInputStream zin;
        try {
            FileInputStream fis = new FileInputStream("/home/demo/Project/Smar8_Lab/labsCrossConnect/word.zip");
            zin = new ZipInputStream(fis);
            ZipEntry entry = zin.getNextEntry();//getNextEntry will be refresh again!
//            System.out.println("INFO entry = : "+entry+", zin.getNextEntry() = "+zin.getNextEntry());
//            System.out.println("Judge condition 2: "+zin.getNextEntry().isDirectory());
            while(((entry=zin.getNextEntry())!=null)&&!entry.isDirectory()) {//refresh entry by zin.getNextEntry()
               System.out.println("entry.getName() : "+entry.getName());
                File file = new File(entry.getName());//Decompress files path
                System.out.println(file);
                if(!file.exists()) {
//                    System.out.println("Create new folder");
//                    file.mkdirs();
//                    if(file.isFile()) {
                        System.out.println("Create new file");
                    file.createNewFile();
//                    }
                }
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file));
                int read;
                byte[] buffer = new byte[1024*10];//need change it !!!!!
                while((read=zin.read(buffer,0,buffer.length))!=-1) {
                    bos.write(buffer,0,read);
//                    bos.write("DDDDDDDDDDDDD".getBytes());
                }
                bos.flush();


                /**
                 * Solution two : use DataOutputStream / BufferedWriter/FileWriter
                 */


                zin.closeEntry();
                System.out.println(entry.getName()+" Decompress successfully...");
            }
            zin.close();
        }catch (Exception e) {
            e.printStackTrace();

        }
    }
}
