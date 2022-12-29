package CatDog;

public class Main {
    public static void main(String[] args) {
        Cat murka = new Cat();
        Cat murka1 = new Cat();
        Dog sharik = new Dog();
        Dog losharik;
        Dog patrick = new Dog();
        Dog satrick = new Dog();

        murka.run(600);
        murka.run(160);
        murka.swim(700);
        sharik.run(150);
        sharik.run(700);
        sharik.swim(80);
        sharik.swim(8);

        Dog.counter();
        Cat.counter();
        Animals.counter();

    }
}