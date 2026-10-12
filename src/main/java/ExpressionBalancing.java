public class ExpressionBalancing {

    public boolean isBalanced(String exp){
        SingleArrayStack stack = new SingleArrayStack(exp.length());

        for(int i =0; i< exp.length(); i++){
            char ch = exp.charAt(i);

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
