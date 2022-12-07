class Test
{
 public static void main(String args[])
 {
  int a[]={50,60,40,70,20,30,10,100,80,90},min;
  min=a[0];
  for(int i=1;i<a.length;i++)
  {
   if(min>a[i])
   {
    min=a[i];
   }
  }
  System.out.println(min);
 }
}