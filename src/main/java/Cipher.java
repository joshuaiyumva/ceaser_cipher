public class Cipher {
    public static final String myAlphabets = "abcdefghijklmnopqrstuvwxyz";
    public static String encryption(String plainText, int myKey){
        plainText = plainText.toLowerCase();
        String cipherText = "";
//        if (myKey > 26){
//            myKey = (myKey % 26);
//        }
//        else if(myKey <0){
//            myKey = (myKey % 26)+26;
//        }
        for (int j = 0; j< plainText.length(); j++){
            int myPosition = myAlphabets.indexOf(plainText.charAt(j));
            int myKeyValue = (myKey + myPosition) % 26;
            char myValues = myAlphabets.charAt(myKeyValue);
            cipherText += myValues;
        }
        return cipherText;
    }
}
