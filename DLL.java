package lab3;

//****************************  DLL.java  *******************************
//generic doubly linked list class

public class DLL<T> {
private DLLNode<T> head, tail;
public DLL() {
head = tail = null;
}
public boolean isEmpty() {
return head == null;
}
public void setToNull() {
head = tail = null;
}
public T firstEl() {
if (head != null)
return head.info;
else return null;
}
public void addToHead(T el) {
if (head != null) {
head = new DLLNode<T>(el,head,null);
head.next.prev = head;
}
else head = tail = new DLLNode<T>(el);
}
public void addToTail(T el) {
if (tail != null) {
tail = new DLLNode<T>(el,null,tail);
tail.prev.next = tail;
}
else head = tail = new DLLNode<T>(el);
}
public T deleteFromHead() {
if (isEmpty()) 
return null;
T el = head.info;
if (head == tail)   // if only one node on the list;
head = tail = null;
else {              // if more than one node in the list;
head = head.next;
head.prev = null;
}
return el;
}
public T deleteFromTail() {
if (isEmpty()) 
return null;
T el = tail.info;
if (head == tail)   // if only one node on the list;
head = tail = null;
else {              // if more than one node in the list;
tail = tail.prev;
tail.next = null;
}
return el;
}
public void printAll() { 
for (DLLNode<T> tmp = head; tmp != null; tmp = tmp.next)
System.out.print(tmp.info + " ");
}
public T find(T el) {
DLLNode<T> tmp;
for (tmp = head; tmp != null && !tmp.info.equals(el); tmp = tmp.next);
if (tmp == null)
return null;
else return tmp.info;
}


public void printReverse() {
	
	for (DLLNode<T> tmp = tail; tmp != null; tmp = tmp.prev)
		System.out.print(tmp.info+ " ");
	
	
}

public void delete7() {
	DLLNode<T> tmp = head;
	DLLNode<T> tmp1;
	int direction;

		System.out.println();
		tmp = head;
		tmp1 = null;
		direction = 0;
		
		if(head == tail) {
		head.next = null;
		head.prev = null;
		tail.next = null;
		tail.prev = null;
		System.out.println("the list is empty");
		return;
		}
	for(int i = 0; i<7 ; i++) {
		
		if(tmp == tail) 
			direction = 1;
			if(tmp == head) 
				direction = 0;
			
		
		
		if(direction == 0) 
		   tmp = tmp.next;
			if(direction == 1)
				tmp = tmp.prev;
			
		}
	
	
	if(tmp == tail) {
		tail = tail.prev;
		tail.next = null;
	}else if(tmp == head) {
		head = head.next;
		head.prev = null;
	}else {
	tmp1 = tmp.next;
	tmp.prev.next = tmp1;
	tmp1.prev = tmp.prev;
	}
	printAll();
	
}




}