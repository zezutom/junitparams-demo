package org.zezutom.algorithms.sorting;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class ExternalizedSortTest {

    @Test
    @Parameters(source = SortDataProvider.class)
    public void sort(ISort sortAlg, int[] toSort, Result expectedResult) {
        Result result = sortAlg.sort(toSort);
        System.out.println(result);
        Assert.assertEquals(result.toString(), expectedResult.toString());
    }

}
