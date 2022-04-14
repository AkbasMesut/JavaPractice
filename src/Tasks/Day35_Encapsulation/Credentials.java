package Tasks.Day35_Encapsulation;

public class Credentials {

    private String username,password;

    public Credentials(String username, String password) {
        setUsername(username);
        setPassword(password);
    }

    public boolean isStrongPassWord(String password){

        boolean r1 = password.length()>8 && !password.contains(" ");
        boolean r2 = false;
        boolean r3 = false;
        boolean r4 = false;
        boolean r5 = false;

        for (char each : password.toCharArray()) {
            if (Character.isUpperCase(each)){
                r2 = true;
            }else if (Character.isLowerCase(each)){
                r3 = true;
            }else if (Character.isDigit(each)){
                r4 = true;
            }else {
                r5 = true;
            }
        }
            return  r1 & r2 & r3 & r4 & r5;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (!isStrongPassWord(password)){
            System.err.println("Password \""+password+"\" is not a strong password");
            System.exit(1);
        }
        this.password = password;
    }

    public String toString() {
        return "Credentials{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
