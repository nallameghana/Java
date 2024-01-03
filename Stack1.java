//Implementing stack using queues
import java.util.*;
class StackImp {
    Queue<Integer> q = new LinkedList<>();
    void push(int data) {
        q.add(data);
        for(int i = 0; i < q.size() - 1; i++) {
            q.add(q.remove());
        }
    }
    int pop() {
        if(!q.isEmpty()) {
            return q.remove();
        }
        else {
            return -1;
        }
    }
    int peek() {
        if(!q.isEmpty()) {
            return q.peek();
        }
        else {
            return -1;
        }
    }
    int length() {
        return q.size();
    }
    boolean empty() {
        return q.isEmpty();
    }
}
class Stack1 {
    public static void main(String[] args) {
        StackImp s = new StackImp();
        s.push(1);
        s.push(2);
        s.push(3);
        int k = s.pop();
        System.out.println(k);
    }
}
