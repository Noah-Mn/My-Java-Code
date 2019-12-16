public E remove() {
	if(curr.next()== null) 
		return null;
	E it = curr.next().element();
	if(tail==curr.next())
		tail=curr;
	curr.setNext(curr.next().next())
	cnt--;
	return it;
}
public void prev() {
	if(curr==head)
		return;
	link temp=head;
	while(tem.next() != curr)
		temp = temp.next();
	curr=temp;
}