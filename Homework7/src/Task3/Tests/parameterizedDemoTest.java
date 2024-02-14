package Homework7.src.Task3.Tests;

import Homework7.src.Task3.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class parameterizedDemoTest {
    Calculator calculator = new Calculator();
    @ParameterizedTest
    @ValueSource(ints = {1,2,3,4,5,6})
    void testCase1(int arg){
        Assertions.assertTrue(arg>0);
        Assertions.assertTrue(calculator.isSumAllowed(arg));
    }




}
