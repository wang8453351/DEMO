package JAVA;

public class Example_Class_Obj {
    int PuppyAge;
    public Example_Class_Obj(String name){
        System.out.println("The name of dog is "+name);
    }

    public void setAge(int age){
        PuppyAge = age;
    }

    public int getAge(){
        System.out.println("The old of dog is "+PuppyAge);
        return PuppyAge;

    }

    public static void main(String [] args){
        /*
         * create new obj
         */
        Example_Class_Obj myPuppy = new Example_Class_Obj("tommy");
        /*
         * use  method to set age;
         */
        myPuppy.setAge(8);
        /*
         * use method to get age;
         */
        myPuppy.getAge();
        /*
         * visit member variable(int PuppyAge);
         */
        System.out.println("The variable value is "+myPuppy.PuppyAge);
    }

}
