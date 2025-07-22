package com.miscellaneous.geeks.linkedList.groupe.sorted;

public class B5Clone {
	
	private SNode head;
	
	private void cloneList() {
		SNode curr = head;
		while(curr != null) {
			SNode next = curr.getNext();
			curr.setNext(new SNode(curr.getData()));
			curr.getNext().setNext(next);
			curr = next;
		}
		curr = head;
		while(curr!= null) {
			curr.getNext().setRandom(curr.getRandom() == null ? null : curr.getRandom().getNext());
			curr=curr.getNext().getNext();
		}
		SNode cloneHead = head.getNext();
		SNode clone = cloneHead;
		curr = head;
		while(curr != null) {
			curr.setNext(curr.getNext() != null ? curr.getNext().getNext() : null);
			clone.setNext(clone.getNext() != null ? clone.getNext().getNext() : null);
			clone = clone.getNext();
			curr = curr.getNext();
		}
		print(cloneHead);
	}

	public static void main(String[] args) {
		
		B5Clone ll = new B5Clone();
		SNode one = ll.insert(1);
		SNode two = ll.insert(2);
		SNode three = ll.insert(3);
		
		one.setRandom(two);
		two.setRandom(one);
		three.setRandom(two);
		ll.print(one);
		ll.cloneList();
	}
	
	private SNode insert(int data) {
		SNode temp = new SNode(data);
		if(head == null) {
			head = temp;
		} else {
			SNode curr = head;
			while(curr.getNext() != null) {
				curr = curr.getNext();
			}
			curr.setNext(temp);
		}
		return temp;
	}
	
	private void print(SNode cloneHead) {
		if(cloneHead == null) {
			System.out.println("Linked list is empty");
		} else {
			SNode temp = cloneHead;
			while(temp != null) {
				System.out.print(" --> " + temp.getData());
				temp = temp.getNext();
			}
			System.out.println();
			
			temp = cloneHead;
			
			while(temp != null) {
				SNode random = temp, prev=temp;
				System.out.print(" --> " + prev.getData());
				while(random.getRandom() != prev && random.getRandom() != null) {
					prev = random;
					random = random.getRandom();
					System.out.print(" --> " + random.getData());
				}
				temp = temp.getNext();
				System.out.println();
			}
		}
		System.out.println("+++++++++++++++");
	}
	
}
