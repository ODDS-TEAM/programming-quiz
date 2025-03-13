import org.example.TestOdde;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzbuzzTest {
    @Test
    public void testFizz() {
        TestOdde calculator = new TestOdde();
        String result = calculator.fizzBuzzBazz(3);
        assertEquals("3 should equal Fizz", result, "Fizz");
    }

    @Test
    public void testBuzz() {
        TestOdde calculator = new TestOdde();
        String result = calculator.fizzBuzzBazz(5);
        assertEquals("5 should equal Buzz", result, "Buzz");
    }

    @Test
    public void testFizzBuzz() {
        TestOdde calculator = new TestOdde();
        String result = calculator.fizzBuzzBazz(15);
        assertEquals("15 should equal FizzBuzz", result, "FizzBuzz");
    }

    @Test
    public void testBazz() {
        TestOdde calculator = new TestOdde();
        String result = calculator.fizzBuzzBazz(7);
        assertEquals("7 should equal Bazz", result, "Bazz");
    }

    @Test
    public void testNumber() {
        TestOdde calculator = new TestOdde();
        String result = calculator.fizzBuzzBazz(8);
        assertEquals("8 should equal 8", result, "8");
    }

    @Test
    public void testZero() {
        TestOdde calculator = new TestOdde();
        String result = calculator.fizzBuzzBazz(0);
        assertEquals("0 should equal FizzBuzzBazz", result, "FizzBuzzBazz");
    }

    @Test
    public void testNegativeNumber() {
        TestOdde calculator = new TestOdde();
        String result = calculator.fizzBuzzBazz(-3);
        assertEquals("-3 should equal Fizz", result, "Fizz");
    }

    @Test
    public void testBuzzBazz() {
        TestOdde calculator = new TestOdde();
        String result = calculator.fizzBuzzBazz(35);
        assertEquals("35 should equal BuzzBazz", result, "BuzzBazz");
    }

    @Test
    public void testFizzBazz() {
        TestOdde calculator = new TestOdde();
        String result = calculator.fizzBuzzBazz(21);
        assertEquals("21 should equal FizzBazz", result, "FizzBazz");
    }


}
