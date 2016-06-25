package test;


import arithApi.Operation;
import arithmetic.Calculation;
import junit.framework.TestCase;

/**
 * Created by zhaomingwei on 16/6/18.
 */
public class ArithmeticTest extends TestCase {
    private Calculation operation = new Calculation();
    public void testTheMinOfArr(){
        int minValue = operation.minOfArr(new Operation() {
            public int operationPredicate(int num1, int num2) {
                return num1 < num2 ? num1 : num2;
            }
        },1, -1, -6);
        assertEquals(minValue,-6);
    }

    public void testTheMaxOfArr(){
        int maxValue = operation.maxOfArr(new Operation() {
            public int operationPredicate(int num1, int num2) {
                return num1 > num2 ? num1 : num2;
            }
        },
            1, 2, -2);
        assertEquals(maxValue,2);
    }

    public void testCountOfArr(){
        int arrsCount = operation.countOfArr(1, 2, 3, 2, 1);
        assertEquals(arrsCount,5);
    }

    public void testSumOfArr(){
        int sumOfArrValue = operation.sumOfArr(new Operation() {
            public int operationPredicate(int num1, int num2) {
                return num1 + num2;
            }
        },1, 2, 3, 4);
        assertEquals(sumOfArrValue,10);
    }

    public void testAverageOfArr(){
        double averOfArrValue = operation.averageOfArr(new Operation() {
            public int operationPredicate(int num1, int num2) {
                return num1 + num2;
            }
        },1,2,3,4);
        assertEquals(averOfArrValue,2.5);
    }


}
