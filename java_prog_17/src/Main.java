import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String INN, FIO;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ФИО");
        FIO = in.nextLine();
        System.out.println("Введите номер ИНН");
        INN = in.next();
        if(INN.length()!=12){
            throw new IllegalArgumentException("INN is incorrect");
        }
    }
}