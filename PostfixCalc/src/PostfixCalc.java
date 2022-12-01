
public class PostfixCalc <E> {
    private String user = "";
    private Stack<Integer> postStack = new Stack<>();
    private int answer;
    private String error = null;

    public void PostFix(){

    }

    public void PostfixCalc(String user) {
        this.user = user;
    }

    public void calculate(String user) {
        String[] use = user.split("", -1);
        for (String test : use) {
            try {
                user = user + postStack.push(Integer.parseInt(test));
            } catch (NumberFormatException e) {
                if (!postStack.isEmpty() || postStack.getTop().getChild() == null) {
                    System.out.println(postStack);
                    Node<Integer> curr = postStack.getTop();
                    while (!(curr.getChild() == null)){
                        System.out.println(curr.getChild());
                    }
                    int first = postStack.pop();
                    int second = postStack.pop();
                    switch (test) {
                        case "+":
                            postStack.push(first + second);
                            break;
                        case "*":
                            postStack.push(first * second);
                            break;
                        case "-":
                            postStack.push(first - second);
                            break;
                        case "/":
                            if (second != 0) {
                                postStack.push(first / second);
                            } else {
                                error = "divide by 0 error";
                            }
                            break;
                        default: {
                        }
                        ;
                    }
                } else {
                    error = "error";
                    break;
                }
            }
        }
        answer = postStack.peek();
    }

    public void setUser() { // setting the user string;
        this.user = user;
    }

    public String getUser() {
        return user;
    }

    public String getAnswer() {
        if (error != null) {
            return error;
        } else {
            return Integer.toString(answer);
        }
    }
}

