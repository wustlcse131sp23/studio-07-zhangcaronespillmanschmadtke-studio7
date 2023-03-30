package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {
	
	private double[] rectangleInformation = new double[4];
	
	
	
	public Rectangle(double[] array)
	{	
		StdDraw.filledRectangle(array[0], array[1], array[2], array[3]);
	}
	
	public void getLengthAndWidth(double[] array)
	{
		double length = array[2] * 2;
		double width = array[3] * 2;
		String answer = "The length of the rectangle is " + length + "and the width is " + width + ".";
		System.out.println(answer);
	}
	
	public double getArea(double[] array)
	{
		double area = (array[2]*2) * (array[3]*2);
		return area;
	}
	
	public double getPerimeter(double[] array)
	{
		double perimeter = (array[2] * 4) + (array[3] * 4);
		return perimeter;
 	}
	
	public Boolean squareTest(double[] array)
	{
		boolean squareStatus = false;
		if (array[2] == array[3])
		{
			squareStatus = true;
		}
		return squareStatus;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
