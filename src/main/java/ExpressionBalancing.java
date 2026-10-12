public class ExpressionBalancing {

    public boolean isBalanced(String method){
        SingleArrayStack stack = new SingleArrayStack(method.length());

        for(int i =0; i< method.length(); i++){
            char ch = method.charAt(i);

            if(ch == '(' || ch =='{' || ch=='['){
                stack.push(ch);
            }
            else if(ch == ')' || ch == '}' || ch == ']'){
                if(stack.isEmpty()){
                    return false;
                }
                 char opening = stack.pop();

                if((ch == ')' && opening!='(') || (ch == '}' && opening!='{') || (ch == ']' && opening!='['))
                    return false;
            }
        }

        return stack.isEmpty();
    }
}
