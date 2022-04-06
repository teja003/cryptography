public class CeaserCipher {
    public static void encrypt(String plainText, int key){
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        String ciphertext = "";
        for(int i=0;i<plainText.length();i++){
             int pl = alphabets.indexOf(plainText.charAt(i));
             int c = (pl + key) % 26;
             char myletter = alphabets.charAt(c);
            ciphertext+=myletter;
        }
        System.out.println(ciphertext);
    }
    
    public static void decrypt(String cipherText, int key){
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        String plainText="";
        for(int i=0;i<cipherText.length();i++){
            int cl = alphabets.indexOf(cipherText.charAt(i));
            int p = (cl - key)%26;
            if(p<0){
                p=p+26;
            }
            char myl = alphabets.charAt(p);
            plainText+=myl;
        }
        System.out.println(plainText);
    }
    
    public static void main(String args[]) {
        encrypt("hello",12);
        decrypt("oxmeedaay",12);
    }
}