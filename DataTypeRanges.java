package checklist_1;

import java.util.Scanner;

public class DataTypeRanges {

	public static void main(String[] args) {


		System.out.println(Byte.MIN_VALUE);        // -128 to 127
		System.out.println(Byte.MAX_VALUE);        
		System.out.println(Short.MIN_VALUE);       // -32768 to 32767
		System.out.println(Short.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);     // -2147483648 to 2147483647
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);        // -9223372036854775808 to 9223372036854775807
		System.out.println(Long.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);       
		System.out.println(Float.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Character.MIN_VALUE);   // space to null
		System.out.println(Character.MAX_VALUE);   // o/p='\uffff'=unicode value: its a non printable character, so follow below
		System.out.println((int) Character.MAX_VALUE); // This will print 65535 = ascii no.

		//System.out.println(Boolean.MIN_VALUE);   //there will be no MIN & MAX values

		//giving short value to byte
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter value");
		byte num=scanner.nextByte(); //if we gave more than the range, Input mismatch exception occurs

		
		System.out.println((int) Character.MAX_VALUE); // This will print 65535
	}

}
