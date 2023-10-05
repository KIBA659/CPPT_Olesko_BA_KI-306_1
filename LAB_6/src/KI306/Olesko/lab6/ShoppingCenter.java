package KI306.Olesko.lab6;

import java.util.ArrayList;

/**
 * Клас ShoppingCenter представляє торговий центр для зберігання та роботи з предметами (Item).
 *
 * @param <T> Тип предметів, які можна зберігати у торговому центрі.
 */
public class ShoppingCenter<T extends Item> {

    private ArrayList<T> array;

    /**
     * Конструктор класу ShoppingCenter, який ініціалізує пустий список для зберігання предметів.
     */
    public ShoppingCenter() {
        array = new ArrayList<T>();
    }

    /**
     * Додає предмет до торгового центру та виводить повідомлення про додавання предмету.
     *
     * @param item Предмет, який додається до торгового центру.
     */
    public void putItem(T item) {
        array.add(item);
        //System.out.print("Item added: ");
        item.print();
    }

    /**
     * Отримує предмет з торгового центру за індексом.
     *
     * @param i Індекс предмету, який потрібно отримати.
     * @return Предмет, який знаходиться за вказаним індексом.
     */
    public T getItem(int i) {
        return array.get(i);
    }

    /**
     * Знаходить та повертає найважчий предмет у торговому центру.
     *
     * @return Найважчий предмет у торговому центру або null, якщо список порожній.
     */
    public T getMax() {
        if (!array.isEmpty()) {
            T max = array.get(0);
            for (int i = 1; i < array.size(); i++) {
                if (array.get(i).compareTo(max) > 0) {
                    max = array.get(i);
                }
            }
            return max;
        }
        return null;
    }

    /**
     * Використовує предмет у торговому центру за індексом та викликає метод buy() цього предмету.
     *
     * @param i Індекс предмету, який потрібно використати.
     */
    public void useItem(int i) {
        array.get(i).buy();
    }
    public void get(T item) {
    	 item.print();
		// TODO Auto-generated method stub
    	//System.out.println("test2=");
	}
}
