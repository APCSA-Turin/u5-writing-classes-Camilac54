public class KeyGenerator {
//Utility?
    private Key key;
 
    public KeyGenerator(String seed) {
        key = new Key(shift(seed));
    }
 
    public Key getKey() {
        return key;
    }
 
    private String shift(String s) {
        return s.substring(1) + s.substring(0, 1);
    }
    
    public static String ltr (String Letter) {
        return Letter + "'s";
    }

}
 