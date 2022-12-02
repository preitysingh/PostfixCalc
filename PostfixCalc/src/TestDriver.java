import jdk.internal.access.JavaIOFileDescriptorAccess;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;

/*public class TestDriver {
    public static void main(String[] args) {
        Scanner s = new Scanner("PostfixEquation.rtf");
        PrintWriter equation = new PrintWriter("PostfixAnswer.rft"); //open the answer file
        PostfixCalc p = new PostfixCalc(); //new postfix object
        String result = p.getAnswer(); //calculations
        equation.println("RESULT = " + result); //(hopefully) print result to answer file
        out.close(); //close the file
       ---------
        PostfixCalc p =  new PostfixCalc();
        BufferedReader infix = new BufferedReader(new FileReader("PostfixEquation.rtf"));
        String equation = infix.readLine();
        //String result;
        System.out.println(" Here is the equation before: " + equation);
        while(equation  != null){
            p.getAnswer(infix);
            System.out.println( " Result = " + p);
        }
    }
}
 */
