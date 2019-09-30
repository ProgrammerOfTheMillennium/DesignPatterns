package main.java.org.example.Strategy;

import java.util.Arrays;

public class SelectionSortStrategy implements Strategy {
    @Override
    public void sort(int[] arr) {
        System.out.println("selection sort: ");
        System.out.println(Arrays.toString(arr));

        for (int el = 0; el < arr.length - 1; el++) {
            int current = el;

            for (int sorter = el + 1; sorter < arr.length; sorter++) {
                if (arr[sorter] < arr[current]) {
                    current = sorter;
                }
            }

            int smallest = arr[current];
            arr[current] = arr[el];
            arr[el] = smallest;
        }
        System.out.println(Arrays.toString(arr) + "\n");
    }

    @Override
    public void print(int[] arr) {

    }
}