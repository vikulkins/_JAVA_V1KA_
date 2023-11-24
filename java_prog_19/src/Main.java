import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] arrString = {"first", "second", "third"};
        Integer[] arrInt = {10, 9, 87, 654, 32, 1, 0};
        Array arrays = new Array();
        List<String> listString = arrays.convert(arrString);
        List<Integer> listInt = arrays.convert(arrInt);
        System.out.println("List of string:");
        for (String s: listString) {
            System.out.println(s);
        }
        System.out.println("List of integer:");
        for (int s: listInt) {
            System.out.println(s);
        }

        arrays.setArrStorage(arrString);
        arrays.setArrStorage(arrInt);

        System.out.println("3 index");
        System.out.println(arrays.getElement(3));
        System.out.println("9 index");
        System.out.println(arrays.getElement(9));

        System.out.println("\nFrom file to list:");
        List<String> catalog = arrays.save("D:\\джава\\текст.txt");

        Solution<String, Integer, Character> solution1 = new Solution<>("string", 1, 'c');
        solution1.newArrayList(arrString);
        Solution<Integer, String, Integer> solution2 = new Solution<>(7, "7", 7);
        solution2.newHashSet(arrInt);
        solution2.newHashMap(arrInt, arrString);
    }
}