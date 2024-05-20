package checklist_1;

public class DataConversions {

	public static void main(String[] args) {


		//type conversion from String to Primitive data
		String strName="78.9";
		float floatNum=Float.parseFloat(strName);
		System.out.println(floatNum);


		//type conversion from Primitive data to String
		int num=878;
		String strName1=String.valueOf(num);
		System.out.println(strName1);

		//type conversion from Primitive data to String
		float num1= 8.07f;
		String str=Float.toString(num1);
		System.out.println(str);

		
		//converting int to String, Extracting the string by charAt() method and adding them
		int i=1;
		int j=2;
		String s1=String.valueOf(i);
		String s2=String.valueOf(j);
		char c1=s1.charAt(0);
		char c2=s2.charAt(0);
		s2.charAt(0);
		System.out.println(s1.charAt(0));  // output = 1
		System.out.println(s2.charAt(0));  // output = 2
		System.out.println(s1.charAt(0)+s2.charAt(0));  // output = 99 (because Ascii values are getting added)
		System.out.println(c1+c2);  // output = 99 (because Ascii values are getting added)
		int a=Integer.parseInt(s1);
		int b=Integer.parseInt(s2);
		System.out.println(a+b); // use parseInt() method to extract and add
		
		
	
	}

}
