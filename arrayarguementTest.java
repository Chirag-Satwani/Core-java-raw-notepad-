class Test
{
 void sort(int a[])
 {
  int i,j,temp;
  for(i=0;i<a.length-1;i++)
  {
   for(j=(i+1);j<a.length;j++)
   {
    if(a[i]>a[j])
    {
     temp=a[i];
     a[i]=a[j];
     a[j]=temp;
    }
   }
  }
  for(i=0;i<a.length;i++)
  {
   System.out.print(a[i]+" ");
  }
  System.out.println();
 }
 public static void main(String args[])
 {
  Test t1=new Test();
  int x[]={30,20,50,10,40};
  int y[]={5,4,1,7,9,10,8,6,2,3};
  t1.sort(x);
  t1.sort(y);
 }
}