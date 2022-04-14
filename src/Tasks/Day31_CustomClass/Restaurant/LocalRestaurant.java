package Tasks.Day31_CustomClass.Restaurant;

public class LocalRestaurant {

    public static void main(String[] args) {

        Server[] servers = {
                new Server("Ahmet",4545,30,true),
                new Server("Mehmet",2525,15,false),
                new Server("Mahmmut",1212,12,false)

        };

        Chef[] chefs = {
                new Chef("Osman",5050,35,true),
                new Chef("Hasan",1414,10,true)

        };

        Restaurant restaurant = new Restaurant("Muhtar","VA",5);

        restaurant.hireChefs(chefs);
        restaurant.hireServers(servers);

        System.out.println(restaurant);




    }
}

/*
         Create a class LocalRestaurant that has a main method with the following:
	       - Make a Restaurant object
	       - Create an array of servers with their information set. Add those initial servers to the ArrayList of Servers in the Restaurant object
	       - Create an array of chefs with their information set. Add those initial chefs to the ArrayList of Chefs in the Restaurant object

	       - Print your whole restaurants information

 */