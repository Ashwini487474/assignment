package Assisted_Practice_project;
class My_Exception extends Exception{
	   String str1;
	   My_Exception(String str2) {
		str1=str2;
	   }
	   public String toString(){ 
		return ("MyException Occurred: "+str1) ;
	   }
	}

public class Exception_Handlers {

	public static void main(String[] args) {
		try{
			System.out.println("Starting of try block");
			// I'm throwing the custom exception using throw
			throw new My_Exception("This is My Message");
		}
		catch(My_Exception exp){
			System.out.println("Catch Block") ;
			System.out.println(exp) ;
		}


	}

}
