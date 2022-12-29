package CatDog;

 abstract class Animals {
    static int count;

    Animals() {
        count++;
    }

     void run(int m){

     }

     void swim(int m){

     }

    static void counter() {
        System.out.println("создано собак и кошек: " + count);
    }
}