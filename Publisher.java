import java.util.*;
class Publisher
{
    String publisher_name;
    String agency_name;
    Publisher(String publisher_name,String agency_name)
    {
        this.publisher_name=publisher_name;
        this.agency_name=agency_name;
    }
}
class Book extends Publisher
{
    String book_name;
    String author;
    int price;
    String type;
    Book(String publisher_name,String agency_name,String book_name,String author,int price,String type)
    {
        super(publisher_name,agency_name);
        this.book_name=book_name;
        this.author=author;
        this.price=price;
        this.type=type;
    }
}
class Literature extends Book{
    Literature(String publisher_name,String agency_name,String book_name,String author,int price,String type)
    {
        super(publisher_name,agency_name,book_name,author,price,type);
    }
    void display1()
    {
        System.out.println("publisher name:"+this.publisher_name);
        System.out.println("Agency name:"+this.agency_name);
        System.out.println("Book name:"+this.book_name);
        System.out.println("Author:"+this.author);
        System.out.println("Price:"+this.price);
        System.out.println("Type:"+this.type);
    }
}
class Fiction extends Book{
   Fiction(String publisher_name,String agency_name,String book_name,String author,int price,String type)
    {
        super(publisher_name,agency_name,book_name,author,price,type);
    }
    void display2()
    {
        System.out.println("publisher name:"+this.publisher_name);
        System.out.println("Agency name:"+this.agency_name);
        System.out.println("Book name:"+this.book_name);
        System.out.println("Author:"+this.author);
        System.out.println("Price:"+this.price);
        System.out.println("Type:"+this.type);
    }
}
class Category
{
  public static void main(String args[])
  {  
   Scanner sc=new Scanner(System.in);
   Scanner s=new Scanner(System.in);
   
   System.out.println("Enter the details of book:");
   System.out.println("Name of publisher:");
   String publisher_name1=s.nextLine();
   System.out.println("Name of agency :");
   String agency_name1=s.nextLine();
   System.out.println("Name of book :");
   String book_name1=s.nextLine();
   System.out.println("Name of author :");
   String author1=s.nextLine();
   System.out.println("Price:");
   int price1=sc.nextInt();
   System.out.println("Type(fiction/literature):");
   String type1=s.nextLine();
   Literature obj1=new Literature(publisher_name1,agency_name1,book_name1,author1,price1,type1);
   System.out.println("-------------------------------------------");
  
   System.out.println("Enter the details of book:");
   System.out.println("Name of publisher:");
   String publisher_name2=s.nextLine();
   System.out.println("Name of agency :");
   String agency_name2=s.nextLine();
   System.out.println("Name of book :");
   String book_name2=s.nextLine();
   System.out.println("Name of author :");
   String author2=s.nextLine();
   System.out.println("Price:");
   int price2=sc.nextInt();
   System.out.println("Type(fiction/literature):");
   String type2=s.nextLine();
   Fiction obj2=new Fiction(publisher_name2,agency_name2,book_name2,author2,price2,type2);
   System.out.println("------------------------------------------");
   obj1.display1();
   System.out.println("----------------------------------------");
   obj2.display2();
  }
} 

 
