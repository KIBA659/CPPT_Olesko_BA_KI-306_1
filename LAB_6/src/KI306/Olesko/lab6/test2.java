package KI306.Olesko.lab6;

/**
 * Клас `test2` представляє предмет типу Item з визначеними назвою та ціною.
 */
public class test2 implements Item {
    private String name;
    private double price;
    public static int m = 0;
;
    /**
     * Конструктор класу `test2`, який ініціалізує назву та ціну предмету.
     *
     * @param n Назва предмету.
     * @param p Ціна предмету.
     */
    public test2(String n, double p) {
        this.name = n;
        this.price = p;
        m+=1;
    }

    /**
     * Порівнює цей предмет з іншим предметом. Ця реалізація завжди повертає 0, оскільки порівняння за ціною не визначене.
     *
     * @param Інший предмет для порівняння.
     * @return Результат порівняння (завжди 0).
     */
    @Override
    public int compareTo(Item o) {
        return 0;
    }

    /**
     * Отримує ціну цього предмету.
     *
     * @return Ціна предмету.
     */
    @Override
    public double getPrice() {
        return price;
    }

    /**
     * Виконує дію покупки для цього предмету та виводить повідомлення про ціну предмету.
     */
    @Override
    public void buy() {
        System.out.println("test 2 price: " + price);
    }

    /**
     * Виводить інформацію про цей предмет, включаючи назву та ціну.
     */
    @Override
    public void print() {

        //System.out.println(""+n1);
    }
	@Override
	public void get() {
		// TODO Auto-generated method stub
		 //System.out.println("test2="+m);
	}
}
