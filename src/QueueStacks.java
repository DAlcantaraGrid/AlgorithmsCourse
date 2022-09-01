import java.util.Stack;

public class QueueStacks {

        private Stack<Integer> stack1;
        private Stack<Integer> stack2;
        int front;

        public QueueStacks() {
            stack1 = new Stack<>();
            stack2 = new Stack<>();
        }

        public void push(int x) {
            if(stack1.empty()){
                front = x;
            }
            stack1.push(x);
        }

        public int pop() {
            if(stack2.isEmpty()){
                while(!stack1.isEmpty()){
                    stack2.push(stack1.pop());
                }
            }
            return stack2.pop();
        }

        public int peek() {
            if(!stack2.isEmpty()){
                return stack2.peek();
            }
            return front;
        }

        public boolean empty() {
            return stack1.isEmpty() && stack2.isEmpty();
        }

}
