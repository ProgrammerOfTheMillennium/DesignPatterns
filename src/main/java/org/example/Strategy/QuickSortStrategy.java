package main.java.org.example.Strategy;
/*
    example from https://www.java2novice.com/java-sorting-algorithms/quick-sort/
 */

import java.util.Arrays;

public class QuickSortStrategy implements Strategy {
    private int array[];
    private int length;

    @Override
    public void sort(int[] inputArr) {
        if (inputArr == null || inputArr.length == 0) {
            return;
        }
        this.array = inputArr;
        length = inputArr.length;

        System.out.println("insertion sort: ");
        System.out.println(Arrays.toString(array));

        quickSort(0, length - 1);

        System.out.println(Arrays.toString(array));
    }

    private void quickSort(int lowerIndex, int higherIndex) {

        int i = lowerIndex;
        int j = higherIndex;

        int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];

        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(i, j);
                i++;
                j--;
            }
        }

        if (lowerIndex < j)
            quickSort(lowerIndex, j);
        if (i < higherIndex)
            quickSort(i, higherIndex);
    }

    private void exchangeNumbers(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


    @Override
    public void print(int[] arr) {

    }
}
