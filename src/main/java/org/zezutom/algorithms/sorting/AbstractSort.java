package org.zezutom.algorithms.sorting;

/**
 * Implements shared functionality
 */
public abstract class AbstractSort implements ISort {

    protected abstract void sort(Result result, int... x);

    @Override
    public Result sort(int... x) {
        Result result = new Result(getName());

        if (x == null || x.length == 0)
            return result;
        sort(result, x);
        return result;
    }
}
