package college;
import java.util.*;

public class Book {
	
	String name;
	Author author;
	double price;
	int qty;
	
 public Book(String name,Author author,double price)
 {
	 this.name=name;
	 this.author=author;
	 this.price=price;
 }
 public Book(String name,Author author,double price,int qty)
 {
	 this.name=name;
	 this.author=author;
	 this.price=price;
	 this.qty=qty;
 }
 String getname()
 {
	 return name;
 }
Author getAuthor()
{
	return author;
}
double getprice()
{
	return price;
}
void setprice(double price)
{
	this.price=price;
}
int getqty()
{
	return qty;
}
void setqty(int qty)
{
	this.qty=qty;
}

public String tostring()
{
	return "Book_name="+name+" "+author.tostring()+" "+"Book_price="+price+" "+"Book_qty="+qty;
}
}
