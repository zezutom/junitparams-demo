package org.zezutom.algorithms.sorting;

/**
 *  Sorting contract
 */
public interface ISort {

    String getName();

    Result sort(int... x);
}
