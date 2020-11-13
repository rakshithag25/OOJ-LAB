import java.util.Scanner;
class Book
{
 String name,author;
 int num_pages;
 float price;
 Book()
 {
  name="";
  author="";
  num_pages=0;
  price=0.0f;
 }
 void Accept()
	
 {
  Scanner in=new Scanner(System.in);
  System.out.println("Enter the name of the book");
  name=in.nextLine();
  System.out.println("Enter the author of the book");
  author=in.nextLine();
  System.out.println("Enter the price of the book");
  price=in.nextFloat();
  System.out.println("Enter the total number of pages of the book");
  num_pages=in.nextInt();
 }
 public String toString()
 {
  return("Name of the book: "+name+" Author: "+author+" Price: "+price+" Pages: "+num_pages);
 }
}
class BookMain
{
 public static void main(String args[])
 {
  int n;
  
  Scanner in=new Scanner(System.in);
  System.out.println("Enter the number of objects");
  n=in.nextInt();
  Book b[]=new Book[n];
  for(int i=0;i<n;i++)
  {
   b[i]=new Book();
   b[i].Accept();
  }
for(int i=0;i<n;i++)
   System.out.println(b[i]);
  }
}