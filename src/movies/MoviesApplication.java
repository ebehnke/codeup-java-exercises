package movies;

import util.Input;
import movies.*;
import java.util.Arrays;

public class MoviesApplication {

    static Movie[] movies;
    static Input in;

    static void viewAll() {
//        Movie[] movies = MoviesArray.findAll();
        for (Movie movie : movies) {
            System.out.println(movie.getName());
        }
    }

    static void viewMoviesByCategory(String category) {
//        Movie[] movies = MoviesArray.findAll();
        for (Movie movie : movies) {
            if (movie.getCategory().equals(category))
                System.out.println(movie.getName());
        }
    }

    private static void addMovie() {
        System.out.println("What is the title? ");
        String wtf = in.getString();
        String title = in.getString();
        System.out.println("What category is this movie in? ");
        String category = in.getString();
        Movie[] newMovies = Arrays.copyOf(movies, movies.length + 1);

        newMovies[newMovies.length - 1] = new Movie(title, category);
        movies = newMovies;
    }

    public static void main(String[] args) {
        // statically declared types so it is not necessary to type Movie[] movies = or Input in =
        movies = MoviesArray.findAll();
        in = new Input();

//        Movie[] movies = MoviesArray.findAll();
//        for (Movie movie : movies) {
//            System.out.println(movie.getName());
//        }

//        System.out.println(grabMovies.toString());

//        System.out.println(Arrays.toString(MoviesArray.findAll()));
//        System.out.println(MoviesArray.findAll());

        while (true) {
            System.out.printf("What would you like to do?%n0 - exit%n1 - view all movies%n2 - view movies in the " +
                    "animated category%n3 - view movies in the drama category%n4 - view movies in the horror category%n" +
                    "5 - view movies in the scifi category%n6 - view movies in the musical category%n7 - view " +
                    "movies in the comedy category%n8 - add movie%nEnter your choice: ");
            int userOption = in.getInt();
            //        if (userOption == 1) {
            //            viewAll(movies);0

            switch (userOption) {
                case 0:
                    return;
                case 1:
                    viewAll();
                case 2:
                    viewMoviesByCategory("animated");
                    break;
                case 3:
                    viewMoviesByCategory("drama");
                    break;
                case 4:
                    viewMoviesByCategory("horror");
                    break;
                case 5:
                    viewMoviesByCategory("scifi");
                    break;
                case 6:
                    viewMoviesByCategory("musical");
                    break;
                case 7:
                    viewMoviesByCategory("comedy");
                    break;
                case 8:
                    addMovie();
                    break;
                default:
                    System.out.println("Invalid Entry.");
                    break;
            }
            System.out.println("Would you like to continue? (y/n) ");
            if (in.yesNo()) continue;
            else break;
        }
    }




    //This class has a static method named findAll that will return an array of Movie objects.
    //Give the user a list of options for viewing all the movies or viewing movies by category.
    //Use your Input class to get input from the user, and display information based on their choice. (Remember to import your Input class)
    //If a category is selected, only movies from that category should be displayed.
    //Your application should continue to run until the user chooses to exit.

    //0 - exit
    //1 - view all movies
    //2 - view movies in the animated category
    //3 - view movies in the drama category
    //4 - view movies in the horror category
    //5 - view movies in the scifi category
    //
    //Enter your choice: 1
    //
    //Frankenstein -- horror
    //Goodfellas -- drama
    //Pulp Fiction -- drama
    //...
    //Bonus
    //
    //Add functionality to allow a user to add a new movie to the list.
}
