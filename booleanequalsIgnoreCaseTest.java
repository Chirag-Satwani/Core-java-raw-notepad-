class Test
{
 public static void main(String args[])
 {
  String str1=new String("Hello");
  String str2=new String("hello");
  if(str1.equalsIgnoreCase(str2))
  {
   System.out.println("same");
  }
  else
  {
   System.out.println("different");
  }
 }
}