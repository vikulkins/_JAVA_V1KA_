import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Main {
    public static int fact(int num) {
        if (num == 0)
            return 1;
        else return num*fact(num-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер: ");
        int n = 0;
        if (sc.hasNextInt()) //проверка считывания целого числа с клавы
            n = sc.nextInt(); //считывание числа из потока
        int[] arr1 = new int[n];
        System.out.print("Введите " + n + " элементов массива: ");
        for (int i = 0; i < n; i++)
            if (sc.hasNextInt()) arr1[i] = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum += arr1[i];
        System.out.println("Сумма элементов массива: " + sum);
        double avrg = (double) sum / n;
        System.out.println("Среднее значение элементов массива: " + avrg);
        int[] arr2 = new int[n];
        System.out.print("Введите " + n + " элементов массива: ");
        int j = 0;
        do {
            arr2[j] = sc.nextInt();;
            j++;
        } while (j<n);
        sum = 0;
        j = 0;
        while (j<n)
        {
            sum += arr2[j];
            j++;
        }
        System.out.println("Сумма элементов массива: " + sum);
        int min = arr2[0];
        int max = arr2[0];
        j = 0;
        while (j<n)
        {
            if (arr2[j]<=min) min = arr2[j];
            if (arr2[j]>=max) max = arr2[j];
            j++;
        }
        System.out.println("Минимальный элемент массива: " + min);
        System.out.println("Максимальный элемент массива: " + max);
        System.out.print("Аргументы цикла for: ");
        for (int i = 0; i < n; i++)
            System.out.print(i + " ");
        System.out.print("\nПервые 10 чисел гармонического ряда: ");
        for (int i = 0; i < n; i++)
            System.out.print((double)1/i + " ");
        System.out.println("\nФакториал числа " + n + " : " + fact(n));
        int[] arr3 = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++)
            arr3[i] = random.nextInt(100);
        System.out.println("массив до сортировки: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr3[i] + " ");
        System.out.println("");
        Arrays.sort(arr3);
        System.out.println("массив после сортировки");
        for (int i = 0; i < n; i++)
            System.out.print(arr3[i] + " ");
    }
}