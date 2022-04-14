package Tasks.Day31_CustomClass;

public class MovieObject {

    public static void main(String[] args) {

        String genre = "Adventure, Comedy, Thriller";
        String title = "Journey to SDET: Cdeo Batch EU08";
        String[] casts = {"Asiya", "Adam", "Muhtar", "Akbar", "Gürhan", "Saim", "Murat", "Nadir", "Gul jannet"};

        Movie movie1 = new Movie("USA",title,genre,"10/25/2022","Kuzzat");
        movie1.addCasts(casts);

        System.out.println(movie1);


    }

}
