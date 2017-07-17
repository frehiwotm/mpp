package labs.lab10.prob4;

public class GenericStack <T> {
	
	private T[] stackArray;
	private int size;
	private int top;
	
	public GenericStack(int size) {
		this.size = size;
		stackArray = (T[])new Object[size];
		top = -1;
	}
	
	public boolean isEmpty() {
		
		return top == -1;
	}
	
	public int size() {
		return top +1;
	}
	
	public void push(T t) {
		
		if(size() == size) {
			System.out.println("Sorry but the stack is full.");
			return;
		}
		top++;
		stackArray[top] = t;
		
	}
	
	public T pop() {
		if(isEmpty()) {
			System.out.println("Sorry but the stack is empty.");
			return null;
		}
		
		T value = stackArray[top];
		top--;
		
		return value;
	}
	
	public T peek() {
		
		if(isEmpty()) {
			System.out.println("Sorry but the stack is empty.");
			return null;
		}
		
		return stackArray[top];
	}
	

	public static void main(String[] args) {
		/*
		 * Integer type.
		 */
		GenericStack<Integer> theStack = new GenericStack<>(10);
		
		System.out.println("----------------");
		System.out.println("| Integer type |");
		System.out.println("----------------");
		
		
		System.out.println("\n##### PUSH operation... #####\n");
		theStack.push(10);
		theStack.push(17);
		theStack.push(2);
		
        System.out.println("The stack contains " + theStack.size() + " elements.");
		

        System.out.println("\n\n##### PEEK operation... #####\n");
        System.out.println("The top elements of the stack is : " + theStack.peek());
		
		System.out.println("\n\n##### POP operation... #####\n");
		System.out.println("Element " + theStack.pop() + " poped from the stack. Stack size is :" + theStack.size());
		System.out.println("Element " + theStack.pop() + " poped from the stack. Stack size is :" + theStack.size());
		System.out.println("Element " + theStack.pop() + " poped from the stack. Stack size is :" + theStack.size());
		
		
		System.out.println("\n\n##### Size check... #####\n");
		System.out.println("The stack contains " + theStack.size() + " elements.");
		
		/*
		 * String type.
		 */
		GenericStack<String> strStack = new GenericStack<>(10);
		
		System.out.println("\n---------------");
		System.out.println("| String type |");
		System.out.println("---------------");
		
		
		System.out.println("\n##### PUSH operation... #####\n");
		strStack.push("Fre");
		strStack.push("Hiwot");
		strStack.push("Melak");
		
		
		System.out.println("The stack contains " + strStack.size() + " elements.");
		

        System.out.println("\n\n##### PEEK operation... #####\n");
        System.out.println("The top elements of the stack is : " + strStack.peek());
		
		System.out.println("\n\n##### POP operation... #####\n");
		System.out.println("Element " + strStack.pop() + " poped from the stack. Stack size is :" + strStack.size());
		System.out.println("Element " + strStack.pop() + " poped from the stack. Stack size is :" + strStack.size());
		System.out.println("Element " + strStack.pop() + " poped from the stack. Stack size is :" + strStack.size());
		
		
		System.out.println("\n\n##### Size check... #####\n");
		System.out.println("The stack contains " + strStack.size() + " elements.");
	}
}
