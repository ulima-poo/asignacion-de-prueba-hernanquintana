import org.junit.Assert;
import org.junit.Test;


public class TestCalculadora {
    @Test
    public void testSuma(){
        Calculadora c = new Calculadora();
        Assert.assertEquals(c.sumar(5,5), 11);
    }
}
