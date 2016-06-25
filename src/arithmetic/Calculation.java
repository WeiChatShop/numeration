package arithmetic;

import arithApi.Operation;

/**
 * Created by zhaomingwei on 16/6/19.
 */
public class Calculation {

    private final Operation minOfArrOperation = new MinOfArrOperation();
    private final Operation maxOfArrOperation = new MaxOfArrOperation();
    private final Operation sumOfArrOperation = new SumOfArrOperation();

    public int minOfArr(int... arrs) {

        if (arrs.length <=0 ){
            throw new IllegalArgumentException("input number nust not be null !");
        }

        int minValue = arrs[0];

        for (int i = 1; i < arrs.length; i++){
            minValue = minOfArrOperation.operationPredicate(arrs[i],minValue);
        }

        return minValue;
    }

    public int maxOfArr(int ... arrs) {

        if (arrs.length <=0 ){
            throw new IllegalArgumentException("input number nust not be null !");
        }

        int maxValue = arrs[0];

        for (int i = 1; i < arrs.length; i++){
            maxValue = maxOfArrOperation.operationPredicate(arrs[i],maxValue);
        }

        return maxValue;
    }

    public int countOfArr(int ...arrs) {

        return arrs.length;
    }

    public int sumOfArr(int ...arrs) {

        int sumValue = 0;

        for (int i = 0; i < arrs.length; i++){
            sumValue = sumOfArrOperation.operationPredicate(arrs[i],sumValue);
        }
        return sumValue;
    }

    public double averageOfArr(int ... arrs) {

        int sumValue = 0;
        if (arrs.length == 0){
            return 0.0;
        }

        for (int i = 0; i < arrs.length; i++){
            sumValue = sumOfArrOperation.operationPredicate(arrs[i],sumValue);
        }

        return sumValue * 1.0 / arrs.length;
    }

    private static class MinOfArrOperation implements Operation {
        public int operationPredicate(int num1, int num2) {
            return num1 < num2 ? num1 : num2;
        }
    }

    private static class MaxOfArrOperation implements Operation {
        public int operationPredicate(int num1, int num2) {
            return num1 > num2 ? num1 : num2;
        }
    }

    private static class SumOfArrOperation implements Operation{
        public int operationPredicate(int num1, int num2) {
            return num1 + num2;
        }
    }


}
