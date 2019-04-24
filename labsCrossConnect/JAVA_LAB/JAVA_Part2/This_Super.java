package JAVA_Part2;

public class This_Super {
    public static void main(String []args){
        new Subclass().showMessage();
    }

}
class Superclass{
    int i =50;
}
class Subclass extends Superclass{
    int i = 100;
    public void showMessage(){
        System.out.printf("super.i = %d,this.i=%d\n",super.i,this.i);
    }
}
