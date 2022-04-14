package Tasks.Day35_Encapsulation;

public class CredentialObject {

    public static void main(String[] args) {

        Credentials credential = new Credentials("makbas","Karakartal.98");

        System.out.println(credential.isStrongPassWord(credential.getPassword()));

        System.out.println(credential);


    }
}
