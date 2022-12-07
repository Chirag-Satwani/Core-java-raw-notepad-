class Test
{
 public static void main(String args[])
 {
  int i,j,k,l;
  for(i=1;i<=14;i=i+2)
  {
   if(i>7)
   {
    break;
   }
   for(k=1;k<=i;k=k+2)
   {
    System.out.print(" ");
   }
   for(j=7;j>=i;j--)
   {
    System.out.print("*");
   }
   
   System.out.println();
  }
 }
}