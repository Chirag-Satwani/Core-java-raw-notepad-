class Test
{
 public static void main(String args[])
 {
  String str=new String("Hello");
  char ch;
  for(int i=0;i<str.length();i++)
  {
   ch=str.charAt(i);
   if(ch>='a'&& ch<='z')
   {
    System.out.print((char)(ch-32));
   }
   else
   {
    System.out.print(ch);
   }
  }
 }
}