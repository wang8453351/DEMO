package JAVA;

public class RUN_LOOP {
    public static void main(String[] args){
        int x=0;
        while(x<20){
            System.out.println("Value of x : "+x);
            x++;
            System.out.println("\n");
        }
    }

}
class Test{
    public static void main(String[] args){
        int x =10;
        do{
            System.out.println("Value1 of x : "+x);
            x++;
            System.out.println("\n");
        }while (x<20);
    }

}

class For_Loop{
    public static void main(String[] args){
        for(int x=10;x<20;x=x+1){
            System.out.println("value2 of x :"+x);
            System.out.println("\n");
        }
    }
}
/*
 * in one *.java file,we only use one public class or no public class;
 *if we run this test code;
 *first  we will choose one class from generated class file;
 *we can't run all class file at one time;
 */
