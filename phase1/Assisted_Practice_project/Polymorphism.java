package Assisted_Practice_project;

public class Polymorphism {
	public int sum(int x, int y) 
    { 
        return (x * y); 
    } 
    public int sum(int x, int y, int z) 
    { 
        return (x * y * z); 
    } 
    public double sum(double x, double y) 
    { 
        return (x * y); 
    } 
    public static void main(String args[]) 
    { 
    	Polymorphism s = new Polymorphism(); 
        System.out.println(s.sum(5, 20)); 
        System.out.println(s.sum(10, 10, 15)); 
        System.out.println(s.sum(6.5, 7.5)); 
    } 
}
