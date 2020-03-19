/*
    Leetcode #225 - https://leetcode.com/problems/implement-stack-using-queues/
*/

class MyStack {
    
    Queue<Integer> queue;
    int length;

    /** Initialize your data structure here. */
    public MyStack() {
        queue = new LinkedList<Integer>();
        length = 0;
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        int i = 0;
        queue.add(x);
        while(i < length) {
            queue.add(queue.poll());
            i++;
        }
        length++;
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return queue.poll();
        
    }
    
    /** Get the top element. */
    public int top() {
        return queue.peek();
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */