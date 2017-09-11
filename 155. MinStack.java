MinStack.java
//每次遇到min push两次，一次prevMin一次新min，保证pop之后能及时更新min的值
class MinStack {

    /** initialize your data structure here. */
    public MinStack() {
        mStack = new Stack<Integer> ();
        min = Integer.MAX_VALUE;
    }
    
    public void push(int x) {
        if (x <= min){ // note: < =
            mStack.push(min);//push old min
            min = x; //update min
        }
        mStack.push(x);
    }
    
    public void pop() {
        if (mStack.pop() == min) min = mStack.pop(); //if the one poped is the min,update to the previous min and pop again
    }
    
    public int top() {
        return mStack.peek();
    }
    
    public int getMin() {
        return min;
    }
    
    private Stack<Integer> mStack;
    private int min;
    
}

//brute force: sort every time need min
//真是佩服自己能想出这么骚的brute force 击败0.5% 

// import java.util.Vector;
// class MinStack {

//     /** initialize your data structure here. */
//     public MinStack() {
//         mStack = new Stack<Integer> ();
//         minList = new Vector<Integer> ();
//     }
    
//     public void push(int x) {
//         minList.add(x);
//         mStack.push(x);
//     }
    
//     public void pop() {
//         minList.remove(minList.indexOf(mStack.peek()));
//         mStack.pop();
//     }
    
//     public int top() {
//         return mStack.peek();
//     }
    
//     public int getMin() {
//         Collections.sort(minList);
//         return minList.get(0);
//     }
    
 
//     private Stack<Integer> mStack;
//     private Vector<Integer> minList;
    
// }

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */