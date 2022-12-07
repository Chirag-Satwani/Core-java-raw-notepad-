class Test
{
 public static void main(String ags[])
  {
    int a=0,b=1,c,i=1,n=7;
    System.out.print(a+b+"\t");
    while(i<=(n-2))
    {
     c=a+b;
     System.out.print(c+"\t");
     a=b;
     b=c;
     i++;
    }
  }
}