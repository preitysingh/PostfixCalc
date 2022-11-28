
public class PostfixCalc <E> {
    Stack stack = new Stack();
    private String user = "";
    Stack<Integer> postStack = new Stack<>();
    private int answer;
    private String error = null;


    public void PostfixCalc(){ // empty constructor
    }

    public void PostfixCalc(String user){
        String[] use = user.split("",-1);
        for(String test: use) {
            try {
                user = user + postStack.push(Integer.parseInt(test));
            } catch(NumberFormatException e){
                if (!postStack.isEmpty() || postStack.getTop().getChild() == null) {
                    int first = postStack.pop();
                    int second = postStack.pop();
                    switch (test){
                        case "+": postStack.push(first + second); break;
                        case "*": postStack.push(first * second); break;
                        case "-": postStack.push(first - second); break;
                        case "/":
                            if( second != 0){
                                postStack.push(first/second);
                            } else {
                                error = "divide by 0 error";
                            } break;
                        default: {};
                    }
                } else {
                    error = "error"; break;
                }
            }
        } answer = postStack.peek();
    }

    public void setUser(){ // setting the user string;
        this.user = user;
    }

    public String getUser(){
        return user;
    }

    public String getAnswer(){
        if (error != null){
            return error;
        } else {
            return Integer.toString(answer);
        }
    }

=======
public class PostfixCalc {
    public PostfixCalc(){
        //empty constructor
    }
    public String answer(String str) {


        return str;
    }

