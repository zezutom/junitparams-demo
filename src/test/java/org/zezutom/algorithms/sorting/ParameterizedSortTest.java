package org.zezutom.algorithms.sorting;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import static junitparams.JUnitParamsRunner.$;

@RunWith(JUnitParamsRunner.class)
public class ParameterizedSortTest {

    private Object[] parametersForSort() {
        return $(
            $(new InsertSort(),
              new int[] {3, 7, 4, 9, 5, 2, 6, 1},
              new ResultBuilder("Insertion Sort")
                    .addStep(3, 7, 4, 9, 5, 2, 6, 1)
                    .addStep(3, 7, 4, 9, 5, 2, 6, 1)
                    .addStep(3, 4, 7, 9, 5, 2, 6, 1)
                    .addStep(3, 4, 7, 9, 5, 2, 6, 1)
                    .addStep(3, 4, 5, 7, 9, 2, 6, 1)
                    .addStep(2, 3, 4, 5, 7, 9, 6, 1)
                    .addStep(2, 3, 4, 5, 6, 7, 9, 1)
                    .addStep(1, 2, 3, 4, 5, 6, 7, 9)
                    .build()
                ),
            $(new SelectSort(),
              new int[] {3, 7, 4, 9, 5, 2, 6, 1},
              new ResultBuilder("Selection Sort")
                    .addStep(3, 7, 4, 1, 5, 2, 6, 9)
                    .addStep(3, 6, 4, 1, 5, 2, 7, 9)
                    .addStep(3, 2, 4, 1, 5, 6, 7, 9)
                    .addStep(3, 2, 4, 1, 5, 6, 7, 9)
                    .addStep(3, 2, 1, 4, 5, 6, 7, 9)
                    .addStep(1, 2, 3, 4, 5, 6, 7, 9)
                    .addStep(1, 2, 3, 4, 5, 6, 7, 9)
                    .build()
            ),
            $(new QuickSort(),
                    new int[]{3, 7, 4, 9, 5, 2, 6, 1},
                    new ResultBuilder("Quick Sort")
                            .addStep(3, 7, 4, 9, 5, 2, 6, 1)
                            .addStep(3, 7, 4, 1, 5, 2, 6, 9)
                            .addStep(1, 7, 4, 3, 5, 2, 6, 9)
                            .addStep(1, 4, 7, 3, 5, 2, 6, 9)
                            .addStep(1, 2, 5, 3, 7, 4, 6, 9)
                            .addStep(1, 2, 3, 5, 7, 4, 6, 9)
                            .addStep(1, 2, 3, 4, 6, 5, 7, 9)
                            .addStep(1, 2, 3, 4, 6, 5, 7, 9)
                            .build()
            )

        );
    }

    @Test
    @Parameters
    public void sort(ISort sortAlg, int[] toSort, Result expectedResult) {
        Result result = sortAlg.sort(toSort);
        System.out.println(result);
        Assert.assertEquals(result.toString(), expectedResult.toString());
    }
}
