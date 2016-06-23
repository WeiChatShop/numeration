package test;


import arithApi.Operation;
import arithmetic.Calculation;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/**
 * Created by zhaomingwei on 16/6/18.
 */
public class ArithmeticTest extends TestCase {
    private Calculation operation = new Calculation();
    public void testTheMinOfArr(){
        int minValue = operation.minOfArr(1,-1,-6);
        assertEquals(minValue,-6);
    }

    public void testTheMaxOfArr(){
        int maxValue = operation.maxOfArr(1, 2, -2);
        assertEquals(maxValue,2);
    }

    public void testCountOfArr(){
        int arrsCount = operation.countOfArr(1, 2, 3, 2, 1);
        assertEquals(arrsCount,5);
    }

    public void testSumOfArr(){
        int sumOfArrValue = operation.sumOfArr(1, 2, 3, 4);
        assertEquals(sumOfArrValue,10);
    }

    public void testAverageOfArr(){
        double averOfArrValue = operation.averageOfArr(1,2,3,4);
        assertEquals(averOfArrValue,2.5);
    }


}
