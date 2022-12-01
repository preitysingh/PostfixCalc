public class Tester {
    public static void main(String[] args) {
        String s = "348*+7+";
        PostfixCalc postfix = new PostfixCalc();
        postfix.setUser(s);
        postfix.calculate();
        System.out.println(postfix.getAnswer());
        System.out.println(postfix.getUser());
    }
}
