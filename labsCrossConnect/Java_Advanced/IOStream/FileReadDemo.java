package IOStream;

import java.io.FileReader;

public class FileReadDemo {
    private static String file = "../labsCrossConnect/Java_Advanced/IOStream/FileReadDemo.java";

    public static void main(String[] args) throws Exception{
        // TODO Auto-generated method stub
        //read input are InputStream write output are OutputStream.
        //read write are Character Stream, input output are ByteStream.
        FileReader wj = new FileReader(file);
//        FileInputStream wj = new FileInputStream(file);

        int aa;
        aa = wj.read();
        System.out.println("File content are: ");
        while(aa!=(-1)) {//ASCII min value is 0; If no value ,return -1;
            System.out.print((char)aa);
            aa = wj.read();
        }
        wj.close();

    }

}
