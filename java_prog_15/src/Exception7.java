import java.util.Scanner;
public class Exception7 {
    public void getKey() {
        Scanner myScanner = new Scanner( System.in );
        String key = myScanner.next();
        printDetails( key );
    }
    public void printDetails(String key) {
        try {
            String message = getDetails(key);
            System.out.println( message );
        } catch (Exception e){
            throw e;
        }
    }
    private String getDetails(String key) {
        if(key.compareTo("") == 0) {
            try {
                throw new Exception("Key set to empty string");
            } catch (Exception e) {
                System.out.println(e + " catched");
            }
        }
        return "data for " + key;
    }
}