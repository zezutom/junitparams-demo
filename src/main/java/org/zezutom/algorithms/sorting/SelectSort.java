package org.zezutom.algorithms.sorting;

/**
 *  http://en.wikipedia.org/wiki/Selection_sort
 */
public class SelectSort extends AbstractSort {

    @Override
    public String getName() {
        return "Selection Sort";
    }

    @Override
    protected void sort(Result result, int... x) {
        for (int i = x.length - 1; i > 0; i--) {
            int index = 0;
            for (int j = 1; j <= i; j++) {
                if (x[j] >= x[index])
                    index = j;
            }
            int tmp = x[index];
            x[index] = x[i];
            x[i] = tmp;
            result.addStep(x);
        }
    }
}
