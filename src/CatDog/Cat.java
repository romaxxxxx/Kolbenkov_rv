package CatDog;

public class Cat extends Animals {
    static int count;

    Cat() {
        count++;
    }

    @Override
    void run(int m) {
        String message;
        if (m > 200) {
            message = "Кошка может пробежать не более 200м";
        } else {
            message = "Барсик пробежал " + m + " метров";
        }
        System.out.println(message);
    }

    @Override
    void swim(int m) {
        System.out.println("Кошка не умеет плавать");
    }

    static void counter() {
        System.out.println("Создано кошек " + count);
    }
}