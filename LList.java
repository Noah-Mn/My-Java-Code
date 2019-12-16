package lists;

public class LList implements List { // Linked list
	private Link head; // Pointer to list header
	private Link tail; // Pointer to last Object in list
	protected Link curr; // Position of current Object

	LList(int sz) {
		setup();
	} // Constructor

	LList() {
		setup();
	} // Constructor

	private void setup() // allocates leaf node
	{
		tail = head = curr = new Link(null);
	}

	public void setFirst() {
		curr = head;
	}

	public void next() {
		if (curr != null)
			curr = curr.next();
	}

	public void prev() { // Move to previous position
		Link temp = head;
		if ((curr == null) || (curr == head)) // No prev
		{
			curr = null;
			return;
		} // so return
		while ((temp != null) && (temp.next() != curr))
			temp = temp.next();
		curr = temp;
	}

	public Object currValue() { // Return current Object
		if (!isInList() || this.isEmpty())
			return null;
		return curr.next().element();
	}

	public boolean isEmpty() // True if list is empty
	{
		return head.next() == null;
	}

	// Insert Object at current position
	public void insert(Object it) {
		assert curr != null : "No current element";
		curr.setNext(new Link(it, curr.next()));
		if (tail == curr) // Appended new Object
			tail = curr.next();
	}

	public Object remove() { // Remove/return curr Object
		if (!isInList() || this.isEmpty())
			return null;
		Object it = curr.next().element(); // Remember value
		if (tail == curr.next())
			tail = curr; // Set tail
		curr.setNext(curr.next().next()); // Cut from list
		return it; // Return value
	}

	@Override
	public void clear() {// Your assignment

	}

	@Override
	public void append(Object item) {// Your assignment

	}

	@Override
	public int length() {// Your assignment
		return 0;
	}

	@Override
	public void setPos(int pos) {// Your Assignment

	}

	@Override
	public void setValue(Object val) {
		assert isInList() : "Invalid current position";
		curr.setElement(val);
	}

	@Override
	public boolean isInList() {
		if (curr != null)
			return curr != head;
		return false;
	}

	@Override
	public void print() {// Your Assignment

	}
} // Linked list class
