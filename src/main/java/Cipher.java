public class Cipher {
    public static final String myAlphabets = "abcdefghijklmnopqrstuvwxyz";
    public static String encryption(String plainText, int myKey){
        plainText = plainText.toLowerCase();
        String cipherText = "";
        for (int j = 0; j< plainText.length(); j++){
            int myPosition = myAlphabets.indexOf(plainText.charAt(j));
            int myKeyValue = (myKey + myPosition) % 26;
            char myValues = myAlphabets.charAt(myKeyValue);
            cipherText += myValues;
        }
        return cipherText;
    }
    public static String decryption(String cipherText, int myKey){
        cipherText = cipherText.toLowerCase();
        String plainText = "";
        for(int j = 0; j<cipherText.length(); j++){
            int myPosition = myAlphabets.indexOf(cipherText.charAt(j));
            int myKeyValues = (myPosition - myKey) % 26;
            if (myKeyValues < 0) {
                myKeyValues = myAlphabets.length()+myKeyValues;
            }
            char myValues = myAlphabets.charAt(myKeyValues);
            plainText += myValues;
        }
        return plainText;

    }
}
