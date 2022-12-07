class Test
{
 public static void main(String args[])
 {
  int i,j,k;
  for(i=1;i<=5;i++)
  {
   for(k=5;k>i;k--)
   {
    System.out.print(" ");
   }
   for(j=1;j<=(2*i-1);j++)
   {
    System.out.print("*");
   }
   System.out.println();
  }
 }
}