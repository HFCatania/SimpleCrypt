public class Vignere {

    public static String keyMaker(String str, String key){
        int x = str.length();
        for(int i = 0; ;i++){
            if(x == i)
                i=0;
            if(key.length() == str.length())
                break;
            key += (key.charAt(i));
        }
        return key;
    }

    public String encrypt(String str, String key){
        String encryptedText = "";

        for (int i = 0; i < str.length() ; i++) {
            int x = (str.charAt(i) + key.charAt(i)) % 26;
            x += 'A';
            encryptedText += (char)x;
        }
        return encryptedText;
    }

    public String decrypt(String encryptedText, String key){
        String decryptedText = "";

        for (int i = 0; i < encryptedText.length() && i < key.length(); i++) {
            int x = (encryptedText.charAt(i) - key.charAt(i) +26) % 26;
            x += 'A';
            decryptedText += (char) x;
        }
        return decryptedText;
    }
}
