package ReflectionClass;

import java.lang.reflect.Constructor;

public class ConstructReflection {
    String s;
    int i1,i2,i3;

    private ConstructReflection() {

    }
    protected ConstructReflection(String s, int i) {
        this.s = s;
        this.i1= i;
    }
    /**
     * String... means you can set random length parameter list in method.
     * you can not use test(String[] strings), right example: test(String... strings)
     */
    public ConstructReflection(String...strings ) throws NumberFormatException{
        if(0<strings.length)
        {
            i1 = Integer.valueOf(strings[0]);
        }
        if(1<strings.length)
        {
            i2 = Integer.valueOf(strings[1]);
        }
        if(2<strings.length)
        {
            i3 = Integer.valueOf(strings[2]);
        }

    }

    public void print(){
        System.out.println("s = "+s);
        System.out.println("i1 = "+i1);
        System.out.println("i2 = "+i2);
        System.out.println("i3 = "+i3);

    }

    public static void main (String[] args)
    {
//        ConstructReflection Example = new ConstructReflection();ss
//        Constructor[] declaredConstructors = Example.getClass().getDeclaredConstructors();
        Constructor[] declaredConstructors = ConstructReflection.class.getDeclaredConstructors();
        for(int i =0;i<declaredConstructors.length;i++){
            Constructor constructor = declaredConstructors[i];
            System.out.println("Pls check whether is  any Parameter: "+ constructor.isVarArgs());//return true or false.
            System.out.println("For this constructor, Parameter type are : ");

            Class[] ParameterTypes = constructor.getParameterTypes();//return class array;

            for(int j = 0;j<ParameterTypes.length;j++)
            {
                System.out.println(" "+ParameterTypes[j]);
            }
            System.out.println("For this construct, exceptionTypes are : ");
            Class[] exceptionTypes = constructor.getExceptionTypes();
            for(int j = 0;j<exceptionTypes.length;j++) {
                System.out.println(" "+exceptionTypes[j]);
            }

            ConstructReflection Example = null;

            while(Example==null) {
                try {
                    if(i==2) {
                        Example = (ConstructReflection)constructor.newInstance();
                    }
                    else if(i==1) {
                        Example = (ConstructReflection)constructor.newInstance("7",5);
                    }
                    else {
                        Object[] parameters = new Object[] {
                                new String[] {"100","200","300"}
                        };
                        Example = (ConstructReflection)constructor.newInstance(parameters);
                    }

                }catch(Exception e)
                {
                    System.out.println("throws exception when creating object, execute setAccessible()");
                    constructor.setAccessible(true);
                }
            }
            Example.print();
            System.out.println();

        }

    }

}
