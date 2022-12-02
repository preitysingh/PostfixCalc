import java.io.*;

public class Tester {
    public static void main(String[] args) {
        //new Buffered Reader object to read from file
        BufferedReader infix = new BufferedReader(new FileReader("PostfixEquation.rtf"));
        //postfix object
        PostfixCalc postfix = new PostfixCalc();
        //calculating from infix to a postfix equation
        postfix.calculate();
        //printing the answer
        System.out.println(postfix.getAnswer());
        //new BufferedWriter object to write answer into new file
        BufferedWriter post = new BufferedWriter(new FileWriter("PostfixAnswer.rtf"));
        //adding answer to new file
        postfix.getAnswer(post);

    }
}
