class Test
{
 public static void main(String args[])
 {
  String str="This is a class of java";
  int ch=0,sp=0;
  for(int i=0;i<str.length();i++)
  {
   if(str.charAt(i)==' ')
   {
    sp++;
   }
   else
   {
    ch++;
   }
  }
  System.out.println("number of char="+ch);
  System.out.println("number of spaces="+sp);
 }
}