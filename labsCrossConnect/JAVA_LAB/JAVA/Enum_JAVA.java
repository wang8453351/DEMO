package JAVA;

class FreshJuice{
    enum FreshJuiceSize{
        SMALL,MEDIUM,LARGE,Wangping
    }

    FreshJuiceSize size;

}
public class Enum_JAVA {
    public static void main(String[] args){
        FreshJuice juice = new FreshJuice();

        juice.size = FreshJuice.FreshJuiceSize.SMALL;
    }

}
