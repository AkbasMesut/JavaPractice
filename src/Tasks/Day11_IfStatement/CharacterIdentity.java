package Tasks.Day11_IfStatement;

public class CharacterIdentity {

    public static void main(String[] args) {

        char character = 'd';

        if ((character>64 && character<91) || (character>96 && character<123)){
            System.out.println("Alphabetic Character");
        }else if (character>47 && character<58){
            System.out.println("Digit");
        }else {
            System.out.println("Special Character");
        }
    }
}
