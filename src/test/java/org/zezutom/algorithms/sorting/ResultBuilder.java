package org.zezutom.algorithms.sorting;

public class ResultBuilder {

    private Result result;

    public ResultBuilder(String algorithm) {
        result = new Result(algorithm);
    }
    public ResultBuilder addStep(int... step) {
        result.addStep(step);
        return this;
    }

    public Result build() {
        return result;
    }
}
