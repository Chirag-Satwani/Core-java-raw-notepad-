class Test
{
 public static void main(String args[])
 {
   int n=371,r,sum=0,temp=n;
   while(n!=0)
   {
    r=n%10;
    sum=sum+(r*r*r);
    n=n/10;
   }
   if(sum==temp)
   {
    System.out.println("armstrong no.");
   }
   else
   {
    System.out.println("non armstrong");   
   }
  }
}
   
    