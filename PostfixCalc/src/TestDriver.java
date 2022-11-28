import java.util.Scanner;
public class TestDriver {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str;
        PostfixCalc postCalc = new PostfixCalc();

        System.out.println("Enter a expression: ");
        str = s.nextLine();

        System.out.println("postfix evaluation: "+ postCalc.notationChange(str));
    }
}
