public class Movie {
    private String title;
    private String studio;
    private String rating;

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }

    // Other methods, getters, and setters go here...

    public static void main(String[] args) {
        // Example usage of the constructors
        Movie movie1 = new Movie("Inception", "Warner Bros", "PG-13");
        System.out.println("Title: " + movie1.title);
        System.out.println("Studio: " + movie1.studio);
        System.out.println("Rating: " + movie1.rating);

        Movie movie2 = new Movie("Jurassic Park", "Universal Pictures");
        System.out.println("Title: " + movie2.title);
        System.out.println("Studio: " + movie2.studio);
        System.out.println("Rating: " + movie2.rating);
    }
}
