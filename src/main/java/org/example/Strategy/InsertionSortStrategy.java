package main.java.org.example.Strategy;

import java.util.Arrays;

public class InsertionSortStrategy implements Strategy {
    @Override
    public void sort(int[] arr) {
        System.out.println("insertion sort: ");
        System.out.println(Arrays.toString(arr));

        for (int el = 0; el < arr.length; el++) {
            int duplicate = arr[el];
            int sorter = el;

            while (sorter > 0 && duplicate < arr[sorter-1]) {
                arr[sorter] = arr[sorter-1];
                sorter--;
            }
            arr[sorter] = duplicate;
        }
        System.out.println(Arrays.toString(arr) + "\n");
    }

    @Override
    public void print(int[] arr) {

    }
}
