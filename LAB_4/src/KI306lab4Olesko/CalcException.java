package KI306lab4Olesko;
/**
 * The Equations class provides a method to calculate the result of the equation
 * y = ctg^2(x) based on the input angle 'x' (in degrees).
 *
 * This class handles exceptions related to invalid input values and provides
 * a method for calculating the square of the cotangent (ctg) of the given angle 'x'.
 * It also includes logic to normalize 'x' if it exceeds 360 degrees.
 * 
 * @author Olesko Bohdan
 * @version 1.0
 */
public class CalcException extends ArithmeticException {
    public CalcException() {}
    public CalcException(String cause) {
        super(cause);
    }
}

class Equations {
	/**
     * Calculate the square of the cotangent (ctg^2) of the given angle 'x' (in degrees).
     *
     * @param x The input angle in degrees.
     * @return The square of the cotangent of 'x'.
     * @throws CalcException If 'x' is an invalid value for cotangent calculation.
     */
    public double calculate(int x) throws CalcException {
        double y, rad;
        int i=1;
        if(x>360) {
        	for(i=1 ;x<i*360;i++) {}
        	x=x-(i*360);
        }
        rad = Math.toRadians(x);
        try {
            double tanValue = Math.tan(rad);
            if (rad==Math.PI ||x==0 ||x==360||x==90||x==270||x>10) {
                throw new ArithmeticException();
            }
            y = 1.0 / (tanValue * tanValue);
        } catch (ArithmeticException ex) {
                throw new CalcException("Exception reason: Illegal value of X " +x+ " for cotangent calculation");
        }
        return y;
    }
}
