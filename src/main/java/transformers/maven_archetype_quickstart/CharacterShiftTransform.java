package transformers.maven_archetype_quickstart;

public class CharacterShiftTransform implements Transform{

    @Override
    public String forwardString(String input) throws TranformationException {
        int len = input.length();
        String shifted = "";
        char[] chars = new char[len];

        for(int i = 0 ; i < len ; i++){
            char c = input.charAt(i);
            chars[i] = c;
        }

        for(char c : input.toCharArray()){
            if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')){
                if(c == 'z'){
                    shifted += 'a';
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
        int len = input.length();
        String shifted = "";
        char[] chars = new char[len];

        for(int i = 0 ; i < len ; i++){
            char c = input.charAt(i);
            chars[i] = c;
        }

        for(char c : input.toCharArray()){
            if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')){
                if(c == 'a'){
                    shifted += 'z';
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
