package Assisted_Practice_project;

public class Class_and_Object {
	String name; 
    String breed; 
    int age; 
    String color; 
    public Class_and_Object(String name, String breed, int age, String color) {
		// TODO Auto-generated constructor stub
    	 this.name = name; 
         this.breed = breed; 
         this.age = age; 
         this.color = color;
	} 
    public String getName() 
    { 
        return name; 
    } 
    public String getBreed() 
    { 
        return breed; 
    } 
    public int getAge() 
    { 
        return age; 
    } 
    public String getColor() 
    { 
        return color; 
    } 
    @Override
    public String toString() 
    { 
        return("Hi my name is "+ this.getName()+ ".\nMy breed,age and color are " + this.getBreed()+", " + this.getAge()+ ", and " + this.getColor() + "."); 
    } 
    public static void main(String[] args) 
    { 
    	Class_and_Object scott = new Class_and_Object("manu","Papillon",10,"white");
        System.out.println(scott.toString()); 
    } 

}
