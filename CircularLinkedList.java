public class CircularLinkedList{
	private Link head;
	private Link tail;
	protected Link curr;
	private int length;

//inserting an element
public void insert(Object it){
	Link temp = new Link(it);
	if(head == null)
		head = temp;
	tail.next() = temp;

	tail = temp;
	tail.next() = head;
}

//Finding an element in the list
public boolean isInList(int searchValue){
	Link curr = head;

	if(head == null){
		return false;
	}else{
		do{
			if(curr.value() == searchValue){
				return true;
			}
			curr = curr.next();
		}while (curr != head);
		return false;
	}

}

//Removing an element from the list
public void remove(int val){
	Link curr = head;

	if(head != null){
		if(curr.value() == val){
			head = head.next();
			tail.next() = head;
		}else{
			do{
				Link next = curr.next();
				if(curr.value() == val){
					curr.next() = next.next();
					break;
				}
				curr = curr.next();
			}while(curr != head);
		}
	}

}

//getting the size of the list
public int getSize(){
	return length;
}	

}