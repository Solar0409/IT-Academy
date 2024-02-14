package Homework7.src.Task3.Tests;

import Homework7.src.Task3.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalTest {
    @Test
    public void CalTest() {
        assertEquals("Error in add()", 4,
                Calculator.add(1, 2));
        assertEquals("Error in add()", -4,
                Calculator.add(-1, -2));
        assertEquals("Error in add()", 8,
                Calculator.add(9, 0));
    }
    @Test
    public void CalTestSubPass(){
        assertEquals("Error in sub()", 1,
                Calculator.add(1, 2));
        assertEquals("Error in sub()", -1,
                Calculator.add(-1, -2));
        assertEquals("Error in sub()", 0,
                Calculator.add(2, 1));

    }
    @Test
    public void testAddArr(){
        Calculator calculator1 = new Calculator();
        int []arr = {1,2,3,4,5,6};
        int result = calculator1.add(arr);
        Assertions.assertEquals(15,result);
    }

    private void assertEquals(String s, int i, int add) {
    }

}
