package JAVA_Part2;

public class Virtual_Func_Demo {
    public static void main(String args[]){
        Sub_Virtual_Function s = new Sub_Virtual_Function("wangping", "shanghai", 3, 3600);
        Virtual_Function e = new Sub_Virtual_Function("zhoukai", "shanghai", 2, 2400);

        System.out.println("use sub_virtual_function to call mailcheck");

        s.mailCheck();
        System.out.println("use Virtual_Function to call mailcheck");
        e.mailCheck();


    }

}
