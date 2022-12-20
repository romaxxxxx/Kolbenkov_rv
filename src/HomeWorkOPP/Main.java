package HomeWorkOPP;

public class Main {
    public static void main(String[] args) {
        Employee[] Emp = new Employee[5];
        Employee employee1 = new Employee("Упоротов Василий Маркович", "Уборщик", "ffff@mail.ru", "+724544", 15000, 55);
        Employee employee2 = new Employee("Вторец Петр Петрович", "Швея", "ssss@mail.ru", "+784544", 17000, 45);
        Employee employee3 = new Employee("Скоморох Василий Михалыч", "Повелитель мух", "nnnn@mail.ru", "+735544", 19000, 45);
        Employee employee4 = new Employee("Мойдодырки Михал Маркович", "Коловрат", "pppp@mail.ru", "+734544", 45000, 15);
        Employee employee5 = new Employee("Чичваркин ВасилийМаркович", "Тамада", "eeee@mail.ru", "+734844", 75000, 10);
        Emp[0] = employee1;
        Emp[1] = employee2;
        Emp[2] = employee3;
        Emp[3] = employee4;
        Emp[4] = employee5;

        for(int i = 0; i < 5; ++i) {
            if (Emp[i].getAge() >= 40) {
                Emp[i].view();
            }
        }

    }
}
