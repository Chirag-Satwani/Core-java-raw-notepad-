class Test
{
 public static void main(String args[])
 {
  String str1= new String ("HELLO");
  String str2=new String ("hello");
  int x=str1.compareToIgnoreCase(str2);
  System.out.println(x);
 }
}