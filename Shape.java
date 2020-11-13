import java.util.Scanner;
import java.lang.Math;
abstract class Shape{
int a1;
int a2;
Shape(int a,int b){
a1=a;
a2=b;
}
abstract void printArea();
}
class Rectangle extends Shape{
Rectangle(int a,int b){
super(a,b);
}
void printArea(){
System.out.println("Area of rectngle is:"+(a1*a2));
}}
class Triangle extends Shape{
Triangle(int a,int b){
super(a,b);
}
void printArea(){
System.out.println("Area of triangle is:"+((a1*a2)/2));
}}
class Circle extends Shape{
Circle(int a,int b){
super(a,a);
}
void printArea(){
System.out.printf("The area of circle is: %.2f",(a1*Math.PI*a1));
}}
class ShapeMain{
public static void main(String args[]){
Rectangle r=new Rectangle(15,10);
Triangle t=new Triangle(20,9);
Circle c=new Circle(4,0);
r.printArea();
t.printArea();
c.printArea();
}
}
