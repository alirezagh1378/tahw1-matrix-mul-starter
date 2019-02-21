/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ir.ac.kntu.style;

import ir.ac.kntu.MatrixSolution;
import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * 25 points
 * @author mhrimaz
 */
public class SolutionTest {
    static {
        System.err.println("$$$GRADER$$$ | { type:\"MSG\" , key:\"TOTAL\" , value:50, priority:1  }  | $$$GRADER$$$");
    }
    @Test
    public void test1() {
        int[][] a = {{1, 2, 3},
        {4, 5, 6},
        {9, 1, 3}
        };
        int[][] result = {{36, 15, 24}, {78, 39, 60}, {40, 26, 42}};
        assertTrue(Arrays.deepEquals(MatrixSolution.multiply(a, a), result));
        System.err.println("$$$GRADER$$$ | { type:\"SCORE\" , amount:6 , reason:\"Test Passed.\" } | $$$GRADER$$$" );
    }

    @Test
    public void test2() {
        int[][] a = {{1, 2, 3},
        {4, 5, 6}
        };
        int[][] b = {{1, 2, 3},
        {4, 5, 6},
        {9, 1, 3}
        };
        int[][] result = {{36, 15, 24}, {78, 39, 60}};
        assertTrue(Arrays.deepEquals(MatrixSolution.multiply(a, b), result));
        System.err.println("$$$GRADER$$$ | { type:\"SCORE\" , amount:6 , reason:\"Test Passed.\" } | $$$GRADER$$$" );
    }

    @Test
    public void test3() {
        int[][] a = {{1, 2, 3},
        {4, 5, 6},
        {9, 1, 3}
        };
        int[][] b = {{1, 2, 3},
        {4, 5, 6}
        };

        assertNull(MatrixSolution.multiply(a, b));
        System.err.println("$$$GRADER$$$ | { type:\"SCORE\" , amount:6 , reason:\"Test Passed.\" } | $$$GRADER$$$" );
    }

    @Test
    public void test4() {
        int[][] a = {{1, 2, 3, 5},
        {4, 5, 6, 8}
        };
        int[][] b = {{1, 2, 3},
        {4, 5, 6},
        {9, 1, 3},
        {9, 1, 3}
        };
        int[][] result = {{81, 20, 39}, {150, 47, 84}};
        assertTrue(Arrays.deepEquals(MatrixSolution.multiply(a, b), result));
        System.err.println("$$$GRADER$$$ | { type:\"SCORE\" , amount:7 , reason:\"Test Passed.\" } | $$$GRADER$$$" );
    }
}
