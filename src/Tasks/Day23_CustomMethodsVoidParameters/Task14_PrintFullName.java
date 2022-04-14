package Tasks.Day23_CustomMethodsVoidParameters;

public class Task14_PrintFullName {

    public static void main(String[] args) {


        printFullName("mesut","akbaş");



    }

    public static void printFullName(String firstName, String lastName) {

        firstName = firstName.substring(0, 1).toUpperCase() +firstName.substring(1).toLowerCase() ;
        lastName = lastName.substring(0, 1).toUpperCase()+lastName.substring(1).toLowerCase();

        String fullName = firstName+lastName;

        System.out.println(firstName+" "+lastName);

    }

}
