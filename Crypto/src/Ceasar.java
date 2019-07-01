public class Ceasar {
    public String encrypt(String word) {
        int shift = 3;
        String text = "";
        for( int i = 0; i < word.length(); i++){
            char alphabet = word.charAt(i);
            if((alphabet >= 'a' && alphabet <= 'z') ||(alphabet >= 'A' && alphabet <= 'Z')){
                alphabet = (char)(alphabet + shift);
                if (alphabet > 'z'){
                    alphabet = (char)(alphabet+'a'-'z'-1);
                } else if(alphabet > 'Z' &&alphabet<'a'){
                    alphabet = (char)(alphabet+'A'-'Z'-1);
                }
                text += alphabet;


            }
        }
        return text;
    }
}
