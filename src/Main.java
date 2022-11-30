public class Main {
    public static void main(String[] args) {
        checkSumSign();
        String line = "ываыва";
        int j = 6;
        printLine(line, j);
        int a = 5;
        System.out.println(a + " " + "Положительное? " + boolMethod(a));
        int year = 200;
        System.out.println(year+" "+ "Високосный год? "+ " "+boolLeapYear(year));
    }

    private static boolean boolLeapYear(int year) {
        boolean b = false;
        if (year % 400 == 0) {
            b = true;
        } else if (year % 100 == 0) {
            b = false;
        } else if (year % 4 == 0) {
            b = true;
        }
        return b;
    }

    private static boolean boolMethod(int a) {
        boolean b = false;
        if (a > 0) {
            b = true;
        } else if (a < 0) {
            b = false;
        }
        return b;
    }

    static void checkSumSign() {
        int a = -5, b = 1;
        if ((a + b) > 0 | (a + b) == 0) {
            System.out.println("Сумма чисел "+ a + " и " + b + " положительная");
        } else if ((a + b) < 0) {
            System.out.println("Сумма чисел "+ a + " и " + b + " отрицательная");
        }
    }

    static void printLine(String line, int j) {
        for (int i = 0; i < j; i++) {
            System.out.println(line);
        }
    }
}
