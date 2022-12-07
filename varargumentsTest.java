class Test
{
 void add(int ...a)
 {
  int sum=0;
  for(int i=0; i< a.length;i++)
  {
   sum=sum+a[i];
  }
  System.out.println(sum);
 }
 public static void main(String args[])
 {
  Test t1= new Test();
  t1.add(10,20,30,40,50);
  t1.add(1,2,3,4,5,6,7,8,9,10);
 }
}