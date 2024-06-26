class product
{
 String p_code;
 String p_name;
 int price;
 product(String c,String n,int p)
 {
  p_code=c;
  p_name=n;
  price=p;
 }
 void display()
 {
  System.out.println(p_code+" "+p_name+" "+price);
 }
 }
 class products
 {
  public static void main(String args[])
  {
   product p1=new product("p09","refrigerator",45000);
   product p2=new product("p13","air conditioner",34000);
   product p3=new product("p01","television",12000);
   p1.display();
   p2.display();
   p3.display();
   if(p1.price<p2.price && p1.price<p3.price)
  {
   System.out.println(p1.price+" is the lowest price");
  }
  else if(p2.price<p3.price && p2.price<p1.price)
  {
   System.out.println(p2.price+" is the lowest price");
  }
  else
  {
   System.out.println(p3.price+" is the lowest price");
  }
 }
   }
