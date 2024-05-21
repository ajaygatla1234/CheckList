package com.gl;

public class StaticVariable {
	
	static String planet; //shared by all the objects 
	
	String name;
	String color;
	
	@Override
	public String toString() {
		
		return "name=" + name + ", color=" + color + ", planet=" + planet;
	}

	public static void main(String[] args) {
		
		StaticVariable.planet="Earth";  //since its a class variable we can access by class name
		
		System.out.println(planet);
		
		StaticVariable cat = new StaticVariable();
		cat.name = "Puffy";
		cat.color = "Ash";
		cat.planet = "Mars"; //or
		StaticVariable.planet="Mars";
		
		System.out.println(cat.toString());
		
		StaticVariable dog = new StaticVariable();
		dog.planet="Jupiter";
		
		System.out.println(cat.toString());
		System.out.println(dog.toString());
	}
}
