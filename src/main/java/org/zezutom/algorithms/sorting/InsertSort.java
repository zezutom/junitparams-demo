package org.zezutom.algorithms.sorting;

import java.util.Arrays;

/**
 * http://en.wikipedia.org/wiki/Insertion_sort
 */
public class InsertSort extends AbstractSort {

    @Override
    public String getName() {
        return "Insertion Sort";
    }

    @Override
    protected void sort(Result result, int... x) {
        for (int i=0; i<x.length; i++) {
            int value = x[i];
            int j = i - 1;

            while (j >= 0 && x[j] > value) {
                x[j + 1] = x[j];
                j--;
            }
            x[j + 1] = value;
            result.addStep(x);
        }
    }
}
