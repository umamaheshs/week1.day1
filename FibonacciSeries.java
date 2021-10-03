package week1.day1;

public class FibonacciSeries {
	/*
	 * Goal: To find Fibonacci Series for a given range
	 * 
	 * input(range): 8 output: 0, 1, 1, 2, 3, 5, 8, 13
	 * 
	 * Shortcuts: 1) Print : type: syso, followed by: ctrl + space + enter 2) To
	 * create a 'for' loop: type 'for', followed by ctrl + space + down arrow +
	 * enter
	 * 
	 * What are my learnings from this code? 1) 2) 3)
	 * 1) declaration and initialization
	 * 2) usage of for loop for iteration
	 * 3) to assign value (add)
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range = 8;
		int first = 0;
		int next = 1;
		System.out.println(first);
		for (int i = 1; i < range; i++) {
			int add = first + next;
			System.out.println(add);
			first = next;
			next = add;

	}
	}
}
