package arithmetic;

import arithApi.Operation;

/**
 * Created by zhaomingwei on 16/6/19.
 */
public class Calculation {

    public int minOfArr(int... arrs) {

        return excute((v1,v2) -> v1<v2 ? v1:v2,arrs);
    }

    public int maxOfArr(int ... arrs) {

        return excute( (v1,v2)-> v1>v2 ? v1:v2 ,arrs);
    }

    public int countOfArr(int ...arrs) {

        return arrs.length;
    }

    public int sumOfArr(int ...arrs) {

        return excute((v1,v2) -> v1+v2,arrs);
    }

    public double averageOfArr(int ... arrs) {
        return excute((v1,v2)->v1+v2,arrs) * 1.0 / arrs.length;
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



}
