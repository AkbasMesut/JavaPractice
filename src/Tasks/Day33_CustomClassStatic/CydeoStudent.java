package Tasks.Day33_CustomClassStatic;

public class CydeoStudent {

    public String name;
    public int age;
    public char gender;
    public String id;
    public int grade, batchNumber, groupNumber;
    public static String schoolName, programingLanguage;


    public CydeoStudent(String name, int age, char gender, String id, int grade, int batchNumber, int groupNumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
        this.grade = grade;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }

    static {
        schoolName = "Cydeo";
        programingLanguage="Java";
    }

    public void study(){
        System.out.println(name+" is studying");
    }

    public void attendClass(){
        System.out.println(name+" is attending class ");
    }

    public void printSchoolName(){
        System.out.println("School name"+ " : "+ schoolName);
    }

    public void printProgLanguage(){
        System.out.println("Program language"+ " : "+programingLanguage);
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id='" + id + '\'' +
                ", grade=" + grade +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                '}';
    }
}
/*
            Create a class named CydeoStudent:

				Attributes:
					instances: name, age, gender, id, grade, batchNumber, groupNumber
					statics: schoolName, programmingLanguage

				Add a constructor that can set All the fields (instances)

				Actions:
					study()
					attendClass()
					printSchoolName(): displays the school name
					printProgLanguage(): displays the name of programming language
					toString()

 */
