package checklist_1;

public class VariableConventions {
	
	static int j;

	public static void main(String[] args) {
		

	//Primitive Variables
		int a=1; 
		int $=1, $y=7;
		int _=6, _b=3, a_y=9, _$=9;
		// variables can start with 'alphabets' or '_' or '$'
		//'$' can be used independently but '_' must have any combination
		int letters=1;
		int _6=7; 56t=7, t56=8; //variables and classes cannot start with numbers but can have number combinations


	//Non-Primitive Variables

		VariableConventions obj = new VariableConventions(); //obj is Non-Primitive reference Variable

		String[] s1=new String[5];  //s1 is Non-Primitive reference Variable

		int[] i = new int[5]; //i is Non-Primitive reference Variable
		
	// about ++ operations
		int count=7;
		int num=++count+5;           //num = 8+5
		int num1=count++ + count+5;  //num1 = 7 + 8 + 5
		System.out.println(count++); // 8
		System.out.println(count);   // 9
		
	//accessing global variable
		
		System.out.println(j); // output = 0, even it is not initialized it gives default value
		
		int i;
		System.out.println(i); //error - local variable does't have default values

	}

}
