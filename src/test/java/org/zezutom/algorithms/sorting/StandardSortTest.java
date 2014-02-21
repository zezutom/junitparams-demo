package org.zezutom.algorithms.sorting;

import org.junit.Assert;
import org.junit.Test;

public class StandardSortTest {

    private int[] input = new int[] {3, 7, 4, 9, 5, 2, 6, 1};

    private InsertSort insertSort = new InsertSort();

    private SelectSort selectSort = new SelectSort();

    private QuickSort quickSort = new QuickSort();

    @Test
    public void insertSortNull() {
        assertResult(insertSort.sort(null), new ResultBuilder(insertSort.getName()).build());
    }

    @Test
    public void insertSortEmpty() {
        assertResult(insertSort.sort(new int[] {}), new ResultBuilder(insertSort.getName()).build());
    }

    @Test
    public void insertSort() {
        assertResult(insertSort.sort(input),
                new ResultBuilder(insertSort.getName())
                    .addStep(3, 7, 4, 9, 5, 2, 6, 1)
                    .addStep(3, 7, 4, 9, 5, 2, 6, 1)
                    .addStep(3, 4, 7, 9, 5, 2, 6, 1)
                    .addStep(3, 4, 7, 9, 5, 2, 6, 1)
                    .addStep(3, 4, 5, 7, 9, 2, 6, 1)
                    .addStep(2, 3, 4, 5, 7, 9, 6, 1)
                    .addStep(2, 3, 4, 5, 6, 7, 9, 1)
                    .addStep(1, 2, 3, 4, 5, 6, 7, 9)
                    .build()
        );

    }

    @Test
    public void selectSortNull() {
        assertResult(selectSort.sort(null), new ResultBuilder(selectSort.getName()).build());
    }

    @Test
    public void selectSortEmpty() {
        assertResult(selectSort.sort(new int[] {}), new ResultBuilder(selectSort.getName()).build());
    }

    @Test
    public void selectSort() {
        assertResult(selectSort.sort(input),
                new ResultBuilder(selectSort.getName())
                    .addStep(3, 7, 4, 1, 5, 2, 6, 9)
                    .addStep(3, 6, 4, 1, 5, 2, 7, 9)
                    .addStep(3, 2, 4, 1, 5, 6, 7, 9)
                    .addStep(3, 2, 4, 1, 5, 6, 7, 9)
                    .addStep(3, 2, 1, 4, 5, 6, 7, 9)
                    .addStep(1, 2, 3, 4, 5, 6, 7, 9)
                    .addStep(1, 2, 3, 4, 5, 6, 7, 9)
                    .build()
        );

    }

    @Test
    public void quickSortNull() {
        assertResult(quickSort.sort(null), new ResultBuilder(quickSort.getName()).build());
    }

    @Test
    public void quickSortEmpty() {
        assertResult(quickSort.sort(new int[] {}), new ResultBuilder(quickSort.getName()).build());
    }

    @Test
    public void quickSort() {
        assertResult(quickSort.sort(input),
                new ResultBuilder(quickSort.getName())
                    .addStep(3, 7, 4, 9, 5, 2, 6, 1)
                    .addStep(3, 7, 4, 1, 5, 2, 6, 9)
                    .addStep(1, 7, 4, 3, 5, 2, 6, 9)
                    .addStep(1, 4, 7, 3, 5, 2, 6, 9)
                    .addStep(1, 2, 5, 3, 7, 4, 6, 9)
                    .addStep(1, 2, 3, 5, 7, 4, 6, 9)
                    .addStep(1, 2, 3, 4, 6, 5, 7, 9)
                    .addStep(1, 2, 3, 4, 6, 5, 7, 9)
                    .build()
        );

    }

    private void assertResult(Result expected, Result actual) {
        Assert.assertEquals(expected.toString(), actual.toString());
    }
}
