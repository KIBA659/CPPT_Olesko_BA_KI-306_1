/**
 * The `App` class is the main entry point of the application for calculating and
 * storing the result of a mathematical equation, as well as reading it from files.
 * It demonstrates the usage of the `Calco` and `FileUtils` classes.
 *
 * @author Olesko Bohdan
 * @version 1.0
 */
package KI306.Olesko.lab5;

import java.io.*;
import java.util.*;

public class App {

    public static void main(String[] args) {
        Calco equation = new Calco();
        FileUtils fileUtils = new FileUtils();
        double result;
        double fileResult;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter X: ");
        try {
            int x = scanner.nextInt();
            result = equation.calculate(x);
            System.out.println("Result is " + result);

            // Write the result to a text file
            fileUtils.writeResTxt("E:\\REPOS\\CPPT_LABS\\LAB_5/textRes.txt", result);

            // Write the result to a binary file
            fileUtils.writeResBin("E:\\REPOS\\CPPT_LABS\\LAB_5/binRes.bin", result);

            // Read the result from the binary file
            fileResult = fileUtils.readResBin("E:\\REPOS\\CPPT_LABS\\LAB_5/binRes.bin");
            System.out.println("Result from binary file is: " + fileResult);

            // Read the result from the text file
            fileResult = fileUtils.readResTxt("E:\\REPOS\\CPPT_LABS\\LAB_5/textRes.txt");
            System.out.println("Result from txt file is: " + fileResult);
        } catch (CalcException e) {
            System.out.println(e.getMessage());
        }
    }
}
