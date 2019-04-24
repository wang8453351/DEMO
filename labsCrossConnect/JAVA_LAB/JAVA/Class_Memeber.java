package JAVA;

public class Class_Memeber {//class variable definition after Class_Memeber;
    /*
     * member variable of class
     */
    String breed;
    int age;
    String color;
    /*
     * barking,hungry,sleeping is way of class;
     */
    void barking(){
        /*
         * partial variable definition;
         */
    }
    void hungry(){

    }
    void sleeping(){

    }
    /*
     * construct method of class Class_Memeber, name is same;
     * In one class, there are more construct method;
     * when we create object, we must use one construct method, if no shown, set default construct method;
     */
    public Class_Memeber(){


    }
    public Class_Memeber(String name){
        System.out.println("The name of dog is "+ name);

    }

    /*
     * create object of class
     * Step1: state object ,include object name and type
     * Step2: use keyword new to create object;
     * Step3: when use new to create object, it will call construct to initialize object;
     */
    public static void main(String [] args){

        Class_Memeber Pupply = new Class_Memeber("Tommy");//add string name of object;
    }


}
