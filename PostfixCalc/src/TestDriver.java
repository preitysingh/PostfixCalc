//what preity is currently working on
import java.io.*;
public class TestDriver {
    public static void main(String[] args) throws IOException {
        //new Buffered Reader object to read from file
        BufferedReader infix = new BufferedReader(new FileReader("PostfixEquation.rtf"));
        //postfix object
        PostfixCalc postfix = new PostfixCalc();
        //calculating from infix to a postfix equation
        postfix.calculate(String.valueOf(infix));
        //printing the answer
        System.out.println(postfix.getAnswer());
        //new BufferedWriter object to write answer into new file
        String post = String.valueOf(new FileWriter("PostfixAnswer.rtf"));
        //adding answer to new file
        post = postfix.getAnswer().toString();

    }
}


