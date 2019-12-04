package sampleswing;
import java.util.*;
class poly
{
	float pi=3.14f;
public void area(int c)
{
	System.out.println("Area of square: "+c*c);
}
public void area(int l,int b)
{
	System.out.println("Area of rectangle: "+l*b);
}
public void area(float b,int h)
{
	System.out.println("Area of triangle: "+b*h);
}
public void area(float r)
{
	System.out.println("Area of circle: "+pi*(r*r));
}


public static void main(String[] args)
{
poly pp=new poly();

pp.area(10,6);
pp.area(12.5f,8);
pp.area(5);
pp.area(4.0f);
}

}
