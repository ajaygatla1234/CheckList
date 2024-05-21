package com.gl;

import java.util.Arrays;

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
		
		int arr[]=new int[5];
		int j=0;
		arr[j++]=1;  //j is at 0 only because, since j++ is post-increment operator, first it will perform the operation & then it will increment
		System.out.println(Arrays.toString(arr));
		
		int arr1[]=new int[5];
		int j1=0;
		arr1[++j1]=1;  //here first, j1 is incremented & perform the operation
		System.out.println(Arrays.toString(arr1));
	}
}
