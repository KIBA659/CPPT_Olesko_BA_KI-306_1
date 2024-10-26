/**
 * The `Calco` class represents a calculator for the expressiony=ctg(x)/tg(x) .
 * It calculates the expression for a given angle 'x' in degrees.
 * This class handles exceptions and provides detailed explanations for the exceptions.
 *
 * @author Olesko Bohdan
 * @version 1.0
 * @since version 1.0
 */
package KI306.Olesko.lab5;

public class Calco {
    /**
     * Calculates the  y=ctg(x)/tg(x) expression for a given angle in degrees.
     *
     * @param x The angle in degrees for which the expression is calculated.
     * @return The result of the expression calculation.
     * @throws CalcException If an error occurs during the calculation, this exception is thrown
     *                      with an explanation of the reason for the error.
     */
	 public double calculate(int x) throws CalcException {
   	  double y, rad;
         int i=1;
         if(x>360) {
         	for(i=1 ;x>i*360;i++) {}
         	x=x-((i-1)*360);
         }
         rad = Math.toRadians(x);
         try {
             double tanValue = Math.tan(rad);
             y = 1.0 / (tanValue * tanValue);
             if (Double.isNaN(y) || y == Double.NEGATIVE_INFINITY || y == Double.POSITIVE_INFINITY ||rad==Math.PI ||x==0 ||x==360||x==90||x==270) {
                 throw new ArithmeticException();
             }
               
         }
       catch (ArithmeticException e) {
           // create a higher-level exception with an explanation of the reason for the error
           if (rad==Math.PI/2.0 || rad==-Math.PI/2.0){
               throw new CalcException("Exception reason: Illegal value of X = 90");
           }else if (rad==Math.PI || rad==-Math.PI) {
               throw new CalcException("Exception reason: X = 180");
           }else if (rad==Math.PI * 3 / 2 || rad==-Math.PI * 3 / 2) {
               throw new CalcException("Exception reason: X = 270");
           }else if (rad==Math.PI * 2 || rad==-Math.PI * 2) {
               throw new CalcException("Exception reason: X = 360");
           }
           else if (x==0) {
               throw new CalcException("Exception reason: X = 0");
           }
           else {
               throw new CalcException("Unknown reason of the exception during exception calculation");
           }
       }
       return y;
   }
}