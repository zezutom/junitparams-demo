package org.zezutom.algorithms.sorting;

import static junitparams.JUnitParamsRunner.$;

/**
 *  Provides test data in the form of test method arguments
 */
public class SortDataProvider {

    private static final InsertSort insertSort = new InsertSort();

    private static final SelectSort selectSort = new SelectSort();

    private static final QuickSort quickSort = new QuickSort();

    public static Object[] provideNull() {
        return $(
            $(insertSort, null,
                new ResultBuilder(insertSort.getName())
                .build()
            ),
            $(selectSort, null,
                new ResultBuilder(selectSort.getName())
                .build()
            ),
            $(quickSort, null,
                new ResultBuilder(quickSort.getName())
                .build()
            )
        );
    }

    public static Object[] provideEmpty() {
        return $(
                $(insertSort, new int[]{},
                        new ResultBuilder(insertSort.getName())
                                .build()
                ),
                $(selectSort, new int[]{},
                        new ResultBuilder(selectSort.getName())
                                .build()
                ),
                $(quickSort, new int[]{},
                        new ResultBuilder(quickSort.getName())
                                .build()
                )
        );
    }

    public static Object[] provideInsertSort() {
        return $(insertSort,
                    new int[] {3, 7, 4, 9, 5, 2, 6, 1},
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

    public static Object[] provideSelectSort() {
        return $(selectSort,
                    new int[] {3, 7, 4, 9, 5, 2, 6, 1},
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

    public static Object[] provideQuickSort() {
        return $(quickSort,
                    new int[]{3, 7, 4, 9, 5, 2, 6, 1},
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

}
