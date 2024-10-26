/**
 * The `CalcException` class is a custom exception that extends `ArithmeticException`.
 * It is used to represent exceptions related to mathematical calculations.
 *
 * @author Olesko Bohdan
 * @version 1.0
 */
package KI306.Olesko.lab5;

public class CalcException extends ArithmeticException {
    /**
     * Constructs a new `CalcException` with no detail message.
     */
    public CalcException() {
    }

    /**
     * Constructs a new `CalcException` with the specified detail message.
     *
     * @param cause The detail message describing the reason for the exception.
     */
    public CalcException(String cause) {
        super(cause);
    }
}