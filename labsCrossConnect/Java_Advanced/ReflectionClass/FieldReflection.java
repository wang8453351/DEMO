package ReflectionClass;

import java.lang.reflect.Field;

public class FieldReflection {

    int i;
    public float f;
    protected boolean b;
    private String s;

    public static void main(String[] args) {
        FieldReflection example = new FieldReflection();
        Class exampleC = example.getClass();

        Field[] declaredFields = FieldReflection.class.getDeclaredFields();

        for(int i = 0;i<declaredFields.length;i++) {
            Field field = declaredFields[i];
            System.out.println("Field Name : "+field.getName());

            Class fieldType = field.getType();
            System.out.println("Field Type : "+field.getType());

            boolean isTurn = true;
            while(isTurn) {
                try {
                    isTurn = false;
                    System.out.println("Before modified, Value is : "+field.get(example));

                    if(fieldType.equals(int.class)) {
                        System.out.println("Use setInt() to change parameter");
                        field.setInt(example, 168);
                    }else if(fieldType.equals(float.class)) {
                        System.out.println("Use setFloat() to change parameter");
                        field.setFloat(example, 99.9F);
                    }else if(fieldType.equals(boolean.class)) {
                        System.out.println("Use setBoolean() to change parameter");
                        field.setBoolean(example, true);
                    }else {
                        System.out.println("Use set() to change parameter");
                        field.set(example,"MMQ");
                    }
                    System.out.println("After modified parameter, "+field.get(example));

                }catch(Exception e) {
                    System.out.println("Throws exception when setting parameter value, "+"execute setAccessible()");
                    field.setAccessible(true);
                    isTurn = true;
                }
            }
            System.out.println();
        }
    }
}
