import org.junit.Assert;
import org.junit.Test;
import org.junit.internal.runners.JUnit38ClassRunner;
import org.junit.runner.RunWith;

import javax.naming.OperationNotSupportedException;
import java.util.NoSuchElementException;

/**
 * Created by Maheshwar Muttal on 3/4/2017.
 */

public class CalcTestRunner {
    private static CalcTestRunner ourInstance = new CalcTestRunner();

    public static CalcTestRunner getInstance() {
        return ourInstance;
    }

    @Test
    public  void addTwoNumbers() throws OperationNotSupportedException{
        RPNCalculator rpnCalculator = new RPNCalculator();
        Assert.assertEquals(3 , rpnCalculator.doCalculation("1,2,+"));


    }

    @Test
    public  void minusTwoNumbers() throws OperationNotSupportedException{
        RPNCalculator rpnCalculator = new RPNCalculator();
        Assert.assertEquals(1 , rpnCalculator.doCalculation("1,2,-"));
    }


    @Test
    public  void multiplyTwoNumbers() throws OperationNotSupportedException{
        RPNCalculator rpnCalculator = new RPNCalculator();
        Assert.assertEquals(2 , rpnCalculator.doCalculation("1,2,*"));
    }

    @Test
    public  void divideTwoNumbers() throws OperationNotSupportedException{
        RPNCalculator rpnCalculator = new RPNCalculator();
        Assert.assertEquals(2 , rpnCalculator.doCalculation("1,2,/"));
    }


    @Test(expected=OperationNotSupportedException.class)
    public  void noOperatorGiven() throws OperationNotSupportedException{
        RPNCalculator rpnCalculator = new RPNCalculator();
        rpnCalculator.doCalculation("1,2,3");
    }


    @Test(expected=NoSuchElementException.class)
    public  void operatorNull() throws OperationNotSupportedException{
        RPNCalculator rpnCalculator = new RPNCalculator();
        rpnCalculator.doCalculation("1,2,");
    }
}
