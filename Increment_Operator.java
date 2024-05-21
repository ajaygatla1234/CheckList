package com.gl;

public class Increment_Operator {

	public static void main(String[] args) {
		int i=-1;
		System.out.println(i);
		i++;
		System.out.println(i);
		i++;
		System.out.println(i);    //when we use increment operator individually, it will increment the value irrespective of pre or post increment
		
		int a=i++;
		System.out.println(a); //1
		System.out.println(a++); //1
		System.out.println(a); //2
		System.out.println(++a); //3
		
		// But when we use the increment operator within an assignment or print statement,
		// the difference between pre-increment and post-increment becomes significant.
	}
}
