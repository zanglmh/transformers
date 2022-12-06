package transformers.maven_archetype_quickstart;

public class CharacterShiftTransform implements Transform{

    @Override
    public String forwardString(String input) throws TranformationException {
//        String shifted = "";

        for(char c : input.toCharArray()){
            if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')){
                if(c == 'z'){
                    shifted += 'a';
                }else if(c == 'Z') {
                    shifted += 'A';
                }else{
                    shifted += ++c;
                }
            }else{
                shifted += c;
            }
        }
        return shifted;
    }

    @Override
    public String reverseTranform(String input) throws TranformationException {
//        String shifted = "";

        for(char c : input.toCharArray()){
            if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')){
                if(c == 'a'){
                    shifted += 'z';
                }else if(c == 'A') {
                    shifted += 'Z';
                }else{
                    shifted += --c;
                }
            }else{
                shifted += c;
            }
        }
        return shifted;
    }

}
