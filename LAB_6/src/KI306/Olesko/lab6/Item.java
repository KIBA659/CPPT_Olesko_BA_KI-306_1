package KI306.Olesko.lab6;

public interface Item extends Comparable<Item>{
	    /**
	     * Get thePrice of the item.
	     *
	     * @return The Price of the item as a double value.
	     */
	    public double getPrice();
	    public void  get();
	    /**
	     * Perform an action Price the item.
	     */
	    public void buy();

	    /**
	     * Print information about the item.
	     */
	    public void print();
}
