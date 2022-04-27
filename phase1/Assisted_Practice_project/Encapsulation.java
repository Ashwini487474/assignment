package Assisted_Practice_project;
class StudentDetails{
	private int rollno;
	private String name;
	//getters
	public int getRollno() {
		return rollno;
	}
	
	public String getName() {
		return name;
	}
	
	
	
	//setters
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

public class Encapsulation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDetails stud=new StudentDetails();
		stud.setRollno(25);
		stud.setName("Kumar");
		System.out.println("Rollno="+stud.getRollno());
		System.out.println("Name="+stud.getName());
	}

}
