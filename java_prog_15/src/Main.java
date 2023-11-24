public class Main {
    public static void main(String[] args) {
        Exception1 object1 = new Exception1();
        System.out.println(" //task1 "); //Qwerty 0 1.2
        object1.exceptionDemo();
        Exception2 object2 = new Exception2();
        System.out.println(" //task2 ");
        object2.exceptionDemo();
        Exception3 object3 = new Exception3();
        System.out.println(" //task3 ");
        object3.exceptionDemo();
        Exception4 object4 = new Exception4();
        System.out.println(" //task4 ");
        System.out.println(" функция закомментирована так как вызывает исключение (потому что так надо) ");
        //object4.exceptionDemo();
        Exception5 object5 = new Exception5();
        System.out.println(" //task5 ");
        object5.getDetails(null);
        Exception6 object6 = new Exception6();
        System.out.println(" //task6 ");
        object6.printMessage(null);
        Exception7 object7 = new Exception7();
        System.out.println(" //task7.1 ");
        object7.getKey();
        Exception77 object77 = new Exception77();
        System.out.println(" //task7.2 ");
        object77.getKey();
        Exception8 object8 = new Exception8();
        System.out.println(" //task8 ");
        object8.getKey();
    }
}