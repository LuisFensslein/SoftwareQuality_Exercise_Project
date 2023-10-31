/*
SPDX-FileCopyrightText: 2023 Luis Fenßlein
SPDX-License-Identifier: MIT

This is a test class for testing the "Math" class
 */

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class test_Math {
    private Math TestOp;

    @Before
    public void setUp() {
        TestOp = new Math();
    }

    @Test
    public void testMethod_plus() {
        Assert.assertTrue(7 == TestOp.method_for_Excercise01(3, "plus", 4) );
    }
    @Test
    public void testMethod_minus() {
        Assert.assertTrue(1 == TestOp.method_for_Excercise01(5, "minus", 4) );
    }
    @Test
    public void testMethod_multiply() {
        Assert.assertTrue(16 == TestOp.method_for_Excercise01(4, "multiply", 4) );
    }

    @Test
    public void testMethod_divide() {
        Assert.assertTrue(20 == TestOp.method_for_Excercise01(100, "divide", 5) );
    }
}

//Test
