package creatingclasses;

public class CipherDicipher {
    private String toCipher;
    private int shift;

    CipherDicipher(){
        this.toCipher="ABC";
        this.shift=1;
    }
    CipherDicipher(String toCipher,int shift){
        this.toCipher=toCipher;
        this.shift=shift;
    }
    public int getShift() { return shift; }
    public String getToCipher(){
        return toCipher;
    }
    public void displayCurrentString(){
        System.out.println(this.toCipher);
    }
    public String cipher(){
        String ciphered="";
        int temp;
        for(int i=0 ; i<this.toCipher.length();i++){
            ciphered = ciphered + this.toCipher.charAt(i)+this.shift;
        }
        return ciphered;
    }
    public String deCipher(){
        String deCiphered="";
        int temp;
        for(int i=0 ; i<this.toCipher.length();i++){
            temp = this.toCipher.charAt(i);
            temp = temp-this.shift;
            deCiphered = deCiphered+ (char) temp;
        }
        return deCiphered;
    }


}
