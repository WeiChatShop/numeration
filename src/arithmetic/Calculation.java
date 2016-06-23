package arithmetic;

import arithApi.Operation;

/**
 * Created by zhaomingwei on 16/6/19.
 */
public class Calculation {

    public int minOfArr(int... arrs) {

        if (arrs.length <=0 ){
            throw new IllegalArgumentException("input number nust not be null !");
        }

        int minValue = arrs[0];

        for (int i = 1; i < arrs.length; i++){
            if (minValue > arrs[i]){
                minValue = arrs[i];
            }
        }

        return minValue;
    }

    public int maxOfArr(int ... arrs) {

        if (arrs.length <=0 ){
            throw new IllegalArgumentException("input number nust not be null !");
        }

        int minValue = arrs[0];

        for (int i = 1; i < arrs.length; i++){
            if (minValue < arrs[i]){
                minValue = arrs[i];
            }
        }


        return minValue;
    }

    public int countOfArr(int ...arrs) {

        return arrs.length;
    }

    public int sumOfArr(int ...arrs) {

        int sumValue = 0;

        for (int i = 0; i < arrs.length; i++){
            sumValue += arrs[i];
        }
        return sumValue;
    }

    public double averageOfArr(int ... arrs) {

        int sumValue = 0;
        if (arrs.length == 0){
            return 0.0;
        }

        for (int i = 0; i < arrs.length; i++){
            sumValue += arrs[i];
        }

        return sumValue * 1.0 / arrs.length;
    }
}
