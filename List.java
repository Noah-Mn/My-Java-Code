package lists;
public interface List { // List ADT
	public void clear(); // Remove all Objects

	public void insert(Object item); // Insert at curr pos

	public void append(Object item); // Insert at tail

	public Object remove(); // Remove/return curr

	public void setFirst(); // Set to first pos

	public void next(); // Move to next pos

	public void prev(); // Move to prev pos

	public int length(); // Return curr length

	public void setPos(int pos); // Set curr position

	public void setValue(Object val); // Set current value

	public Object currValue(); // Return curr value

	public boolean isEmpty(); // True if empty list

	public boolean isInList(); // True if curr in list

	public void print(); // Print all elements
} // interface List