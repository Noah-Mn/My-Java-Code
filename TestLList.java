package lists;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestLList {

	public static void main(String[] args) {
		BufferedReader din = new BufferedReader(
				new InputStreamReader(System.in));
		String input;
		AList myList = new AList();

		try {
			for (int i = 0; i < 5; i++) {
				// We store Integer Objects in the list
				System.out.print("Enter Integer: ");
				myList.insert(new Integer(Integer.parseInt(din.readLine())));
			}
			myList.print(); // check contents

			// now insert 10 before third element
			myList.setFirst(); // curr at first
			myList.next(); // curr at second
			myList.next(); // curr at third
			myList.insert(new Integer(10));
			// Let's check out the current element
			System.out.printf("Inserted %d\n",
					((Integer) myList.currValue()).intValue());
			// check the updated list
			myList.print();
			// delete the 4th element
			myList.setFirst();
			for (int i = 0; i < 3; i++)
				myList.next();

			Integer x = (Integer) myList.remove();
			System.out.printf("Removed %d from the list\n", x.intValue());
			// check the updated list
			myList.print();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
