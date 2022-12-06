package transformers.maven_archetype_quickstart;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CharacterShiftTransformTest {

    private Transform transform;


    @Test
    public void testForwardTransformWithWrapAndNonAlpha() throws TranformationException {
        String input = "!abc xyz??";
        assertEquals("!bcd yza??", transform.forwardTransform(input));
    }

    @Test
    public void testReverseTransformWithWrap() throws TranformationException {
        String input = "abcxyz";
        assertEquals("zabwxy", transform.reverseTransform(input));
    }


}
