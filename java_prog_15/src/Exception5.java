public class Exception5 {
    public void getDetails(String key) {
        if (key == null) {
            try {
                throw new NullPointerException("null key in getDetails");
            } catch (NullPointerException e) {
                System.out.println("Key is null");
            }
        }
    }
}