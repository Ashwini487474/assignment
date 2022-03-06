package Assisted_Practice_project;

public class ConstructorsTypes {

	public static void main(String[] args) {
	new constructor();
	new constructor("josh");
	new constructor("RAM",'A');
	new constructor("RAJ",'B',120);

	}

}

class constructor{
	public constructor() {                         //Zero constructor
		System.out.println("disply constructor");
	}
	public constructor(String name) {              //Parameterized constructor
		System.out.println("the User name :"+name);
	}
	// constructor Overloaded 
	public constructor(String name,char sec) {       
		System.out.println("Employee name :"+name+"\nsection :"+sec);
	}
	public constructor(String name,char sec,int id) {
		System.out.println("Employee name :"+name+"\nsection :"+sec+"\nEmploy ID :"+id);
	}
}
