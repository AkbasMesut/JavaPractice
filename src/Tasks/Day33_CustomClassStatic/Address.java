package Tasks.Day33_CustomClassStatic;

public class Address {

    public String street, city, state;
    public int zipCode;

    public static String country = "Turkey", planet = "Earth";

    public Address(String street, String city, String state, int zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public void setInfo(){
        System.out.println(street+" "+city+" "+state);
    }

    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode=" + zipCode +
                ", country=" + country +
                ", planet=" + planet +
                '}';
    }
}
/*
        Create a class named Address:
		    Attributes:
		        instance:  street, city, state, zipCode;
		        static: country, planet

	            Add a constructor that can set All the fields (instances)

		    Actions
		            setInfo: sets all the instances
		            toString: returns the address
		                        EX:
		                            7925 Jones Branch Dr
		                            McLean Va, 22012
 */
