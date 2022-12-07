class Test
{
 public static void main(String args[])
 {
  int n=9,i,x=n/2;
  boolean f=true;
  for(i=2;i<=x;i++)
  {
   if(n%i==0)
   {
    f=false;
    break;
   }
  }
  if(f)
  {
   System.out.println("prime");
  }
  else
  {
   System.out.println("non prime");
  }
 }
}