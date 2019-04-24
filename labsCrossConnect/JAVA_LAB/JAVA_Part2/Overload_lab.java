package JAVA_Part2;

public class Overload_lab {
    public int test(){
        System.out.println("test1");
        return 1;
    }
    public void test(int a ){
        System.out.println("test2");
    }
    public String test(String s,int a){
        System.out.println("test3");
        return "test3";
    }
    public String test(int a,String s){
        System.out.println("test4");
        return "test4";
    }

    public static void main(String args[]){
        Overload_lab wp = new Overload_lab();
        System.out.println(wp.test());
        wp.test(1);
        System.out.println(wp.test(1,"test3"));
        System.out.println(wp.test("test4",1));

    }

}
