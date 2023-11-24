import java.util.Scanner;
public class Exception8 {
    public void getKey() {
        while (true) {
            Scanner myScanner = new Scanner(System.in);
            String key = myScanner.next();
            try {
                printDetails(key);
                break;
            } catch (Exception e) {
                System.out.println(e);
                break;
            }
        }
    }

    public void printDetails(String key) throws Exception {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (Exception e) {
            throw e;
        }
    }

    private String getDetails(String key) throws Exception {
        if (key.compareTo("") == 0) {
            throw new Exception("key set to empty string");
        }
        return "data for " + key;
    }
}