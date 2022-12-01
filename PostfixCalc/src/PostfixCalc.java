
public class PostfixCalc <E> {
    private String user = "348*+7+";
    private Stack<Integer> postStack = new Stack<>();
    private int answer;
    private String error = null;

    public void PostfixCalc(){
    }

    public void calculate() {
        String[] use = user.split("", -1);
        for (String test : use) {
            try {
                postStack.push(Integer.parseInt(test));
            } catch (NumberFormatException e) {
                if (!(postStack.getTop().getChild() == null || postStack.isEmpty())){
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

    public void setUser(String user) { // setting the user string;
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

