package transformers.maven_archetype_quickstart;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReverseStringTransformTest {
    
    private ReverseStringTransform transform;

    @BeforeEach
    public void resetTransform() {
        transform = new ReverseStringTransform();
    }
    
    @Test
    public void forwardStringTest() throws TranformationException{
        String input = "123ABCDEFuvwxyz!!!";
        assertEquals("!!!zyxwvuFEDCBA321", transform.forwardString(input));
        
        input="helloworld";
        assertEquals("dlrowolleh", transform.forwardString(input));
    }
    
    @Test
    public void reverseStringTest() throws TranformationException{
        String input = "!!!zyxwvuFEDCBA321";
        assertEquals("123ABCDEFuvwxyz!!!", transform.reverseTranform(input));
        
        input="Software Studio";
        assertEquals("oidutS erawtfoS", transform.forwardString(input));
    }

}
