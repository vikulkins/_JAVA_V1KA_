import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Введите количество элементов массива: ");
        int count = in.nextInt();
        Integer[] integers = new Integer[count];
        for (int i = 0; i < count; i++){
            System.out.printf(i+1+" элемент: ");
            integers[i]=in.nextInt();
        }

        MinMax<Integer> minmax = new MinMax<>(integers);
        System.out.println("минимальный элемент: " + minmax.min());
        System.out.println("максимальный элемент: " + minmax.max());

        System.out.println("результат сложения чисел 1 и 2: " + Calculator.sum(1,2));
        System.out.println("результат сложения чисел 13.1 и 2.1: " + Calculator.sum(13.1,2.1));

        System.out.println("результат вычитания чисел 1 и 2: " + Calculator.sub(1,2));
        System.out.println("результат вычитания чисел 10.9 и 3: " + Calculator.sub(10.9,3));

        System.out.println("результат умножения чисел 10 и 10: " + Calculator.mult(10,10));
        System.out.println("результат умножения чисел 1.3 и 2: " + Calculator.mult(1.3,2));

        System.out.println("результат деления чисел 4 и 2: " + Calculator.div(4,2));
        System.out.println("результат деления чисел 1.25 и 0.25: " + Calculator.div(1.25,0.25));

        Integer[][] data1 = {{1, 2}, {3, 4}};
        Integer[][] data2 = {{5, 6}, {7, 8}};

        Matrix<Integer> matrix1 = new Matrix<>(data1);
        Matrix<Integer> matrix2 = new Matrix<>(data2);

        Matrix<Integer> sumResult = matrix1.add(matrix2);
        Matrix<Integer> subResult = matrix1.subtract(matrix2);
        Matrix<Integer> mulResult = matrix1.multiply(matrix2);

        System.out.println("Матрица 1:");
        System.out.println(matrix1);
        System.out.println("Матрица 2:");
        System.out.println(matrix2);
        System.out.println("результат сложения:");
        System.out.println(sumResult);
        System.out.println("результат вычитания:");
        System.out.println(subResult);
        System.out.println("результат умножения:");
        System.out.println(mulResult);


    }
}