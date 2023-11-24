import java.util.Scanner;
public class LabClassUI {
    private Student[] students;
    private int count;
    public LabClassUI() {
        count = 0;
    }
    Scanner in = new Scanner(System.in);
    public void InputStudents() {
        System.out.printf("Введите количество студентов: ");
        count = in.nextInt();
        students = new Student[count];
        System.out.println("Введите фамилию и баллы " + count + " студентов");
        for (int i = 0; i < count; i++) {
            System.out.print(i+1 + ". ");
            students[i] = new Student(i, in.next(), in.nextInt());
        }
    }
    public void OutputSortedStudents() {
        System.out.println(" Список студентов ");
        LabClass.Sort(students);
        for (int i = 0; i < count; i++) {
            System.out.print(students[i]);
        }
    }
    public void PrintStudentInfo() {
        System.out.println("Введите фамилию студента для поиска");
        String surname = in.next();
        if (surname.compareTo("") == 0) {
            throw new EmptyStringException("Empty string input detected");
        }
        System.out.println("Результат: " + LabClass.Search(students, new Student(0,surname,0)));
    }
}