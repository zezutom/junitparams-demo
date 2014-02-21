package org.zezutom.algorithms.sorting;

import java.util.*;

/**
 *  http://en.wikipedia.org/wiki/Quicksort
 */
public class QuickSort extends AbstractSort {

    private int[] numbers;
    private int index;
    private Result result;
    private Set<Integer> pivots = new HashSet<Integer>();

    @Override
    public String getName() {
        return "Quick Sort";
    }

    @Override
    protected void sort(Result result, int... x) {
        this.result = result;
        numbers = x;
        index = x.length;
        quicksort(0, index - 1);
    }

    private void quicksort(int low, int high) {
        int i = low, j = high;

        // take the element in the middle as a comparison base
        int pivot = numbers[low + (high - low) / 2];

        // track progress
        if (!pivots.contains(pivot)) {
            result.addStep(numbers);
            pivots.add(pivot);
        }

        int k = 0;
        // split into two parts, "naive" assumption: the list is already sorted in an ascending order
        while (i <= j) {
            // traverse the "lesser than the pivot" part until you meet the threshold (pivot)
            while (numbers[i] < pivot)
                i++;

            // traverse the "greater than the pivot" part until you meet the threshold (pivot)
            while (numbers[j] > pivot)
                j--;

            // swap values if there is still a gap to be closed
            if (i <= j) {
                swap(i, j);
                // narrow the gap
                i++; j--;
            }

            // recursion
            if (low < j)
                quicksort(low, j);
            if (i < high)
                quicksort(i, high);
        }


    }

    private void swap(int i, int j) {
        int tmp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = tmp;
    }
}
