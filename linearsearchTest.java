class Test
{
 public static void main(String args[])
 {
  int a[]={50,60,40,70,20,30,10,100,80,90},n=80;
  boolean f=false;
  for(int i=0;i<a.length;i++)
  {
   if(a[i]==n)
   {
    f=true;
    break;
   }
  }
  if(f)
  {
   System.out.println("element found");
  }
  else
  {
   System.out.println("element not found");
  }
 }
}