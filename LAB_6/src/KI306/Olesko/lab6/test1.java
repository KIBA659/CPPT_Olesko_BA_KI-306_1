package KI306.Olesko.lab6;

/**
 * Клас `test1` представляє предмет типу Item з визначеними назвою та ціною.
 */
public class test1 implements Item {
    private String name;
    private double price;
    public static int nn = 0;

    /**
     * Конструктор класу `test1`, який ініціалізує назву та ціну предмету.
     *
     * @param n Назва предмету.
     * @param p Ціна предмету.
     */
    public test1(String n, double p) {
        this.name = n;
        this.price = p;
        nn+=1;
       
    }

    /**
     * Порівнює цей предмет з іншим предметом за ціною.
     *
     * @param item Інший предмет для порівняння.
     * @return Результат порівняння за ціною.
     */
    @Override
    public int compareTo(Item item) {
        Double p = price;
        return p.compareTo(item.getPrice());
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
        System.out.println("test 1 price: " + price);
    }

    /**
     * Виводить інформацію про цей предмет, включаючи назву та ціну.
     */
    @Override
    public void print() {

    	// System.out.println(""+nn);
    }
	@Override
	public void get() {
		// TODO Auto-generated method stub
		// System.out.println("test1="+nn);
	}
}
