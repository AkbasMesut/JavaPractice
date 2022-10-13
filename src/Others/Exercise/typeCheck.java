package Others.Exercise;

public class typeCheck {
    public static String typeCheck(Object obj){
        if (obj instanceof String)return "String";
        if (obj instanceof Integer)return "Integer";
        return "different type";
    }


    public static void main(String[] args) {

        Object x = new String("Hello");
        Object y = new Double(5);

        System.out.println(typeCheck(x));
        System.out.println(typeCheck(y));



    }



}
