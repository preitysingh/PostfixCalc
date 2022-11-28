import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
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
    }
}
