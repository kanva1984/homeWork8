import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] oneTwoThree = new int[3];
        oneTwoThree[0] = 1;
        oneTwoThree[1] = 2;
        oneTwoThree[2] = 3;

        double[] numbers = {1.57, 7.654, 9.986};

        int[] months = new int[4];
        months[0] = 7;
        months[1] = 8;
        months[2] = 9;
        months[3] = 4;
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] oneTwoThree = new int[3];
        oneTwoThree[0] = 1;
        oneTwoThree[1] = 2;
        oneTwoThree[2] = 3;

        System.out.print(oneTwoThree[0] + ", ");
        System.out.print(oneTwoThree[1] + ", ");
        System.out.print(oneTwoThree[2]);
        System.out.println();

        double[] numbers = {1.57, 7.654, 9.986};
        System.out.print(numbers[0] + ", ");
        System.out.print(numbers[1] + ", ");
        System.out.print(numbers[2]);
        System.out.println();

        int[] months = new int[4];
        months[0] = 7;
        months[1] = 8;
        months[2] = 9;
        months[3] = 4;
        System.out.print(months[0] + ", ");
        System.out.print(months[1] + ", ");
        System.out.print(months[2] + ", ");
        System.out.print(months[3]);
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] oneTwoThree = new int[3];
        oneTwoThree[0] = 1;
        oneTwoThree[1] = 2;
        oneTwoThree[2] = 3;

        System.out.print(oneTwoThree[2] + ", ");
        System.out.print(oneTwoThree[1] + ", ");
        System.out.print(oneTwoThree[0]);

        System.out.println();

        double[] numbers = {1.57, 7.654, 9.986};
        System.out.print(numbers[2] + ", ");
        System.out.print(numbers[1] + ", ");
        System.out.print(numbers[0]);
        System.out.println();

        int[] months = new int[4];
        months[0] = 7;
        months[1] = 8;
        months[2] = 9;
        months[3] = 4;
        System.out.print(months[3] + ", ");
        System.out.print(months[2] + ", ");
        System.out.print(months[1] + ", ");
        System.out.print(months[0]);
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] arr = {1, 2, 3};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i]++;
            }
            System.out.print(arr[i] + " ");
        }
    }

}