package creatingclasses;

public class CipherDicipherTest {
    public static void main(String[] args) {
        CipherDicipher myWord = new CipherDicipher();
        String ciphered = myWord.cipher();
        System.out.println(ciphered);
        System.out.println(myWord.deCipher());
    }

}
