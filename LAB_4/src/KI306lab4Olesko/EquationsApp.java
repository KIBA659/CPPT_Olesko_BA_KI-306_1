/**
 * EquationsApp is a simple Java application for calculating the result of the equation
 * y = ctg(x)/tg(x) and writing the result to a file specified by the user.
 *
 * This program prompts the user for a file name, an integer value for 'x', and then
 * calculates the result of the equation based on the value of 'x'. It handles exceptions
 * related to file operations and equation calculation.
 *
 * @author Olesko Name
 * @version 1.0
 */
package KI306lab4Olesko;

import java.util.Scanner;
import java.io.*;
import static java.lang.System.out;

 class EquationsApp {

    public static void main(String[] args) {
        out.print("Enter file name: ");
        Scanner in = new Scanner(System.in);
        String fName = in.nextLine();

        PrintWriter fout = null;

        try {
            fout = new PrintWriter(new File(fName));

            Equations eq = new Equations();

            out.print("Enter X: ");
            int x = in.nextInt();

            double result = eq.calculate(x);
            System.out.println(result);
            fout.print(result);
            fout.flush();
            fout.close();
        } catch (FileNotFoundException ex) {
            out.print("Exception reason: File not found");
        } catch (CalcException ex) {
            out.print(ex.getMessage());
        } finally {
            if (fout != null) {
                fout.close();
            }
        }
    }
}
