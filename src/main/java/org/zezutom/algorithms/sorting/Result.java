package org.zezutom.algorithms.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *  Returns the sorted sequence and stores the transformation steps.
 */
public class Result {

    private String algorithm;

    private List<int[]> steps = new ArrayList<int[]>();

    public Result(String algorithm) {
        this.algorithm = algorithm;
    }

    public void addStep(int[] step) {
        steps.add(Arrays.copyOf(step, step.length));
    }

    public List<int[]> getSteps() {
        return Collections.unmodifiableList(steps);
    }

    public int[] getSorted() {
        return (steps.isEmpty()) ? new int[0] : steps.get(steps.size() - 1);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(algorithm)
                            .append(":\n")
                            .append(Arrays.toString(getSorted()))
                            .append("\n\nSteps:\n");

        for (int[] step : steps)
            sb.append(Arrays.toString(step)).append('\n');

        return sb.toString();
    }
}
