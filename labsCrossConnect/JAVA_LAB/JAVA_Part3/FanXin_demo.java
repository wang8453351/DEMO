 package JAVA_Part3;

public class FanXin_demo {
    public static<E> void printArray(E[] inputArray){

        //output array element
        for (E element : inputArray){
            System.out.printf("%s ",element);
        }
        System.out.println();

    }

    public static void main(String args[]) {

        //create different type arrays Integer double and char
        Integer[] intArray ={1,2,3,4,5};
        Double[]  doubleArray = {1.1,2.1,3.1,4.1,5.1};
        char[] charArray = {'A','B','C','D','E'};

        System.out.println("Integer element is ");
        printArray(intArray);
        System.out.println("Double element is ");
        printArray(doubleArray);
        System.out.println("Char element is ");
    }
}
