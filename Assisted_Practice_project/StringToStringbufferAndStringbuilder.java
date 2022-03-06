package Assisted_Practice_project;

public class StringToStringbufferAndStringbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "String";
		// String conversion to StringBuffer 
		StringBuffer str1 = new StringBuffer(str);
		str1.reverse();
		System.out.println("String To StringBuffer");
		System.out.println(str+" Reverse to "+str1);
		//String conversion to StringBuilder
		StringBuilder str2 = new StringBuilder(str);
		str2.append("  stringBuffer and StringBuilder");
		System.out.println("String To StringBuilder");
		System.out.println(str2);

	}

}
