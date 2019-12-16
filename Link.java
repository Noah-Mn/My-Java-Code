package lists;


public class Link { // A singly linked list node
	private Object element; // Object for this node
	private Link next; // Pointer to next node

	Link(Object it, Link nextval) // Constructor
	{
		element = it;
		next = nextval;
	}

	Link(Link nextval) {
		next = nextval;
	} // Constructor

	Link next() {
		return next;
	}

	Link setNext(Link nextval) {
		return next = nextval;
	}

	Object element() {
		return element;
	}

	Object setElement(Object it) {
		return element = it;
	}
}
