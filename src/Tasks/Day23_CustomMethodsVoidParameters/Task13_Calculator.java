package Tasks.Day23_CustomMethodsVoidParameters;

public class Task13_Calculator {

    public static void main(String[] args) {

        calculator(5,6,'+');
    }

    public static void calculator (int num1,int num2,char op){

        int result =0;

        if (op =='+'){
            result = num1+num2;
        }else if (op=='-'){
            result = num1-num2;
        }else if (op=='*'){
            result = num1*num2;
        }else if (op == '/'){
            result = num1/num2;
        }

        System.out.println("Your result is "+result);
    }
}
