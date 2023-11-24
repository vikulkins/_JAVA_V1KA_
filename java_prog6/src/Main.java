import java.util.Scanner;

public class Main {
    public static void Sort(Student[] students) {
        for (int i = 1; i < students.length; i++) {
            Student temp = students[i];
            int j = i - 1;
            while (j>=0 && students[j].IDNumber > temp.IDNumber){
                students[j+1]=students[j];
                j--;
            }
            students[j+1]=temp;
        }
    }
    public static void mergeSort(Student[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }
    public static void merge(Student[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        Student[] leftArr = new Student[n1];
        Student[] rightArr = new Student[n2];
        for (int i = 0; i < n1; i++) leftArr[i] = arr[left + i];
        for (int j = 0; j < n2; j++) rightArr[j] = arr[mid + 1 + j];
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArr[i].GPA <= rightArr[j].GPA) arr[k++] = leftArr[i++];
            else arr[k++] = rightArr[j++];
        }
        while (i < n1) arr[k++] = leftArr[i++];
        while (j < n2) arr[k++] = rightArr[j++];
    }

    /*public static Student[] mergeSort(Student[] students1, Student[] students2, SortingStudentsByGPA sorter){
        int len1 = students1.length;
        int len2 = students2.length;
        Student[] result = new Student[len1 + len2];
        int i=0,j=0,k=0;
        while (i<len1 && j<len2){
            if (sorter.compare(students1[i],students2[j])>=0) result[k++]=students1[i++];
            else result[k++]=students2[j++];
        }
        while (i<len1) result[k++]=students1[i++];
        while (j<len2) result[k++]=students2[j++];
        return result;
    }*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество студентов: ");
        int n = 0;
        if (sc.hasNextInt()) n = sc.nextInt();
        Student[] students = new Student[n];
        Student[] students2 = new Student[n];
        System.out.println("Введите информацию о " + n + " студентах");
        for (int i = 0; i < n; i++) {
            System.out.println("студент № " + (i+1));
            System.out.print("имя: ");
            String name = sc.next();
            System.out.print("ID: ");
            int ID = sc.nextInt();
            System.out.print("GPA: ");
            int GPA = sc.nextInt();
            students[i] = new Student(ID,name,GPA);
        }
        Sort(students);
        System.out.println("Отсортированный массив ID студентов");
        for (int i = 0; i < n; i++) System.out.println(students[i]);

        SortingStudentsByGPA sort = new SortingStudentsByGPA();
        sort.quickSort(students, 0, students.length-1);
        System.out.println("Отсортированный массив GPA студентов");
        for (int i = 0; i < n; i++) System.out.println(students[i]);

        System.out.println("Введите информацию о " + n + " студентах");
        for (int i = 0; i < n; i++) {
            System.out.println("студент № " + (i+1));
            System.out.print("имя: ");
            String name = sc.next();
            System.out.print("ID: ");
            int ID = sc.nextInt();
            System.out.print("GPA: ");
            int GPA = sc.nextInt();
            students2[i] = new Student(ID,name,GPA);
        }

        int len = students.length;
        int len2 = students2.length;
        Student[] sortedStudentArray = new Student[len + len2];

        for (int i = 0; i < n; i++) sortedStudentArray[i]=students[i];
        for (int i = 0; i < n; i++) sortedStudentArray[n+i]=students2[i];

        mergeSort(sortedStudentArray,0,sortedStudentArray.length-1);
        System.out.println("Отсортированный список массивов студентов");
        for (int i = 0; i < 2*n; i++) System.out.println(sortedStudentArray[i]);
    }
}