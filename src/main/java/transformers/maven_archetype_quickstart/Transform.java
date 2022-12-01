package transformers.maven_archetype_quickstart;

public interface Transform {
    
    public String forwardString(String input) throws TranformationException;
        
    public String reverseTranform(String input) throws TranformationException;

}
