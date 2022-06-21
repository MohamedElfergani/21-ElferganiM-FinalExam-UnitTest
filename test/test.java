import org.junit.Assert;
import org.junit.Test;

import finalexam.src.StringCalculator;

public class test {
    @Test
    public final void NegNumbersException() { 
        RuntimeException negException = null; 
        try { 
            StringCalculator.add("-1,5"); 
        } catch (RuntimeException e) { 
            negException = e; 
        }
        Assert.assertEquals("negatives not allowed.", negException.getMessage());;
    }

    @Test 
    public final void NumMoreThan1000Ignore() { 
        int testingNum = StringCalculator.add("1,1000"); 
        Assert.assertEquals(1000+2, testingNum);
    }
}
