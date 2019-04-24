package JAVA_Part2;

class Animal {
    public Animal(){};
    public void move() {
        System.out.println("This is animal, it can move");
    }
}
class Dog extends Animal{
    @Override
    public void move(){
        System.out.println("The dog can run and walk");
    }
    public void bark(){
        System.out.println("The dog can bark");
    }

}
class cat extends Animal{
    @Override
    public void move(){
        super.move();
        System.out.println("cat can run again");
    }
}
public class Override_lab {
    public static void main(String args[]){
        Animal a = new Animal();
        Animal b = new Dog();//because Animal class has move() member function; but object is specified function;
        Dog c = new Dog();
        Animal d  = new cat();



        a.move();
        b.move();
        c.move();
        c.bark();
        //        b.bark();//it will throw exception; because there is no bard() in Animal class;
        d.move();
    }


}
