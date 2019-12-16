package lists;
class AList implements List { // Array-based list
	private static final int defaultSize = 10;
	private int msize; // Maximum size of list
	private int numInList; // Actual list size
	private int curr; // Position of curr
	private Object[] listArray; // Array holding list

	AList() {
		setup(defaultSize);
	} // Constructor

	AList(int sz) {
		setup(sz);
	} // Constructor

	private void setup(int sz) { // Do initializations
		msize = sz;
		numInList = curr = 0;
		listArray = new Object[sz]; // Create listArray
	}

	public void clear() // Remove all Objects from list
	{
		numInList = curr = 0;
	} // Simply reinitialize values

	public void insert(Object it) { // Insert at curr pos
		assert (numInList < msize) : "List is full";
		assert ((curr >= 0) && (curr <= numInList)) : "Bad value for curr";
		for (int i = numInList; i > curr; i--)
			// Shift up
			listArray[i] = listArray[i - 1];
		listArray[curr] = it;
		numInList++; // Increment list size
	}

	public void append(Object it) { // Insert at tail
		assert (numInList < msize) : "List is full";
		listArray[numInList++] = it; // Increment list size
	}

	public Object remove() { // Remove and return Object
		assert !isEmpty() : "No delete: list empty";
		assert isInList() : "No current element";
		Object it = listArray[curr]; // Hold removed Object
		for (int i = curr; i < numInList - 1; i++)
			// Shift down
			listArray[i] = listArray[i + 1];
		numInList--; // Decrement list size
		return it;
	}

	public void setFirst() {
		curr = 0;
	} // Set to first

	public void prev() {
		curr--;
	} // Move curr to prev

	public void next() {
		curr++;
	} // Move curr to next

	public int length() {
		return numInList;
	}

	public void setPos(int pos) {
		curr = pos;
	}

	public boolean isEmpty() {
		return numInList == 0;
	}

	public void setValue(Object it) { // Set current value
		assert isInList() : "No current element";
		listArray[curr] = it;
	}

	public boolean isInList() // True if curr within list
	{
		return (curr >= 0) && (curr < numInList);
	}

	@Override
	public Object currValue() {
		assert isInList() : "Invalid list position.";
		return listArray[curr];
	}

	@Override
	public void print() {
		for (setFirst(); isInList(); next()) {
			System.out.printf("%s ", listArray[curr].toString());
		}
		System.out.println();
	}
} // Array-based list implementation