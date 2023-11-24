import java.io.*;
import java.util.Scanner;


public class FileApp {
    public static void main(String[] args) {
        System.out.println("введите текст для записи в файл");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        try(FileWriter writer = new FileWriter("D:\\1.txt", false)) {
            writer.write(str);
            writer.append('\n');
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }

        System.out.println("текст успешно записан в файл\nпроивзодим чтение текста из файла");

        try(FileReader reader = new FileReader("D:\\1.txt"))
        {
            int c;
            while((c=reader.read())!=-1){
                System.out.print((char)c);
            }
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }

        System.out.println("введите текст для замены записи в файле");
        str = in.nextLine();

        File file = new File("D:\\1.txt");
        try (FileWriter writer = new FileWriter(file)) {
            writer.write("");
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        try(FileWriter writer = new FileWriter("D:\\1.txt", false)) {
            writer.write(str);
            writer.append('\n');
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }

        System.out.println("введите текст для записи в конец исходного файла");
        str = in.nextLine();
        try(FileWriter writer = new FileWriter("D:\\1.txt", true)) {
            writer.write(str);
            writer.append('\n');
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }


    }
}