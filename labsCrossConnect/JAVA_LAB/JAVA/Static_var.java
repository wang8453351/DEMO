package JAVA;

public class Static_var {
    private static int staticInt = 2;//only used in this Class because of private;
    private int random = 2;

    public Static_var(){
        staticInt++;
        random++;
        System.out.println("StaticInt = "+staticInt+",random = "+random);
    }

    public static void main(String []args){
        Static_var StaticTest_1 = new Static_var();
        Static_var StaticTest_2 = new Static_var();
        int a = StaticTest_2.random;
        int b = StaticTest_2.staticInt;
        System.out.println("StaticInt = "+b+",random = "+a);
    }

}
class Debug{
    int a =0;
    public Debug(){

    }
}
