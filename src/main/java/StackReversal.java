import java.nio.file.Path;
import java.util.Stack;

public class StackReversal {
    public void reverse(Stack<Integer> stack){
        if(stack.isEmpty()){
            return;
        }

        int top = stack.pop();

        reverse(stack);

        insertAtBottom(stack, top);
    }

    public static void insertAtBottom(Stack<Integer> stack, int value){
        if(stack.isEmpty()){
            stack.push(value);
            return;
        }
        int top = stack.pop();

        insertAtBottom(stack, value);

        stack.push(top);
    }
}
