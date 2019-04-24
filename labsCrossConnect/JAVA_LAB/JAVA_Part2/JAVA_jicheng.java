package JAVA_Part2;

public class JAVA_jicheng {
    private String name;
    private int id;
    public JAVA_jicheng(String muName,int myID){
        name = muName;
        id = myID;
    }

    public void eat(){
        System.out.println(name + "is eating");
    }

    public void sleep(){
        System.out.println(name + "is sleeping");
    }

    public void introduct(){
        System.out.println("My ID is "+id+"My name is "+name);
    }

    protected static class child extends JAVA_jicheng{

        public child(String muName, int myID) {
            super(muName, myID);//jicheng father's member variable;
            // TODO Auto-generated constructor stub
        }

    }
    static class child_2 extends JAVA_jicheng{
        public child_2(String muName,int myID){
            super(muName, myID);
        }
    }
}

