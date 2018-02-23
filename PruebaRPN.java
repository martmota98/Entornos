package calculadora;

import org.junit.Test;

import junit.framework.TestCase;
import calculadora.RPN;

public class PruebaRPN extends TestCase {
    RPN rpn = new RPN("5 1 *");
     @Test
        public void test() {

            assertEquals(5.0, rpn.resultado());
        }
}