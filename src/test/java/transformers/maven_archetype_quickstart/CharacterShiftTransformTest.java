package transformers.maven_archetype_quickstart;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CharacterShiftTransformTest {

    private CharacterShiftTransform transform = new CharacterShiftTransform();

    @Test
    public void testForward() throws TranformationException {
        String input = "!abc xyz??";
        assertEquals("!bcd yza??", transform.forwardString(input));
    }

    @Test
    public void testReverse() throws TranformationException {
        String input = "abcxyz";
        assertEquals("zabwxy", transform.reverseTranform(input));
    }


}
