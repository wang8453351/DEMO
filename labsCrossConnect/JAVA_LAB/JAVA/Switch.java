package JAVA;

public class Switch {
    public static void main(String [] args){
        char grade = 'C';
        switch (grade) {
        case 'A':
            System.out.println("First");
            break;
        case 'B':
        case 'C':
        default:
            System.out.println("Unknown");

        }
        System.out.println("Your level is "+grade);
    }
}
