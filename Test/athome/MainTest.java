package athome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private static final double EPS = 1e-6;

    @Test
    void testCalcY() {
        System.out.println("calcY (2.8, -0.3, 4.0, 0)");
        double a = 2.8;
        double b = -0.3;
        double c = 4;
        double x = 0.0;
        Main instance = new Main();
        double expResult = 4.0;
        double result = instance.calcY(a, b, c, x);
        assertEquals(expResult, result, EPS);
    }

    @Test
    void testCalcY0() {
        System.out.println("calcY (2.8, -0.3, 4.0, 1.4)");
        double a = 2.8;
        double b = -0.3;
        double c = 4;
        double x = 1.4;
        Main instance = new Main();
        double expResult = 3.720465;
        double result = instance.calcY(a, b, c, x);
        assertEquals(expResult, result, EPS);
    }

    @Test
    void testCalcY1() {
        System.out.println("calcY (2.8, -0.3, 4.0, 2.0)");
        double a = 2.8;
        double b = -0.3;
        double c = 4;
        double x = 2.0;
        Main instance = new Main();
        double expResult = 0.983869;
        double result = instance.calcY(a, b, c, x);
        assertEquals(expResult, result, EPS);
    }
}