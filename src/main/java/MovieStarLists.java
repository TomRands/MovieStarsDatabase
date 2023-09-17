import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MovieStarLists {

    Scanner myScanner = new Scanner(System.in);
    ArrayList<String> movieStarList = new ArrayList<>();

    public void printMovieStarListMenu() {

        System.out.println("""
                                
                1. To add a Movie Star.
                2. To print out your current list of Movie Stars
                3. To exit the program
                                
                """);
        String input = myScanner.nextLine();

        switch (input) {
            case "1" -> populateMovieStarList();
            case "2" -> {
                printMovieStarList();
                printMovieStarListMenu();
            }
            case "3" -> System.exit(0);
            default -> {
                System.out.println();
                System.out.println("Please type in either a valid input, 1, 2, or 3.");
                printMovieStarListMenu();
            }
        }
    }

    public void populateMovieStarList() {

        System.out.println();
        System.out.println("Please type a fist name and surname of the Movie Star you wish to add. Or type 'exit' to go back to the menu.");
        String input = myScanner.nextLine();

        if (input.equalsIgnoreCase("exit")) {
            printMovieStarListMenu();
        } else {
                movieStarList.add(input);
                populateMovieStarList();
            }


//            for (String duplicate : movieStarList) {
//                if (!movieStarList.contains(duplicate)) {
//                    movieStarList.add(input);
//                    populateMovieStarList();
//                } else {
//                    System.out.println("No duplicates!");
//                }
//
//            }
        }


        public void printMovieStarList () {
            Collections.sort(movieStarList);

            for (String movieStar : movieStarList) {
                System.out.println(movieStar);
            }

        }
    }

