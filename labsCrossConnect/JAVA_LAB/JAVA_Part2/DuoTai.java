package JAVA_Part2;


/*
 * pay attention to : class name shouldn't be same with other class name in other java file;
 */
public class DuoTai {
    public static void main(String[] args){
        show(new Cat());  //  Cat  show
        show(new dog());  //  Dog  show

        animal a = new Cat();  // up convert
        a.eat();               //  Cat  eat
        Cat c = (Cat)a;        // down convert
        c.work();        //  Cat  work


    }

    public static void show(animal a)  {
        a.eat();
        //
        if (a instanceof Cat)  {  // convert a to Cat; judge it;
            Cat c = (Cat)a;
            c.work();
        } else if (a instanceof dog) { //
            dog c = (dog)a;
            c.work();
        }
    }
}
abstract class animal {
    abstract void eat();
}
class Cat extends animal {
    @Override
    public void eat() {
        System.out.println("Cat can eat");
    }
    public void work() {
        System.out.println("Cat can work");
    }
}

class dog extends animal {
    @Override
    public void eat() {
        System.out.println("Dog can eat");
    }
    public void work() {
        System.out.println("Dog can work");
    }
}

/*
 *
 */
//class animal {
//    public int age;
//    public void move(){
//        System.out.println("animal can move");
//    }
//}
//class dog extends animal{
//    public double age;
//    @Override
//    public void move(){
//        age =100;
//        System.out.println("Dog can move");
//    }
//    public void bark(){
//        System.out.println("Dog can bark");
//    }
//}
//class cat extends animal{
//    public void mode(){
//        super.age= 3;
//        System.out.println("cat can jump");
//    }
//}
//public class DuoTai{
//    public void main(String [] args){
//        animal a = new animal();
//        animal b = new cat();
//        animal c = new dog();
//
//        dog d = new dog();
//        cat e = new cat();
//
//        a.move();
//        b.move();
//        c.move();
//        d.move();
//        e.move();
//
//        Object aValue = a.age;
//        Object bvalue = b.age;
//        Object cValue = c.age;
//        Object dValue = d.age;
//        Object eValue = e.age;
//
//
//    }
//}













