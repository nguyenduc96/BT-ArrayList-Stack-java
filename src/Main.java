import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        for (Object s: stack) {
            System.out.println(s);
        }
        System.out.println("=========================================");
        int size = stack.size();
        Stack<Integer> newStack = new Stack<>();
        for (int i = 0; i < size; i++) {
            newStack.push(stack.pop());
        }
        for (Object s: newStack) {
            System.out.println(s);
        }
    }
}
