import java.io.*;
import java.util.Scanner;
<<<<<<< Updated upstream
public class TestDriver {
    public static void main(String[] args) {
        Scanner s = new Scanner("PostfixEquation.rtf");
//        String str;
//        PostfixCalc postfixNotation = new PostfixCalc();
//
//        System.out.println("Enter a expression: ");
//        str = s.nextLine();
//
//        postfixNotation = get.str(setUser);
//        getUser;
//
//        System.out.println("postfix evaluation: "+ postfixNotation.answer(str));
        PostfixCalc p = new PostfixCalc();

        while (s.hasNext()) // while not eof...
        {
            // read equation line in text file
            String postfix = s.nextLine();
            System.out.println("   Here is the Postfix expression:\t" + postfix);
            //convert to post fix notation
            String result = p.answer(postfix);
            System.out.println("   Result = " + result + "\n");
        }
        // loop post condition: at eof
        s.close();
=======

public class TestDriver {
    public static void main(String[] args) throws IOException {
        PostfixCalc p = new PostfixCalc();
        BufferedReader br = new BufferedReader(new FileReader("PostfixEquation.rtf"));
        String equation = br.readLine();
        //String result;
        System.out.println(" Here is the equation before: " + equation);
        while(equation  != null){
            p = equation.getAnswer();
            System.out.println( " Result = " + p);
        }


//        answerLine.write(result);
//        answerLine.close(); //closes the file

//        Scanner s = new Scanner("PostfixEquation.rtf");
//        PostfixCalc p = new PostfixCalc();
//
//        while (s.hasNext())
//        {
//            // read equation line in text file
//            String postfix = s.next();
//            System.out.println("   Here is the Postfix expression:\t" + postfix);
//            //convert to post fix notation
//            String result = p.getAnswer();
//            System.out.println("   Result = " + result + "\n");
//        }
//        // loop post condition: at eof
//        s.close();


>>>>>>> Stashed changes
    }
}
