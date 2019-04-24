/**
 *
 */
package EnumType;

/**
 * @author demo
 *
 */
public class ShowEnum {

    enum Constants2{
        Constants_A,
        Constants_B
    }


    /**
     * @param args
     */

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        for(int i =0;i<Constants2.values().length;i++) {
            System.out.println("Enum value : "+Constants2.values()[i]);
            System.out.println(Constants2.values()[i] + ", index is : "+Constants2.values()[i].ordinal());
        }

        compare(Constants2.valueOf("Constants_B"));
//        compare(Constants2.valueOf("Constants_C"));//no enum type.
    }

    public static void compare(Constants2 c) {
        for(int i = 0;i<Constants2.values().length;i++) {
            System.out.println(c+" and "+Constants2.values()[i]+" compare result is : "+c.compareTo(Constants2.values()[i]) );

        }
    }

}
