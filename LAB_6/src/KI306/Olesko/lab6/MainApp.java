package KI306.Olesko.lab6;

/**
 * Головний клас програми, який демонструє використання класу ShoppingCenter
 * для зберігання та роботи з предметами (Item) у торговому центрі.
 */
public class MainApp {

    /**
     * Головний метод програми, де демонструється використання класу ShoppingCenter
     * та робота з предметами.
     *
     * @param args Аргументи командного рядка (не використовуються в цій програмі).
     */
    public static void main(String[] args) {
        // Створення екземпляра класу ShoppingCenter з можливістю зберігання предметів типу Item
        ShoppingCenter<? super Item> test0 = new ShoppingCenter<>();
        // Додавання різних предметів у торговий центр
        test0.putItem(new test2("Список Шинлера", 100.83));
        test0.putItem(new test2("Atomic Habits", 2.95));
        test0.putItem(new test2("Atomic Habits", 2.95));
        test0.putItem(new test2("Atomic Habits", 2.95));
        test0.putItem(new test2("Atomic Habits", 2.95));
        System.out.println(test1.nn);
        System.out.println(test2.m);
        // Отримання предмету за індексом та виклик методів print та buy
        //Item item = test0.getItem(2);
        //item.print();

        //item = test0.getItem(3);
        //item.buy();

        // Отримання найдорощого предмету та виведення інформації про нього
        Item max = test0.getMax();
        System.out.println("\nThe price item in the bedside table is:");
        max.print();
    }
}

