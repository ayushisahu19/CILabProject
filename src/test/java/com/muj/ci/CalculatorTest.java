package test.java.com.muj.ci;

import main.java.com.muj.ci.Calculator;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator c = new Calculator();
        assertEquals(5, c.add(2, 3));
    }

    private void assertEquals(int i, int j) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'assertEquals'");
    }
}
