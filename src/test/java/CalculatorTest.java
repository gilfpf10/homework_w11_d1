import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CalculatorTest {

    Calculator calculator;

@Before
    public void before(){
    calculator = new Calculator (7, 2);


}

@Test
    public void getNum1(){
    assertEquals(7, calculator.getNum1());
}

@Test
    public void getNum2(){
    assertEquals(2, calculator.getNum2());

}

@Test
    public void subtraction(){
    assertEquals(5, calculator.subtraction());
}

@Test
    public void addition(){
    assertEquals(9, calculator.addition());

}

@Test
    public void multiply (){
    assertEquals(14, calculator.multiply());

}

}
