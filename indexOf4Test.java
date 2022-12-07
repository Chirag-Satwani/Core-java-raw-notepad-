class Test
{
 public static void main(String args[])
 { 
  String str="indore is in indore";
  int x=0;
  while(x!=-1)
  {
   x=str.indexOf("in",x);
   if(x>=0)
   {
    System.out.println(x);
    x++;
   }
  }
 }
}