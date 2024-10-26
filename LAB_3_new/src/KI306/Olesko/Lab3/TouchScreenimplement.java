package KI306.Olesko.Lab3;

/**
 * The TouchScreenImplement interface defines methods for controlling the touch screen.
 * Classes that implement this interface must provide functionality
 * to enable and disable the touch screen.
 */

public abstract interface TouchScreenimplement {
	/**
     * Method to enable the touch screen.
     */
	
	void turnOnTouchScreen();
	
	/**
     * Method to disable touch screen.
     */
	
	void turnOffTouchScreen();
	
}
