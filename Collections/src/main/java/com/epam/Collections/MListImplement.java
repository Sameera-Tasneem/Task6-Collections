package com.epam.Collections;


public class MListImplement {

	
public static void main(String[] args) {
		
// TODO Auto-generated method stub
		
	MList<String> ml = new MList<String>();
		
	//adding elements
		
	ml.add("Archie");
		
	ml.add("Madeleme");
		
	ml.add("Cami");
		
	ml.add("Betty");
		
	ml.add("Dona");
		
	ml.add("Jug");
		
		
	//printing list and size
		
	System.out.println("List is "+ ml);
		
	System.out.println("Size of the list is " +ml.size());
		
		
	//removing an element
		
	ml.remove(4);
		
	System.out.println("After removing, the list is "+ml);
		
	System.out.println("Size of the list is " + ml.size());
		
		
	//fetching the element by index
		
	System.out.println(ml.getElementByIndex(4));

	
	}


}
