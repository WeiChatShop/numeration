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

        return excute(minOfArrOperation,arrs);
    }

    public int maxOfArr(int ... arrs) {

        return excute(maxOfArrOperation,arrs);
    }

    public int countOfArr(int ...arrs) {

        return arrs.length;
    }

    public int sumOfArr(int ...arrs) {

        return excute(sumOfArrOperation,arrs);
    }

    public double averageOfArr(int ... arrs) {
        return excute(sumOfArrOperation,arrs) * 1.0 / arrs.length;
    }

    private int excute(Operation operation,int ...  arrs){
        if (arrs.length <=0 ){
            throw new IllegalArgumentException("input number nust not be null !");
        }

        int returnValue = arrs[0];
        for (int i = 1; i < arrs.length; i++){
            returnValue = operation.operationPredicate(returnValue,arrs[i]);
        }

        return returnValue;
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
