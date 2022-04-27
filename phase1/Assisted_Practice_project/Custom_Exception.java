package Assisted_Practice_project;

public class Custom_Exception {
	class My_Exception extends Exception 
	{ 
	    public My_Exception(String s) 
	    { 
	        super(s); 
	    } 
	} 
	public static void main(String[] args) {
        try
        { 
            throw new Exception("temp"); 
        } 
        catch (Exception ex) 
        { 
            System.out.println("Caught"); 
            System.out.println(ex.getMessage()); 
        } 
	}

}
