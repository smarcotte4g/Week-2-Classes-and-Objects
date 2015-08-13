package com.smarcotte.classes_objects;

public class Circle 
{
	// attributes
	private double radius;
	private static final double PI = 3.14159; // Java constant
	
	
	
	// constructors
	public Circle() 
	{
		super();
		radius = 0.0;
	}

	public Circle(double radius) {
		super();
		setRadius(radius);
	}
	
	// behaviors
	public double circumference()
	{
		return PI * 2.0 * radius;
	}
	public double area()
	{
		double number = PI * Math.pow(radius, 2);
		return number;
	}

	public double getRadius() {
		return radius;
	}
	
	// accessors and mutators (get methods and set methods)
	public void setRadius(double radius) 
	{
		if(radius > 0.0)
			this.radius = radius;
		else
			this.radius = 0.0;
	}
	
}
