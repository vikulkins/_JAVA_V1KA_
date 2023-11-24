import java.util.Scanner;
public class Main {
    public static int numberSum(int num) {
        if (num%10 == num) return num;
        else return num%10+numberSum(num/10);
    }
    public static void fromMintoMax(int min, int max) {
        if (min==max) System.out.println(max);
        else{
            System.out.println(min);
            min++;
            fromMintoMax(min,max);
        }
    }
    public static void fromMaxtoMin(int max, int min) {
        if (max==min) System.out.println(min);
        else{
            System.out.println(max);
            max--;
            fromMaxtoMin(max,min);
        }
    }
    public static int reverseNum(int num) {
        if (num%10 == num) return num;
        else {
            int rem = num%10;
            int len = String.valueOf(num).length();
            num = num/10;
            return rem*(int)Math.pow(10,len-1) + reverseNum(num);
        }
    }

    public static void main(String[] args) {
        int n = 0;
        int k = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число для подсчета суммы цифр: ");
        if (sc.hasNextInt()) //проверка считывания целого числа с клавы
            n = sc.nextInt(); //считывание числа из потока
        System.out.println("Сумма цифр числа: " + numberSum(n));
        System.out.println("Введите первое число: ");
        if (sc.hasNextInt()) n = sc.nextInt();
        System.out.println("Введите второе число: ");
        if (sc.hasNextInt()) k = sc.nextInt();
        if(n>k) fromMaxtoMin(n,k);
        else if(n<k) fromMintoMax(n,k);
        else System.out.println("Введите норм числа пж: ");
        System.out.println("Введите число для реверса: ");
        if (sc.hasNextInt()) n = sc.nextInt();
        System.out.println(reverseNum(n));
    }
}
