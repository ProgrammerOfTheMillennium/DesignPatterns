package main.java.org.example;

import main.java.org.example.Strategy.*;
import main.java.org.example.State.*;

import java.util.Arrays;
//import main.java.org.example.Factory.*;

/**
 * Hello Patterns!
 *
 */
public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello Patterns!\n" );
        System.out.println( "Strategy Pattern:" );

        int arr[] = {41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37 };

        Context context = new Context(new InsertionSortStrategy());
        context.sort(arr);

        arr = new int[]{500, 43, 47, 53, 59, 61, 67, 456, 73, 79, 83, 89, 97, 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 34};
        context = new Context(new SelectionSortStrategy());
        context.sort(arr);

        arr = new int[]{500, 43, 47, 53, 59, 58456, 67, 456, 73, 79, 83, 89, 97, 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 37};
        context = new Context(new QuickSortStrategy());
        context.sort(arr);

        System.out.println("\nState Pattern:");

        PlayerContext stateContext = new PlayerContext();
        State startPlay = new PlayState();
        State stopPlay = new StopState();

        stateContext.setState(startPlay);
        stateContext.doAction();
        stateContext.setState(stopPlay);
        stateContext.doAction();


    }
}
