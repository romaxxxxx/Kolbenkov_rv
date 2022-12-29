package CatDog;

public class Dog extends Animals {
    static int count;

    Dog() {
        count++;
    }

    @Override
    void run(int m) {
        String message;
        if (m > 500) {
            message = "Собака может пробежать не более 500м";
        } else {
            message = "Бобик пробежал " + m + " метров";
        }
        System.out.println(message);
    }

    @Override
    void swim(int m) {
        String message;
        if (m > 10) {
            message = "Собака может проплыть только 10м";
        } else {
            message = "Бобик проплыл " + m + " метров";
        }
        System.out.println(message);
    }

    static void counter() {
        System.out.println("Создано собак " + count);
    }
}