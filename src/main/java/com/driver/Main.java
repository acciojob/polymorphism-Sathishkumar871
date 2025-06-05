package com.driver;

public class Main {
public static void main (String []args){
product p=new product();
  int res1=p.product(3,4);
  System.out.println("product of 3 and 4="+res1);
  int res2=p.product(2,3,4);
  System.out.println("product of 2,3,4="+res2);
  double res3=p.product(2.5,3.5);
  System.out.println("product of 2.5 and 3.5="+res3);

}
}
class Product {
  public int product (int x,int y){
  return x*y;
  }
    public int product (int x,int y,int z){
     return x*y*z;
    }
      public double product (double x,double y){
        return x*y;
      }
    }
