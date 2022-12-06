package transformers.maven_archetype_quickstart;

public class ReverseStringTransform implements Transform {
    
    @Override
    public String forwardString(String input) throws TranformationException {
        return reverseString(input);
    }

    @Override
    public String reverseTranform(String input) throws TranformationException {
        return reverseString(input);
    }
    
    public String reverseString(String input) {
        String retString = "";
        char letter;
        
        for(int x = input.length()-1; x >= 0; x--) {
            letter = input.charAt(x);
            retString = retString + letter;
        }
        
        return retString;
        
    }
}