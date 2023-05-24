public class Main {
    public static void main(String[] args) {
        task1_2();
        task3();
        task4();
    }

    public static void task1_2() {
        System.out.println("Задача 1 и 2");
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        double[] fractionalNumbers = {1.57, 7.654, 9.986};
        int[] year = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i = 0; i < 3; i++) {
            if (i < 2) {
                System.out.print(numbers[i] + ", ");
            } else {
                System.out.print(numbers[i]);
            }
        }
        System.out.println(" ");
        for (int j = 0; j < 3; j++) {
            if (j < 2) {
                System.out.print(fractionalNumbers[j] + ", ");
            } else {
                System.out.print(fractionalNumbers[j]);
            }
        }
        System.out.println(" ");
        for (int month = 0; month < year.length; month++) {
            if (month < year.length - 1) {
                System.out.print(year[month] + ", ");
            } else {
                System.out.print(year[month]);
            }
        }
        System.out.println(" ");
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        double[] fractionalNumbers = {1.57, 7.654, 9.986};
        int[] year = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i = 0; i < 3; i++) {
            if (i < 2) {
                System.out.print(numbers[i] + ", ");
            } else {
                System.out.print(numbers[i]);
            }
        }
        System.out.println(" ");
        for (int j = 2; j >= 0; j--) {
            if (j > 0) {
                System.out.print(fractionalNumbers[j] + ", ");
            } else {
                System.out.print(fractionalNumbers[j]);
            }
        }
        System.out.println(" ");
        for (int month = year.length-1; month >= 0; month--) {
            if (month > 0) {
                System.out.print(year[month] + ", ");
            } else {
                System.out.print(year[month]);
            }
        }
        System.out.println(" ");

    }

    public static void task4() {
        System.out.println("Задача 4");

    }
}