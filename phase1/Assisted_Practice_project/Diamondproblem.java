package Assisted_Practice_project;
interface First 
{  
    default void view() 
    { 
        System.out.println("First excute"); 
    } 
} 
interface Second 
{  
    default void view() 
    { 
        System.out.println("Second excute"); 
    } 
}  
public class Diamondproblem implements First, Second 
{  
    public void view() 
    {  
        First.super.view(); 
        Second.super.view(); 
    } 
    public static void main(String args[]) 
    { 
    	Diamondproblem ob = new Diamondproblem(); 
        ob.view(); 
    } 
}


