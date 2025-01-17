package day41_collection.list;

import java.util.Stack;

public class StackObjects {
    public static void main(String[] args) {

       Stack<Character> stack = new Stack<>();
       //add() ----> push()
        //remove()----> pop() --gives you the element which is at tthe TOP
        //get() -----> peak()--gives you the elemenet which is at the TOP

        stack.push('a');
        stack.push('b');
        stack.push('c');
        stack.push('d');
        System.out.println(stack);

        System.out.println("what is at the top? - " + stack.peek());

        stack.pop();
        System.out.println(stack);//removes last one

        System.out.println("what is at the top? - " + stack.peek());

        System.out.println(stack.pop());
        System.out.println("what is at the top? - " + stack.peek());


        System.out.println(stack);
        stack.remove(0);
        System.out.println(stack);
        stack.add('k');
        System.out.println(stack);

    }
}
