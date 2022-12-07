class Test
{
 public static void main(String args[])
 {
  int a=2020;
  if( a%400 ==0)
  {
    System.out.println("leap year");
  }
  else if( a%100 ==0)
  {
    System.out.println("non leap year");
  }
  else if( a%4==0)
  {
    System.out.println("leap year");
  }
  else
  {
    System.out.println("non leap Year");
  }
 }
}