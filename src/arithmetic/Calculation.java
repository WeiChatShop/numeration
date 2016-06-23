package arithmetic;

import arithApi.Operation;

/**
 * Created by zhaomingwei on 16/6/19.
 */
public class Calculation {

    public int minOfArr(Operation operation,int... arrs) {

        if (arrs.length <=0 ){
            throw new IllegalArgumentException("input number nust not be null !");
        }

        int minValue = arrs[0];

        for (int i = 1; i < arrs.length; i++){
            minValue = operation.operationPredicate(arrs[i],minValue);
        }

        return minValue;
    }

    public int maxOfArr(Operation operation,int ... arrs) {

        if (arrs.length <=0 ){
            throw new IllegalArgumentException("input number nust not be null !");
        }

        int maxValue = arrs[0];

        for (int i = 1; i < arrs.length; i++){
            maxValue = operation.operationPredicate(arrs[i],maxValue);
        }

        return maxValue;
    }

    public int countOfArr(int ...arrs) {

        return arrs.length;
    }

    public int sumOfArr(Operation operation,int ...arrs) {

        int sumValue = 0;

        for (int i = 0; i < arrs.length; i++){
            sumValue = operation.operationPredicate(arrs[i],sumValue);
        }
        return sumValue;
    }

    public double averageOfArr(Operation operation,int ... arrs) {

        int sumValue = 0;
        if (arrs.length == 0){
            return 0.0;
        }

        for (int i = 0; i < arrs.length; i++){
            sumValue = operation.operationPredicate(arrs[i],sumValue);
        }

        return sumValue * 1.0 / arrs.length;
    }
}
