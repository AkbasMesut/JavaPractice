package Tasks.Day12_Switch;

public class BrowserName {

    public static void main(String[] args) {

        String browserName = "chrome";

        switch (browserName){
            case "chrome":
                System.out.println("chrome browser is selected");
                break;
            case "firefox":
                System.out.println("firefox browser is selected");
                break;
            case "opera":
                System.out.println("opera browser is selected");
                break;
            case "safari":
                System.out.println("safari browser is selected");
                break;
            case "edge":
                System.out.println("edge browser is selected");
                break;
            default:
                System.out.println("Invalid Browser");
        }



    }
}
/*
            write a program that can display the selected browser
            3.1  declare a String variable called browserName
            3.2  Assume that the valid browsers are: chrome, firefox, opera, safari, edge
            3.3 if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser

        	Do Not use if statement or ternary
 */